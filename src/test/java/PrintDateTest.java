import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class PrintDateTest {
    private Printer printer;
    private DateProvider dateProvider;

    @Test
	public void printDate() throws Exception {
		printer = new MockPrinter();
		dateProvider = new DateProvider();
        PrintDate printDate = new PrintDate(printer, dateProvider);

		printDate.printCurrentDate();

		assertTrue(((MockPrinter) printer).isPrintCalledWith(new Date()));
	}

	@Test
    public void printDate_withMockito() {
        printer = spy(Printer.class);
        dateProvider = new DateProvider();
        PrintDate printDate = new PrintDate(printer, dateProvider);
        printDate.printCurrentDate();
        verify(printer).print(any());
    }
}
