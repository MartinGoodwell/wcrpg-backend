package wcrpg.model;

public class CheckOutcome {

  private boolean success;
  private int degree;
  
  public static CheckOutcome createSuccess(int degree) {
    return new CheckOutcome(true, degree);
  }
  
  public static CheckOutcome createFailure(int degree) {
    return new CheckOutcome(false, degree);
  }
  
  private CheckOutcome(boolean success, int degree) {
    this.success = success;
    this.degree = degree;
  }
  
  public boolean isSuccess() {
    return success;
  }
  
  public int getDegree() {
    return degree;
  }
}
