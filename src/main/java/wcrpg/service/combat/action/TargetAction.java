package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class TargetAction extends CrewAction {

  public TargetAction() {
    super(CrewActionType.STANDARD);
  }

  @Override
  public boolean executeAction() {
    return false;
  }
}
