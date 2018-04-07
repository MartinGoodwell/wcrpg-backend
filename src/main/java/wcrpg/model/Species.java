package wcrpg.model;

public enum Species {
  TERRAN("Terran"), KILRATHI("Kilrathi");
  
  private String label;
  
  private Species(String label) {
    this.label = label;
  }
  
  public String getLabel() {
    return label;
  }
}
