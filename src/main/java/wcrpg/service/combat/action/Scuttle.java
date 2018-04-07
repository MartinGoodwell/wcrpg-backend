package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class Scuttle extends CrewAction {

  public Scuttle() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }

}
