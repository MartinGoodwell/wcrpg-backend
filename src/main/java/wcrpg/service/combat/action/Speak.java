package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

/**
 * Any member of a ship's crew may choose to speak to any other crewmember during a combat phase;<br/>
 * this is a free action.<br/>
 * Combatants may speak to one another at any time for any reason,<br/>
 * though what they might want to speak about is totally up to the players and the GM.<br/>
 * It is important that communicator and receiver speak the same language,<br/>
 * to make sure all messages sent between them are understood clearly;<br/>
 * this is particularly important when insulting an opponent.<br/>
 * A Translate Check is required when communicating parties do not speak the same language;<br/>
 * failure of the Check prevents them from speaking meaningfully to one another.
 */
public class Speak extends CrewAction {

  public Speak() {
    super(CrewActionType.FREE);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }

}
