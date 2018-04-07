package wcrpg.model;

public enum Discipline {
  //@formatter:off
	COMMAND("Command"),
	SCIENCE("Science"),
	NAVIGATION("Navigation"),
	TACTICAL("Tactical"),
	ENGINEERING("Engineering"),
	COMMUNICATIONS("Communications"),
	MEDICINE("Medicine");
  //@formatter:on

  private String label;

  private Discipline(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }
}
