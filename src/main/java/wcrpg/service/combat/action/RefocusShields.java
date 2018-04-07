package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class RefocusShields extends CrewAction {

  public RefocusShields() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
