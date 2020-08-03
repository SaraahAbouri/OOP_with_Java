public class UberService {
    private String name;
    private int costPerMinute;
    private int costPerKilometre;
    private int cancellationFee;
    private int baseFare;

    public void setDetails (String name, int costPerMinute, int costPerKilometre, int baseFare, int cancellationFee){
        this.name = name;
        this.costPerMinute = costPerMinute;
        this.costPerKilometre = costPerKilometre;
        this.baseFare = baseFare;
        this.cancellationFee = cancellationFee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostPerMinute() {
        return costPerMinute;
    }

    public void setCostPerMinute(int costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    public int getCostPerKilometre() {
        return costPerKilometre;
    }

    public void setCostPerKilometre(int costPerKilometre) {
        this.costPerKilometre = costPerKilometre;
    }

    public int getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(int cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(int baseFee) {
        this.baseFare = baseFare;
    }
    public double calculateFare(double minutes, double distance){
        return minutes * costPerMinute + distance * costPerKilometre + baseFare;
    }
}

