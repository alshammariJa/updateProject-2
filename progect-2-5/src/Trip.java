
import java.text.ParseException;

public abstract class Trip {
    private String tripNumber;
    private double distance;
    private double speed;
    private String statTime;

    public Trip(String tripNumber, double distance, double speed, String statTime) {
        this.tripNumber = tripNumber;
        this.distance = distance;
        this.speed = speed;
        this.statTime = statTime;
    }

    public String getTripNumber() {
        return this.tripNumber;
    }

    public void setTripNumber(String tripNumber) {
        this.tripNumber = tripNumber;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getStatTime() {
        return this.statTime;
    }

    public void setStatTime(String statTime) {
        this.statTime = statTime;
    }

    public abstract long CalculateDuration() throws ParseException;

    public double ConvertMinToHour(int min) {
        return 0.0;
    }

    public String CalculateArrivalTime() {
        return "";
    }
}

