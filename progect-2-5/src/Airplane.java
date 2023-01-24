//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airplane extends Trip {
    public Airplane(String tripNumber, double distance, double speed, String statTime) {
        super(tripNumber, distance, speed, statTime);
    }

    public long CalculateDuration() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(super.getStatTime());
        Date date2 = format.parse(this.CalculateArrivalTime());
        long difference = date2.getTime() - date1.getTime();
        return difference;
    }

    public double ConvertMinToHour(int min) {
        return (double)(min / 60);
    }

    public String CalculateArrivalTime() {
        double arrivaltime = this.getDistance() / this.getSpeed();
        String arriv = String.valueOf(arrivaltime);
        return arriv;
    }
}

