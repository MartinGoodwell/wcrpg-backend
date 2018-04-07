package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

/**
 *A captain may choose to rally Shaken crewmembers; this is a standard action.<br/>
 *This action requires the captain to make a successful Leadership Check;<br/>
 *the result of the Check must also succeed against the target's Willpower Save.<br/>
 *If successful, the affected crewmember is no longer Shaken; any associated penalties end immediately.<br/>
 *A captain may attempt to rally multiple crewmembers simultaneously. The Leadership Check has critical potential;<br/>
 *in the event of a critical success, the crewmember(s) will no longer be Shaken regardless of whether or not<br/>
 *the specific result would have been sufficient for a successful Check and immediately experience<br/>
 *the same benefits as a successful Inspire action (see below).
 */
public class Rally extends CrewAction {

  public Rally() {
    super(CrewActionType.STANDARD);
  }

  @Override
  public boolean executeAction() {
    return false;
  }

}
