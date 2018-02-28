import java.util.Date;

public class ConsolePrinter implements Printer {
    @Override
    public void print(Date date) {
        System.out.println(date);
    }

    @Override
    public boolean isPrintCalledWith(Date date) {
        throw new UnsupportedOperationException("This method can't be called");
    }
}
