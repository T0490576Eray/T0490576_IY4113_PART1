# IY4113 Milestone 4

| Assessment Details | Please Complete All Details                                           |
| ------------------ | --------------------------------------------------------------------- |
| Group              | A                                                                     |
| Module Title       | 4113 Applied Software Engineering using Object-Orientated Programming |
| Assessment Type    | Java Fundamentals part 4                                              |
| Module Tutor Name  | Jonathan Shore                                                        |
| Student ID Number  | P490576                                                               |
| Date of Submission | 15/02/2026                                                            |
| Word Count         | 516                                                                   |
| GItHub Link        |                                                                       |

- [x] *I confirm that this assignment is my own work. Where I have referred to academic sources, I have provided in-text citations and included the sources in
  the final reference list.*

- [x] *Where I have used AI, I have cited and referenced appropriately.

------------------------------------------------------------------------------------------------------------------------------

### Program Code

---

Paste the current program code created so far. It does not have to be runnable code (document though if it does not work!)

------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;  
import java.util.Scanner;  

class Journey {  
    int startZone;  
    int endZone;  
    double ticketPrice;  

    void showTicket() {  
        System.out.println("Journey from zone " + startZone + " to " + endZone);  
        System.out.println("Price: GBP " + ticketPrice);  
        System.out.println("---------------------------");  
    }  

}  

public class Main {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        ArrayList<Journey> tripList = new ArrayList<>();  

        System.out.println("--- CityRide Lite Prototype V2 ---");  
        System.out.print("How many journeys do you want to add? ");  
        int count = input.nextInt();  
    
        for (int i = 0; i < count; i++) {  
            System.out.println("\nEntering details for Journey " + (i + 1) + ":");  
            Journey tempTrip = new Journey();  
    
            System.out.print("Enter Start Zone:");  
            tempTrip.startZone = input.nextInt();  
    
            System.out.print("Enter End Zone: ");  
            tempTrip.endZone = input.nextInt();  
    
            System.out.print("Enter Ticket Price: ");  
            tempTrip.ticketPrice = input.nextDouble();  
    
            tripList.add(tempTrip);  
        }  
    
        System.out.println("\n--- Summary of All Journeys --");  
        for (Journey currentTrip : tripList) {  
            currentTrip.showTicket();  
        }  
    
        System.out.println("Status: " + tripList.size() + " journeys processed successfully.");  
        input.close();  
    }  

}

------------------------------------------------------------------------------------------------------------------------------

### Updated Gantt Chart

------------------------------------------------------------------------------------------------------------------------------

![](C:\Users\ery70\AppData\Roaming\marktext\images\2026-02-15-23-13-46-image.png)

------------------------------------------------------------------------------------------------------------------------------

### Diary Entries

------------------------------------------------------------------------------------------------------------------------------

**11/02/2026:** 
Today I started working on the program logic  I thought about using loops in the program I wanted the program to show many journeys not only one First  it was a little confusing I also worked on my Gantt chart It was hard to choose good titles for my task so I spent more time planning.

**12/02/2026:** 
Today I worked on using ArrayList I learned how to save Journey objects in a list. This is important because the program needs to store many journeys At first I did not understand everything so I read examples and tried again. After some practice I understood better. I also continued improving my Gantt Chart.

**14/02/2026:** 
Today I finished my research about zones and ticket prices. I checked the dataset from example. I also finished writing the for loop. Now program can show all journeys from the list. I tested the program and it worked correctly. I was happy because the loop worked.

**15/02/2026:** 
Today I finished Milestone 4. I completed the ArrayList integration. Now the program can store and show multiple journeys. I checked my code and fixed small mistakes. I also updated my Gantt Chart. I feel good because my program is working .

------------------------------------------------------------------------------------------------------------------------------
