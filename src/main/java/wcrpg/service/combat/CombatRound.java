package wcrpg.service.combat;

import java.util.List;

import wcrpg.model.Pilot;
import wcrpg.model.Vehicle;
import wcrpg.service.combat.action.CrewAction;

public class CombatRound {

  private int actionBudget;
  private List<Vehicle> pcVehicles;
  private List<Vehicle> npcVehicles;
  
  public CombatRound(int actionBudget) {
    this.actionBudget = actionBudget;
  }

  
  public void performAction(Pilot pilot, CrewAction action) {
    if (notEnoughBudget(action)) {
      return;
    }
    
    
    
  }

  private boolean notEnoughBudget(CrewAction action) {
    return actionBudget - action.getCost() < 0;
  }
}
