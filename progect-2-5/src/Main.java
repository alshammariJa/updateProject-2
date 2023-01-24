
import java.text.ParseException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws ParseException {
        Airplane a = new Airplane("203", 50.4, 100.5, "05:00:00");
        System.out.println(a.CalculateArrivalTime());
        System.out.println(a.ConvertMinToHour(8));
        System.out.println(a.CalculateDuration());
    }
}