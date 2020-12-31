package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
@ToString
public class SeatHold {
    private Integer seatHoldId;
    private String customerEmail;
    private int numOfSeats;
    private HashMap<Integer, String> seatsHeldOrReserved;
    private static final AtomicInteger count = new AtomicInteger(100);

    public SeatHold(String customerEmail, int numOfSeats){
        this.seatHoldId = count.getAndIncrement();
        this.customerEmail = customerEmail;
        this.numOfSeats = numOfSeats;
        this.seatsHeldOrReserved = new HashMap<Integer, String>();
    }
}
