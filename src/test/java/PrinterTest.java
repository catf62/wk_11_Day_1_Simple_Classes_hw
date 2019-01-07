import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer epsonBastardMk1;
    Printer epsonNaeTonerMk1;

    @Before
    public void before(){
        epsonBastardMk1 = new Printer(500, 10000);
        epsonNaeTonerMk1 = new Printer(500, 1);
    }

    @Test
    public void printMethodReducesCorrectNumberOfPagesAndVolumeOfToner(){
        assertEquals("Sufficient paper and toner available, there are 450 sheets of paper remaining and the toner volume is 9950", epsonBastardMk1.printMethod(5, 10));
    }

    @Test
    public void printMethodDoesNotRunIfPaperIsInsufficient(){
        assertEquals("Insufficient Paper Available", epsonBastardMk1.printMethod(1000, 10));
    }

    @Test
    public void printMethodDoesNotRunIfTonerIsInsufficient(){
        assertEquals("Insufficient Toner Available", epsonNaeTonerMk1.printMethod(100, 2));
    }

    @Test
    public void printMethodDoesNotRunIfTonerAndPaperAreInsufficient(){
        assertEquals("Insufficient Paper and Toner Available", epsonNaeTonerMk1.printMethod(1000, 2));
    }

    @Test
    public void canRefillPaper(){
        epsonBastardMk1.printMethod(400, 1);
        assertEquals(500, epsonBastardMk1.refillPaper());
    }

    @Test
    public void canRefillToner(){
        epsonNaeTonerMk1.printMethod(10, 1);
        assertEquals(10000, epsonBastardMk1.refillToner());
    }

}
