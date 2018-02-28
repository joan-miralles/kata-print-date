import java.util.Date;

public class PrintDate {
    private final Printer printer;

    public PrintDate(Printer printer) {
        this.printer = printer;
    }

    public void printCurrentDate() {
		printer.print(new Date());
	}
}
