
public class Car extends Trip {
    public Car(String tripNumber, double distance, double speed, String statTime) {
        super(tripNumber, distance, speed, statTime);
    }

    public long CalculateDuration() {
        return 0L;
    }

    public double ConvertMinToHour(int min) {
        return super.ConvertMinToHour(min);
    }

    public String CalculateArrivalTime() {
        return super.CalculateArrivalTime();
    }
}