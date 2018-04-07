package wcrpg.service.combat.action;

import wcrpg.model.Skill;
import wcrpg.model.combat.CrewActionType;

/**
 * A captain may order a crewmember to use any one of their natural abilities<br/>
 * or make Skill Checks as a standard action during a combat round;<br/>
 * the captain simply declares which ability/Skill the crewmember is to use<br/>
 * and a target if appropriate.<br/>
 * This is a general "catch-all" action that may be used for any purpose<br/>
 * not explicitly mentioned elsewhere.
 */
public class UseSkillOrAbility extends CrewAction {

  public UseSkillOrAbility(Skill skill) {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
  
}
