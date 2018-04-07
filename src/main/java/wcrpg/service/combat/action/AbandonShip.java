package wcrpg.service.combat.action;

import wcrpg.model.combat.CrewActionType;

/**
 * A ship's captain can order the crew to abandon ship;<br/>
 * this is a special action that may be initiated as a standard action<br/>
 * but takes a number of rounds to complete.<br/>
 * Usually this order is only given if the ship becomes critically damaged<br/>
 * with little hope of recovery and the lives of the crew would be placed in<br/>
 * greater danger by remaining aboard.<br/>
 * Once an order to abandon ship is given, it cannot be belayed.<br/>
 * Crewmembers launch from emergency escape vehicles (EEVs) in order to get away from their vessel;<br/>
 * each EEV carries one crewmember.<br/>
 * 1d% EEV are launched each round until all crewmembers have left the ship or all pods have been expended.<br/>
 * Once launched, they can be targeted by enemy combatants for one round using the same statistics as Heavy Ordnance.<br/>
 * The ship may continue combat operations (eventually taking an undermanned penalty) until<br/>
 * enough EEVs have been launched that only the ship's PC officers are left aboard;<br/>
 * they may do as they wish from there.
 */
public class AbandonShip extends CrewAction {

  public AbandonShip() {
    super(CrewActionType.STANDARD);
  }
  
  @Override
  public boolean executeAction() {
    return false;
  }
}
