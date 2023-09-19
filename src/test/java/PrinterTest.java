import com.codebase.Printer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(200, 100);
    }

    @Test
    public void testPrintWithEnoughPaperAndToner() {
        printer.print(10, 3);
        assertEquals(170, printer.getPaperLeft());
        assertEquals(70, printer.getTonerVolume());
    }


    @Test
    public void testPrintWithInsufficientPaper() {
        printer.print(10, 20);
        assertEquals(200, printer.getPaperLeft());
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void testPrintWithZeroPagesAndCopies() {
        printer.print(0, 0);
        assertEquals(200, printer.getPaperLeft());
        assertEquals(100, printer.getTonerVolume());
    }
}
