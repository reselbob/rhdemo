import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class rhdemo {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current date and time is: " + dtf.format(now));
    }
}
