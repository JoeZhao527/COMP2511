package part3Q1;

import java.util.Date;

public class FlightOccurence{
    private Flight flight;
    private Date departure;
    private Date arrival;

    private int firstClass;
    private int businessClass;
    private int economyClass;

    public FlightOccurence(Flight flight, Date departure, Date arrival) {
    }
    
    public Date getDeparture() {
        return departure;
    }

    public Date getArrivalDate() {
        return arrival;
    }

    public boolean book(String seat) {
        return false;
    }

    public boolean cancel(String seat) {
        return false;
    } 
}