import java.util.Date;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Date date) {
        System.out.println(date);
    }
}
