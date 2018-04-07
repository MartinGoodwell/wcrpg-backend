package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

public class LaunchOrRetrieveSmallCraft extends CrewAction {

  public LaunchOrRetrieveSmallCraft() {
    super(CrewActionType.FREE); //TODO check what "special action" in the rulebook means. Assuming FREE for now.
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
