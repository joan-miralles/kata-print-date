import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class PrintDateTest {
    private Printer printer;

    @Test
	public void printDate() throws Exception {
		printer = new MockPrinter();
        PrintDate printDate = new PrintDate(printer);

		printDate.printCurrentDate();

		assertTrue(printer.isPrintCalledWith(new Date()));
	}
}
