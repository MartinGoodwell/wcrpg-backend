package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class ChangeAlertStatus extends CrewAction {

  public ChangeAlertStatus() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
