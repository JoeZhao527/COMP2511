package part3Q1;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Passenger {
    private List<FlightOccurence> schedules;
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public boolean book(Flight flight, Date depeature, String seat) {
        return false;
    }

    public boolean cancel(Flight flight, Date depeature, String seat) {
        return false;
    }

    public boolean update(Flight oldF, Date oldTime, Flight newF, Date newTime, String seat) {
        return false;
    }
}