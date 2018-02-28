import DateProvider.DateProvider;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class PrintDateTest {
    private Printer printer;
    private DateProvider dateProvider;

    @Test
	public void printDate() throws Exception {
		printer = new MockPrinter();
		dateProvider = new DateProvider();
        PrintDate printDate = new PrintDate(printer, dateProvider);

		printDate.printCurrentDate();

		assertTrue(printer.isPrintCalledWith(new Date()));
	}
}
