import org.junit.Test;

import java.util.Date;

public class PrintDateTest {
    private Printer printer;

    @Test
	public void printDate() throws Exception {
		PrintDate printDate = new PrintDate(printer);

		printDate.printCurrentDate();

		printer.verifyCallPrintWith(new Date());
	}
}
