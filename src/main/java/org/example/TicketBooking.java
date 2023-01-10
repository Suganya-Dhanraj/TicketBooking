
package org.example;

public class TicketBooking {
    String passName;
    int passAge;
    String passBerth;

    public TicketBooking() {
        this("Sugan", 30);
    }

    public TicketBooking(String name, int Age) {
        this(name, Age, "Lower Berth");
    }

    public TicketBooking(String name, int Age, String berth) {
        this.passName = name;
        this.passAge = Age;
        this.passBerth = berth;
    }

    void displayTicket() {
        System.out.println("Passenger Name :"+passName);
        System.out.println("Passenger Age:"+ passAge);
        System.out.println("Passenger Berth"+passBerth);
    }

    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking();
        tb.displayTicket();
    }

}