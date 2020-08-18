package part3Q1;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String name;
    private List<FlightOccurence> flightOccurences;

    private int firstClass;
    private int businessClass;
    private int economyClass;

    public Flight(String name, int first, int business, int economy) {
    }

    public boolean book() {
        return false;
    }

    public boolean cancel() {
        return false;
    }

    public int getFirstClass() {
        return firstClass;
    }

    public int getBusinessClass() {
        return businessClass;
    }

    public int getEconomyClass() {
        return economyClass;
    }
}