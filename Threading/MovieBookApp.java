package Threading;
import java.util.Scanner;

class BookTheatreSeat{
    int total_seat = 10;
     void bookSeat(int seat) //synchronized WILL SYNCHRONISE THE WHOLE METHOD
    {

        System.out.println(seat + " Seat booked Successfully !!");
        System.out.println(seat + " Seat booked Successfully !!");
        System.out.println(seat + " Seat booked Successfully !!");
        System.out.println(seat + " Seat booked Successfully !!");
        System.out.println(seat + " Seat booked Successfully !!");

        synchronized(this){
    if (total_seat>=seat) 
    {
    System.out.println(seat + " Seat booked Successfully !!");
    total_seat = total_seat-seat;
    System.out.println(total_seat + " seat left.");
    } 
    else {
        System.out.println("Seat can not be bookes !!");
    }}
    System.out.println(seat + " Seat booked Successfully !!");
    System.out.println(seat + " Seat booked Successfully !!");
    System.out.println(seat + " Seat booked Successfully !!");
    }

}




public class MovieBookApp extends Thread {

    static BookTheatreSeat b;
    int seat;
    @Override
    public void run()
    {
        b.bookSeat(seat);

    }

    public static void main(String[] args) {
        b = new BookTheatreSeat();
        MovieBookApp deepak = new MovieBookApp();
        deepak.seat=7;
        deepak.start();

        MovieBookApp amit = new MovieBookApp();
        amit.seat = 6;
        amit.start();

    }



}


