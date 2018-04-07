package wcrpg.service.combat;

import java.util.ArrayList;
import java.util.List;

import wcrpg.model.combat.CombatGroup;
import wcrpg.model.combat.Combatant;
import wcrpg.model.combat.InitiativeCheckValue;
import wcrpg.service.CheckService;

public class Combat {

  private CheckService checkService = CheckService.INSTANCE;

  private CombatGroup pcCombatants;
  private CombatGroup npcCombatants;
  private List<Combatant> battleOrder;

  public Combat(CombatGroup pcCombatants, CombatGroup npcCombatants) {
    this.pcCombatants = pcCombatants;
    this.npcCombatants = pcCombatants;
  }

  public void execute() {

    determineSurpriseCombatRound();
    determineCompositeStrengthIndex();
    determineBattleOrder();
    determineInitialRanges();

    boolean combatResolved = false;
    do {
      declareCombatActions();
      resolveCombatActions();
      resolveCombat();
    } while (!combatResolved);

  }

  private void determineSurpriseCombatRound() {

  }

  /**
   * <p>
   * The GM should total up the strength indices of all combatants in a given
   * group;<br/>
   * this amount is the group’s initial composite strength index.
   * </p>
   * <p>
   * The composite strength index is used as a way of gauging the current
   * strength<br/>
   * of one group over another and helps to determine the behavior of NPCs.
   * </p>
   */
  private void determineCompositeStrengthIndex() {
    // this is done in combatGroup.getCompositeStrengthIndex().
  }

  /**
   * <p>
   * Determining the order of battle is done by conducting an Initiative
   * Check.<br/>
   * 2d10 is rolled for each combatant.
   * </p>
   * <p>
   * The result is added to the combatant's Initiative rating;<br/>
   * the final sum is the combatant's Initiative Check Value.
   * </p>
   * <p>
   * The GM will find the combatant with the highest Initiative Check Value
   * next;<br/>
   * this combatant goes first in the order of battle.<br/>
   * Combatants with subsequently lower scores should be placed next in the order
   * of battle;<br/>
   * the combatant with the lowest Initiative Check Value will be placed last.
   * </p>
   */
  public void determineBattleOrder() {
    int nrEntries = pcCombatants.getCombatants().size() + npcCombatants.getCombatants().size() + 1;
    List<InitiativeCheckValue> tempOrder = new ArrayList<>(nrEntries);

    // TODO create a list of InitialCheckValue objects that holds combatant and
    // initialCheckValue.
    // after determining the icv for all combatants, put them into the battleOrder
    // array.
    // the InitialCheckValue list will not be needed anymore after that.
    // if ICV is needed more often than just in step two of a combat, we'll it in a
    // different way
    tempOrder.addAll(doInitiativeCheckForCombatGroup(pcCombatants));
    tempOrder.addAll(doInitiativeCheckForCombatGroup(npcCombatants));

    battleOrder = orderByInitiativeCheck(tempOrder);
  }

  private List<InitiativeCheckValue> doInitiativeCheckForCombatGroup(CombatGroup combatGroup) {
    List<InitiativeCheckValue> icv = new ArrayList<>();

    for (Combatant c : combatGroup.getCombatants()) {
      int diceRoll = checkService.rollDice(2, 10);
      int initiative = c.getInitiative();
      int initiativeCheckValue = diceRoll + initiative;

      icv.add(new InitiativeCheckValue(c, initiativeCheckValue));
    }

    return icv;
  }

  private List<Combatant> orderByInitiativeCheck(List<InitiativeCheckValue> tempOrder) {
    List<InitiativeCheckValue> orderedList = new ArrayList<>();
    
    for (InitiativeCheckValue icv : tempOrder) {
      if (orderedList.isEmpty()) {
        orderedList.add(icv);
      } else {
        boolean added = false;
        int idx = 0;
        for (InitiativeCheckValue orderedIcv : orderedList) {
          if (icv.getValue() < orderedIcv.getValue()) {
            orderedList.add(idx, icv);
            added = true;
            break;
          } else {
            ++idx;
          }
        }
        
        if (!added) {
          orderedList.add(icv);
        }
      }
    }
    
    List<Combatant> result = new ArrayList<>();
    for (InitiativeCheckValue icv : orderedList) {
      result.add(icv.getCombatant());
    }
   
    return result;
  }

  public void determineInitialRanges() {
    
  }

  public void declareCombatActions() {

  }

  public void resolveCombatActions() {

  }

  public void resolveCombat() {

  }
}
