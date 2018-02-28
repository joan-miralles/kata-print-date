import DateProvider.DateProvider;

public class PrintDate {
    private final Printer printer;
    private DateProvider dateProvider;

    public PrintDate(Printer printer, DateProvider dateProvider) {
        this.printer = printer;
        this.dateProvider = dateProvider;
    }

    public void printCurrentDate() {
		printer.print(dateProvider.currentDate());
	}
}
