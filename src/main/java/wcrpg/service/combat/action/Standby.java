package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

/**
 * A ship's captain may to order the crew to stand-by as a standard action.<br/>
 * By doing so, they declare that the ship will do nothing during the course of<br/>
 * that action phase; game-play proceeds to the ship's next action phase or to the<br/>
 * next combatant's first action phase as applicable.<br/>
 * There will probably be few occasions in combat where a captain decides to just<br/>
 * sit back and watch but sometimes it may simply be necessary...
 */
public class Standby extends CrewAction {

  public Standby() {
    super(CrewActionType.STANDARD);
  }
  
  public boolean executeAction() {
    return false;
  };
}
