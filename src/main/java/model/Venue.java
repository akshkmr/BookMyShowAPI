package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Venue {
    private int totalAvailable;
    private HashMap<Row, List<Seat>> venueMap = new HashMap<Row, List<Seat>>();

    public Venue(int rows, int seatsPerRow){
        this.totalAvailable = rows * seatsPerRow;
    }

    private void constructVenue(int rows, int seatsPerRow) {
        for(int i = 1; i <= rows; i++) {
            List<Seat> seats = new ArrayList<Seat>();
            for(int j = 1; j <= seatsPerRow; j++) {
                seats.add(new Seat(j, Status.AVAILABLE));
            }
            Row r = new Row(i, seatsPerRow);
            venueMap.put(r,seats);
        }
    }

    public int getTotalAvailable() {
        return totalAvailable;
    }

    public HashMap<Row, List<Seat>> getVenueMap() {
        return venueMap;
    }

    public void incrementTotalAvailable(int numSeats) { this.totalAvailable = this.getTotalAvailable() + numSeats; }

    public void decrementTotalAvailable(int numSeats) { this.totalAvailable = this.getTotalAvailable() - numSeats; }
}
