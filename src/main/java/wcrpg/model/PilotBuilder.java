package wcrpg.model;

public class PilotBuilder {

  String firstName;
  String lastName;
  String callsign;
  Species species;
  String occupation;
  String rank;
  String gender;
  String height;
  String mass;
  String handedness;
  String birthdate;
  String placeOfBirth;

  int initiative; // INIT. influences battle order (higher means first) - matches Finesse DC modifier
  int meleeAttackBonus; // MAB
  int rangedAttackBonus; // RAB
  int hp; // hit points (dying)
  int nhp; // non-lethal hit points (passing out)
  int hitDifficulty; /// HD (how hard is it to hit the character)
  int touchHitDifficulty; // THD (how hard is it to hit with a "touch" attack)
  int flatFootedHitDifficulty; // FHD (how hard is it to hit when surprised)
  int strengthIndex; // SI (sum of hitpoints including armor and shield hp and strength of strongest
                             // available weapon
  
  //save throws
  int fortitudeSave; // FSV ()toughness)
  int reflexSave; // RSV (move indistinctively)
  int willpowerSave; // WSV (keep a character from doing something against his will)
  
  public PilotBuilder(String firstName, String lastName, String callsign) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.callsign = callsign;
  }
  
  public PilotBuilder species(Species species) {
    this.species = species;
    return this;
  }
  
  public PilotBuilder occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }
  
  public PilotBuilder rank(String rank) {
    this.rank = rank;
    return this;
  }
  
  public PilotBuilder gender(String gender) {
    this.gender = gender;
    return this;
  }
  
  public PilotBuilder height(String height) {
    this.height = height;
    return this;
  }
  
  public PilotBuilder mass(String mass) {
    this.mass = mass;
    return this;
  }
  
  public PilotBuilder handedness(String handedness) {
    this.handedness = handedness;
    return this;
  }

  public PilotBuilder birthdate(String birthdate) {
    this.birthdate = birthdate;
    return this;
  }
  
  public PilotBuilder placeOfBirth(String placeOfBirth) {
    this.placeOfBirth = placeOfBirth;
    return this;
  }

  public PilotBuilder initiative(int initiative) {
    this.initiative = initiative;
    return this;
  }
  
  public PilotBuilder meleeAttackBonus(int meleeAttackBonus) {
    this.meleeAttackBonus = meleeAttackBonus;
    return this;
  }
  
  public PilotBuilder rangedAttackBonus(int rangedAttackBonus) {
    this.rangedAttackBonus = rangedAttackBonus;
    return this;
  }
  
  public PilotBuilder hp(int hp) {
    this.hp = hp;
    return this;
  }
  
  public PilotBuilder nhp(int nhp) {
    this.nhp = nhp;
    return this;
  }
  
  public PilotBuilder hitDifficulty(int hitDifficulty) {
    this.hitDifficulty = hitDifficulty;
    return this;
  }
  
  public PilotBuilder touchHitDifficulty(int touchHitDifficulty) {
    this.touchHitDifficulty = touchHitDifficulty;
    return this;
  }
  
  public PilotBuilder flatFootedHitDifficulty(int flatFootedHitDifficulty) {
    this.flatFootedHitDifficulty = flatFootedHitDifficulty;
    return this;
  }
  
  public PilotBuilder strengthIndex(int strengthIndex) {
    this.strengthIndex = strengthIndex;
    return this;
  }
  
  public PilotBuilder fortitudeSave(int fortitudeSave) {
    this.fortitudeSave = fortitudeSave;
    return this;
  }
  
  public PilotBuilder reflexSave(int reflexSave) {
    this.reflexSave = reflexSave;
    return this;
  }
  
  public PilotBuilder willpowerSave(int willpowerSave) {
    this.willpowerSave = willpowerSave;
    return this;
  }
  
  public Pilot build() {
    return new Pilot(this);
  }
}
