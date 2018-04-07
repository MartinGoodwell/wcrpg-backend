package wcrpg.service;

import java.util.List;
import java.util.Random;

import wcrpg.model.Check;
import wcrpg.model.CheckOutcome;
import wcrpg.model.Trait;

public enum CheckService {
  INSTANCE;
  
  public CheckOutcome checkDifficultyClass(List<Check> checks, Trait... traits) {
    
    return CheckOutcome.createFailure(0);
  }
  
  public CheckOutcome checkHitDifficulty(List<Check> checks, Trait... traits) {
    return CheckOutcome.createFailure(0);
  }
  
  /**
   * Rolls number of dice (each having a number of sides).<br/>
   * First dice has the higher order.<br/>
   * eg. when using three dice, first is the hundred, second is the ten, third is the one
   * @param nrDice
   * @param sides
   * @return number
   */
  public int rollDice(int nrDice, int sides) {
    String result = "";
    for (int idx=0;idx<nrDice;++idx) {
      result += new Random().nextInt(sides);
    }
    return Integer.parseInt(result);
  }
}
