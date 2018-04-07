package wcrpg.model.combat;

public enum CrewActionType {

  STANDARD(1), FULL(2), FREE(0);
  
  private int cost;
  
  private CrewActionType(int cost) {
    this.cost = cost;
  }
  
  public int getCost() {
    return cost;
  }
}
