
public class RewardValue {
    private double cashValue;
    private double milesValue;
    
    private static final double miles_to_cash_rate=0.0035;
    
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=cashValue/miles_to_cash_rate;
    }
    
    public RewardValue(int milesValue){
        this.cashValue=milesValue*miles_to_cash_rate;
        this.milesValue=milesValue;
    }
    
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
    
}
