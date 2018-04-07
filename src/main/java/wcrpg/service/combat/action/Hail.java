package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class Hail extends CrewAction {
  
  public Hail() {
    super(CrewActionType.STANDARD);
  }

  @Override
  public boolean executeAction() {
    return false;
  }
}
