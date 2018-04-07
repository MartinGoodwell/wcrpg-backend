package wcrpg.service.combat.action;

public class Ready extends CrewAction {

  public Ready(String condition, CrewAction action) {
    super(action.getActionType());
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }

}
