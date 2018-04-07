package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class UseSensors extends CrewAction {

  public UseSensors() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
