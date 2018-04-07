package wcrpg.model;

public enum Attribute {

  //@formatter:off
	POWER("Power", "PWR"),
	FINESSE("Finesse", "FIN"),
	PHYSIQUE("Physique", "PHY"),
	INTELLECT("Intellect","INT"),
	ACUMEN("Acumen", "ACU"),
	CHARM("Charm", "CHA");
  //@formatter:on

	private String label;
	private String abbr;
	
	private Attribute(String label, String abbr) {
		this.label = label;
		this.abbr = abbr;
	}
	
	public String getLabel() {
		return label;
	}

	public String getAbbr() {
		return abbr;
	}
}
