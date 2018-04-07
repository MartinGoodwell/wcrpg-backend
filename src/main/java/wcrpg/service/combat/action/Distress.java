package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class Distress extends CrewAction {

  public Distress() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
