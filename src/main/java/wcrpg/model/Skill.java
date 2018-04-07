package wcrpg.model;

public enum Skill implements Check {
  //@formatter:off
  TDM("Three-Dimensional Maneuvers"),
  BRW("Brawling"),
  LFT("Lifting"),
  DDG("Dodge"),
  DXM("Dexterous Maneuvers"),
  HnS("Hiding and Seeking"),
  CCN("Concentration"),
  STM("Stamina"),
  RCP("Recuperation"),
  KNW("Knowledge"),
  CUN("Cunning"),
  RSF("Resourcefulness"),
  PRC("Perception"),
  PRF("Performance"),
  SRV("Survival"),
  //Charm Skill
  PER("Personality"),
  LED("Leadership"),
  DIP("Diplomacy"),
  //Command Skills
  INS("Inspire"),
  STR("Strategy"),
  CRD("Coordination"),
  GUD("Guidance"),
  SEC("Security"),
  //Science
  PLT("Planetology"),
  TCH("Technology"),
  ARC("Archaeology"),
  GEO("Geology"),
  TYP("Typhonology"),
  //Navigation
  AST("Astrogation"),
  SSP("Starship Piloting"),
  ORT("Orientation"),
  VEP("Vehicle Piloting"),
  STL("Stealth"),
  //Tactical
  TAR("Targeting"),
  MKM("Marksmanship"),
  BAL("Ballistics"),
  CMN("Combat Maneuvers"),
  EVM("Evasive Maneuvers"), 
  //Engineering
  DMC("Damage Control"),
  ITS("Internal Systems"),
  DEF("Defenses"),
  MEC("Mechanics"),
  FTL("Faster-Than-Light Mechanics"),
  //Communications
  TRL("Translate"),
  RAP("Rapport"),
  IND("Intimidate"),
  NEG("Negotiate"),
  DIS("Distress"),
  //Medicine
  ITC("Intensive Care"),
  TRT("Treatment"),
  XNB("Xenobiology"),
  SMD("Specialized Medicine"),
  PSY("Psychology");
  //@formatter:on
  
  private String label;
  
  private Skill(String label) {
    this.label = label;
  }
  
  public String getLabel() {
    return label;
  }
}
