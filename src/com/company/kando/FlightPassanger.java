package com.company.kando;

public class FlightPassanger {

    public String FlightNumber;
    public String Source;
    public String Destination;
    public String PassangerName;
    public int PassangerId;
    public String TicketId;
    public String SeatNumber;
    public int Price;

    public FlightPassanger(String fileLine){

        String[] split = fileLine.split((";"));
        this.FlightNumber = split[0];
        this.Source = split[1];
        this.Destination = split[2];
        this.PassangerName = split[3];
        this.PassangerId = Integer.parseInt(split[4]);
        this.TicketId = split[5];
        this.SeatNumber = split[6];
        this.Price = Integer.parseInt(split[7]);

    }

}
