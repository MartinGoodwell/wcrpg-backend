package wcrpg.repo;

import java.util.HashMap;
import java.util.Map;

import wcrpg.model.Pilot;
import wcrpg.model.PilotBuilder;
import wcrpg.model.Species;

public enum PremadePilotRepo implements PilotRepo {

  INSTANCE;
  
  private Map<String, Pilot> contents = new HashMap<>();
  
  @Override
  public Pilot loadPilot(String id) {
    return contents.get(id);
  }
  
  private PremadePilotRepo() {
    initialize();
  }
  
  private void initialize() {
    PilotBuilder builder = new PilotBuilder("Eilwen", "Tegg", "Gwyndraig")
        .species(Species.TERRAN)
        .rank("Second Lieutenant")
        .gender("Female")
        .height("1.7m")
        .mass("60kg")
        .handedness("Right")
        .birthdate("2627.303")
        .placeOfBirth("Cynwyd, Denbighshire, Wales, Earth")
        .initiative(7)
        .meleeAttackBonus(9)
        .rangedAttackBonus(11)
        .fortitudeSave(34)
        .reflexSave(37)
        .willpowerSave(30)
        .hp(67)
        .nhp(67)
        .hitDifficulty(43)
        .touchHitDifficulty(43)
        .flatFootedHitDifficulty(50)
        .strengthIndex(67);
    add(builder);
  }
  
  private void add(PilotBuilder builder) {
    Pilot pilot = builder.build();
    contents.put(pilot.getCallsign(), pilot);
  }

}
