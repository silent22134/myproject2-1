package com.wei.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;
    }
    //int OnetoTwo = 100*200;
    //int OnetoThree = 100*300;
    //int TwotoThree = 200*300;
    public void price(){
        if(start == Station.TAIPEI_STATION){
            if(destination == Station.TAICHUNG_STATION){
                price = 600;
            }else{
                price = 1500;
            }
        }
        if(start == Station.TAICHUNG_STATION){
            if(destination == Station.KAOHSIUNG_STATION){
                price = 900;
            }else {
                price = 600;
            }
        }
        if (start == Station.KAOHSIUNG_STATION){
            if (destination == Station.TAIPEI_STATION){
                price = 1500;
            }else {
                price = 900;
            }
        }
    }
    public void print(){
        System.out.println(start.name+"\t"+destination.name+"\t");
    }

}
