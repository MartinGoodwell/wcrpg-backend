package wcrpg.model;

import java.util.List;

import wcrpg.model.combat.Combatant;
import wcrpg.model.vehicle.VehicleAccessory;

public class Vehicle implements Combatant {

  private String id;
  private String commonName;
  private String chassisWeight;
  private String sizeClass;
  private int strengthIndex;
  private int cost;
  private int hitDifficulty;
  private int blastHitDifficulty;
  private int flatFootedHitDifficulty;
  private int initiative;
  private int maxSpeed;
  private int shieldHitPoints;
  private int armorHitPoints;
  private List<VehicleGun> guns;
  private List<VehicleOrdnance> ordnance;
  private String x;
  private int crewSize;
  private int passengerCapacity;
  private int cargoCapacity;
  private List<VehicleAccessory> accessories;
  private List<VehicleFlawBonus> flawsBonuses;
  
  @Override
  public int getStrengthIndex() {
    return strengthIndex;
  }
  
  @Override
  public int getInitiative() {
    return initiative;
  }
  
}
