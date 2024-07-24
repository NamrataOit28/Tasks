import java.util.*;
class Movie {
    private String title;
    private double amount;
    private int noOfTickets;

    public Movie(String title, double amount, int noOfTickets) {
        this.title = title;
        this.amount = amount;
        this.noOfTickets = noOfTickets;
    }

    public double calculateTicketAmount() {
        return amount * noOfTickets;
    }

    public String getTitle() {
        return title;
    }
}


 class TaxedMovie extends Movie {
    private double tax;

    public TaxedMovie(String title, double amount, int noOfTickets, double tax) {
        super(title, amount, noOfTickets);
        this.tax = tax;
    }

   
    public double calculateTicketAmount() {
        double baseAmount = super.calculateTicketAmount();
        return baseAmount + (baseAmount * tax / 100);
    }

    public double getFinalAmount() {
        return calculateTicketAmount();
    }
}


 class TaxFreeMovie extends Movie {
    public TaxFreeMovie(String title, double amount, int noOfTickets) {
        super(title, amount, noOfTickets);
    }

   
    public double calculateTicketAmount() {
        return super.calculateTicketAmount();
    }

    public double getFinalAmount() {
        return calculateTicketAmount();
    }
}


public class MovieDetails {
    public static void main(String[] args) {
        Movie movie1 = new TaxedMovie("Taxed Movie", 100.0, 10, 10);
        Movie movie2 = new TaxFreeMovie("Tax Free Movie", 150.0, 5);

        System.out.println("Movie 1: " + movie1.getTitle());
        System.out.println("Final Amount: " + ((TaxedMovie) movie1).getFinalAmount());

        System.out.println("Movie 2: " + movie2.getTitle());
        System.out.println("Final Amount: " + ((TaxFreeMovie) movie2).getFinalAmount());
    }
}