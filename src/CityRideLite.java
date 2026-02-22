import java.util.ArrayList;
import java.util.Scanner;

class Journey {
    private int id;
    private String date;
    private int fromZone;
    private int toZone;
    private String type;
    private double fare;

    public Journey(int id, String date,int fromZone, int toZone, String type, double fare) {
        this.id = id;
        this.date = date;
        this.fromZone = fromZone;
        this.toZone = toZone;
        this.type = type;
        this.fare = fare;
    }

    public String toString() {
        return "ID: " + id +
                " | Date: " + date +
                " | Zones: " + fromZone + " -> " + toZone +
                " | Type: " + type +
                " | Charged: £" + String.format("%.2f", fare);
    }
}

public class CityRideLite{

    private ArrayList<Journey> journeys = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int idCounter = 1;

    private double adultTotal = 0;
    private double studentTotal = 0;
    private double childTotal =0;
    private double seniorTotal = 0;

    public static void main(String[] args){
        CityRideLite app = new CityRideLite();
        app.start();
    }

    public void start(){
        while (true){
            System.out.println("\n1- Add Journey");
            System.out.println("2- Show Journeys");
            System.out.println("3- Summary");
            System.out.println("4- Exit");
            System.out.print("Choice: ");

            String input = sc.nextLine();

            if (input.equals("1")) {
                addJourney();
            } else if (input.equals("2")) {
                showJourneys();
            } else if (input.equals("3")) {
                showSummary();
            } else if (input.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    void addJourney() {
        try {
            System.out.print("Date (DD/MM): ");
            String date = sc.nextLine();

            System.out.print("From zone: ");
            int from = Integer.parseInt(sc.nextLine());

            System.out.print("To zone: ");
            int to = Integer.parseInt(sc.nextLine());

            System.out.print("Peak or offpeak: ");
            String band = sc.nextLine().toLowerCase();

            System.out.print("Type (adult/student/child/senior): ");
            String type = sc.nextLine().toLowerCase();

            int zones = Math.abs(to - from) + 1;

            double price = 0;

            if(band.equals("peak")){
                if(zones == 1) price = 2.50;
                else if(zones == 2) price = 3.00;
                else if(zones == 3) price = 3.80;
                else if(zones == 4) price = 4.20;
                else price = 4.80;
            } else {
                if(zones == 1) price = 2.00;
                else if(zones == 2) price = 2.50;
                else if(zones == 3) price = 3.00;
                else if(zones == 4) price = 3.50;
                else price = 4.00;
            }

            if(type.equals("student")) price *= 0.75;
            else if(type.equals("child")) price *= 0.50;
            else if(type.equals("senior")) price *= 0.70;

            double charged = price;
            if(type.equals("adult")){
                if(adultTotal + price > 8) charged = 8 - adultTotal;
                if(charged < 0) charged = 0;
                adultTotal += charged;
            } else if(type.equals("student")) {
                if(studentTotal + price > 6) charged = 6 - studentTotal;
                if(charged < 0) charged = 0;
                studentTotal += charged;
            } else if(type.equals("child")) {
                if(childTotal + price > 4) charged = 4 - childTotal;
                if(charged < 0) charged = 0;
                childTotal += charged;
            } else if(type.equals("senior")) {
                if(seniorTotal + price > 7) charged = 7 - seniorTotal;
                if(charged < 0) charged = 0;
                seniorTotal += charged;
            }

            journeys.add(new Journey(idCounter++,date,from, to,type, charged));
            System.out.println("Journey added.");

        } catch(Exception e) {
            System.out.println("Invalid input.");
        }
    }

    void showJourneys(){
        if(journeys.size() == 0) {
            System.out.println("No journeys yet.");
            return;
        }
        for(Journey j : journeys) {
            System.out.println(j);
        }
    }

    void showSummary(){
        double total =adultTotal +studentTotal + childTotal + seniorTotal;
        System.out.println("\nTotal income: £" + String.format("%.2f", total));
        System.out.println("Adult: £" + String.format("%.2f", adultTotal));
        System.out.println("Student: £" + String.format("%.2f", studentTotal));
        System.out.println("Child: £" + String.format("%.2f", childTotal));
        System.out.println("Senior: £" + String.format("%.2f", seniorTotal));
    }
}