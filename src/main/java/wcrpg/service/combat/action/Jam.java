package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class Jam extends CrewAction {

  public Jam() {
    super(CrewActionType.STANDARD);
  }

  @Override
  public boolean executeAction() {
    return false;
  }

}
