import model.Venue;
import org.junit.Assert;
import org.junit.Test;
import service.TicketService;

public class TicketServiceTest {

    @Test
    public void testNumSeatsAvailable() {
        int rows = 10;
        int seatsPerRow = 10;
        Venue venue = new Venue(rows, seatsPerRow);
        TicketServiceImpl ticketService = new TicketServiceImpl(venue);
        int total = ticketService.numSeatsAvailable();
        Assert.assertTrue("Total available count does not match", total == rows * seatsPerRow);
    }

}
