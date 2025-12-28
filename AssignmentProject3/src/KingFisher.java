
public class KingFisher implements Airfare {

    private Integer hours;
    private Double costPerHour;

    // Default constructor
    public KingFisher() {
    }

    // Parameterized constructor
    public KingFisher(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public Double calculateAmount() {
        return hours * costPerHour * 4;
    }
}
