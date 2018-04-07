package wcrpg.model;

public enum Trait implements Check {

  //@formatter:off
  //Variable Traits
  COMELINESS(-30,30),
  SENSES(-30,30),
  WEALTH(-30,30),
  REPUTATION(-30,30),
  SOCIAL_STATUS(-30,30),
  NERVES(-30,30),
  MEMORY(-30,30),
  LUCK(-30,30),
  HEALTH(-30,30),
  REFLEXES(-30,30),
  DISCIPLINE(-30,30),
  EDUCATION(-30,30),
  TEMPER(-30,30),
  //Talents
  CONTACTS(0,25),
  AMBIDEXTERITY(0,25),
  MATH_EXPERT(0,25),
  QUICK_DRAW(0,25),
  SCIENTIFIC_SENSE(0,25),
  NAVIGATIONAL_SENSE(0,25),
  MECHANICAL_SENSE(0,25),
  LINGUISTIC_SENSE(0,25),
  EMPATHIC_SENSE(0,25),
  TACTICAL_SENSE(0,25),
  //Complications
  ABNORMAL_HEIGHT(-25,0),
  ABNORMAL_WEIGHT(-25,0),
  ADDICTED(-25,0),
  ALLERGIC(-25,0),
  AMPUTEE(-25,0),
  BLEEDER(-25,0),
  CREED(-25,0),
  CRUDE(-25,0),
  CURIOUS(-25,0),
  GLUTTON(-25,0),
  GREEDY(-25,0),
  HONEST(-25,0),
  HUNTED(-25,0),
  IMPULSIVE(-25,0),
  INSANE(-25,0),
  INTOLERANT(-25,0),
  JEALOUS(-25,0),
  LECHEROUS(-25,0),
  OBSESSED(-25,0),
  OVERCONFIDENT(-25,0),
  PHOBIC(-25,0),
  TIGHTWAD(-25,0);
  //@formatter:on
  
  private int minPoints;
  private int maxPoints;
  
  private Trait(int minPoints, int maxPoints) {
    this.minPoints = minPoints;
    this.maxPoints = maxPoints;
  }
  
  public int getMinPoints() {
    return minPoints;
  }
  
  public int getMaxPoints() {
    return maxPoints;
  }
}
