package wcrpg.service.combat.action;

import wcrpg.model.Pilot;
import wcrpg.model.combat.CrewActionType;

public abstract class CrewAction implements CombatAction {

  private CrewActionType actionType;
  
  public CrewAction(CrewActionType actionType) {
    this.actionType = actionType;
  }

  public CrewActionType getActionType() {
    return actionType;
  }
  
  public boolean rally(Pilot crewmember) {
    return true;
  }

  public int getCost() {
    return actionType.getCost();
  }
}
