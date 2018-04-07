package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class Inspire extends CrewAction {

  public Inspire() {
    super(CrewActionType.STANDARD);
  }

  @Override
  public boolean executeAction() {
    return false;
  }
}
