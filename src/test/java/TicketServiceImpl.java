import model.Venue;
import org.apache.log4j.Logger;
import service.TicketService;


public class TicketServiceImpl {
    private Venue venue;
    private boolean isTimerExpired;
    private final static Logger logger = Logger.getLogger(TicketServiceImpl.class);

    public TicketServiceImpl(Venue venue){
        this.venue = venue;
    }

    public int numSeatsAvailable() {
        return venue.getTotalAvailable();
    }
}
