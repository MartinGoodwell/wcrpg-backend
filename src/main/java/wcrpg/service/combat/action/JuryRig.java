package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class JuryRig extends CrewAction {

  public JuryRig() {
    super(CrewActionType.FULL);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
