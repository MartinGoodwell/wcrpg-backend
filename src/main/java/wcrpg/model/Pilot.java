package wcrpg.model;

import java.util.Map;

public class Pilot {

  private String firstName;
  private String lastName;
  private String callsign;
  private Species species;
  private String occupation;
  private String rank;
  private String gender;
  private String height;
  private String mass;
  private String handedness;
  private String birthdate;
  private String placeOfBirth;

  private int initiative; // INIT. influences battle order (higher means first) - matches Finesse DC modifier
  private int meleeAttackBonus; // MAB
  private int rangedAttackBonus; // RAB
  private int hp; // hit points (dying)
  private int nhp; // non-lethal hit points (passing out)
  private int hitDifficulty; /// HD (how hard is it to hit the character)
  private int touchHitDifficulty; // THD (how hard is it to hit with a "touch" attack)
  private int flatFootedHitDifficulty; // FHD (how hard is it to hit when surprised)
  private int strengthIndex; // SI (sum of hitpoints including armor and shield hp and strength of strongest
                             // available weapon
  
  //save throws
  private int fortitudeSave; // FSV ()toughness)
  private int reflexSave; // RSV (move indistinctively)
  private int willpowerSave; // WSV (keep a character from doing something against his will)

  private Map<Discipline, Integer> disciplineRecord;
  //35 discipline skills, 18 attribute skills
  private Map<Skill, Integer> skillRecord;
  private Map<Trait, Integer> traitRecord;

  Pilot(PilotBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.callsign = builder.callsign;
    this.species = builder.species;
    this.occupation = builder.occupation;
    this.rank = builder.rank;
    this.gender = builder.gender;
    this.height = builder.height;
    this.mass = builder.mass;
    this.handedness = builder.handedness;
    this.birthdate = builder.birthdate;
    this.placeOfBirth = builder.placeOfBirth;
    
    this.initiative = builder.initiative;
    this.meleeAttackBonus = builder.meleeAttackBonus;
    this.rangedAttackBonus = builder.rangedAttackBonus;
    this.hp = builder.hp;
    this.nhp = builder.nhp;
    this.hitDifficulty = builder.hitDifficulty;
    this.touchHitDifficulty = builder.touchHitDifficulty;
    this.flatFootedHitDifficulty = builder.flatFootedHitDifficulty;
    this.strengthIndex = builder.strengthIndex;
    
    this.fortitudeSave = builder.fortitudeSave;
    this.reflexSave = builder.reflexSave;
    this.willpowerSave = builder.willpowerSave;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCallsign() {
    return callsign;
  }

  public Species getSpecies() {
    return species;
  }

  public String getOccupation() {
    return occupation;
  }

  public String getRank() {
    return rank;
  }

  public String getGender() {
    return gender;
  }

  public String getHeight() {
    return height;
  }

  public String getMass() {
    return mass;
  }

  public String getHandedness() {
    return handedness;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public String getPlaceOfBirth() {
    return placeOfBirth;
  }

  public int getInitiative() {
    return initiative;
  }

  public int getMeleeAttackBonus() {
    return meleeAttackBonus;
  }

  public int getRangedAttackBonus() {
    return rangedAttackBonus;
  }

  public int getHp() {
    return hp;
  }

  public int getNhp() {
    return nhp;
  }

  public int getHitDifficulty() {
    return hitDifficulty;
  }

  public int getTouchHitDifficulty() {
    return touchHitDifficulty;
  }

  public int getFlatFootedHitDifficulty() {
    return flatFootedHitDifficulty;
  }

  public int getStrengthIndex() {
    return strengthIndex;
  }

  public int getFortitudeSave() {
    return fortitudeSave;
  }

  public int getReflexSave() {
    return reflexSave;
  }

  public int getWillpowerSave() {
    return willpowerSave;
  }

  public Map<Discipline, Integer> getDisciplineRecord() {
    return disciplineRecord;
  }

  public Map<Skill, Integer> getSkillRecord() {
    return skillRecord;
  }

  public Map<Trait, Integer> getTraitRecord() {
    return traitRecord;
  }
  
  
  
}
