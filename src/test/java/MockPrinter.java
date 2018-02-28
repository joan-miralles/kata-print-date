import java.util.Date;

public class MockPrinter implements Printer {
    private Date printedDate;

    @Override
    public void print(Date date) {
        this.printedDate = date;
    }

    @Override
    public boolean isPrintCalledWith(Date date) {
        return date.toInstant().equals(printedDate.toInstant());
    }
}
