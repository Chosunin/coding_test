import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
public static void main(String[] args) {
LocalDate now = LocalDate.now();

    DateTimeFormatter whatday = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String today = now.format(whatday);
    System.out.println(today);
}
}