package wcrpg.model.combat;

public class InitiativeCheckValue {

  private Combatant combatant;
  private int value;
  
  public InitiativeCheckValue(Combatant combatant, int value) {
    this.combatant = combatant;
    this.value = value;
  }
  
  public int getValue() {
    return value;
  }
  
  public Combatant getCombatant() {
    return combatant;
  }
}
