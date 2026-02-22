# IY4113 Milestone 3

| Assessment Details | Please Complete All Details                                           |
| ------------------ | --------------------------------------------------------------------- |
| Group              | A                                                                     |
| Module Title       | 4113 Applied Software Engineering using Object-Orientated Programming |
| Assessment Type    | Java Fundamentals part 3                                              |
| Module Tutor Name  | Jonathan Shore                                                        |
| Student ID Number  | P490576                                                               |
| Date of Submission | 08/02/2026                                                            |
| Word Count         | 701                                                                   |

- [x] *I confirm that this assignment is my own work. Where I have referred to academic sources, I have provided in-text citations and included the sources in
  the final reference list.*

- [x] *Where I have used AI, I have cited and referenced appropriately.

------------------------------------------------------------------------------------------------------------------------------

### Research (minimum of 2, at least 3)

------------------------------------------------------------------------------------------------------------------------------

**Title of research:** Java If else for ticket prices

**Reference (link):** [Java If ... Else](https://www.w3schools.com/java/java_conditions.asp)

**How does the research help with coding practise?:** I need to calculate different prices for my CityRide Lite app. I research how to use if and else because some times are peak and some are Offpeak This help me to check the time and give correct price to user

**Key coding ideas you could reuse in your program**:I could use a code like if (zone == 1) { price = 2.50; } to set the ticket costs.

**Screenshot of research:![](C:\Users\ery70\AppData\Roaming\marktext\images\2026-02-08-21-48-06-image.png)**

------------------------------------------------------------------------------------------------------------------------------

**Title of research:** Java.util.ArrayList in Java

**Reference (link):**[ArrayList in Java - GeeksforGeeks](https://www.geeksforgeeks.org/java/arraylist-in-java/)

**How does the research help with coding practise?:** I need to save manyj ourney objects for my CityRide lite program. I researched this site and I learned that ArrayList is a dynamic array. This is very important because I don't know how many journeys the user will add. Standard arrays are not good because they have a fixed size.

**Key coding ideas you could reuse in your program:** I could use the add() method to save a journey and size() method to count all trips in my MainApp class.

**Screenshot of research:**![](C:\Users\ery70\AppData\Roaming\marktext\images\2026-02-08-21-56-50-image.png)

------------------------------------------------------------------------------------------------------------------------------

### Program Code

---

 class Journey {  
    int startZone;  
    int endZone;  
    double ticketPrice;  

    void showTicket() {  
        System.out.println("Journey from zone " + startZone + " to " + endZone);  
        System.out.println("Price: GBp " + ticketPrice);  
    }  

}  

public class Main {  
    public static void main(String[] args) {  
        System.out.println("--- CityRide Lite Prototype --");  

        Journey trip1 = new Journey();  
        trip1.startZone = 1;  
        trip1.endZone = 2;  
        trip1.ticketPrice = 2.40;  
    
        trip1.showTicket();  
    
        System.out.println("Status: Basic object created succesfully.");  
    }  

}

------------------------------------------------------------------------------------------------------------------------------

### Updated Gantt Chart

------------------------------------------------------------------------------------------------------------------------------

| **Milestone** | **Task Description**             | Jan 24     | Jan 25 | Jan 31 | Feb 1  | Feb 8  |
|:------------- | -------------------------------- | ---------- | ------ | ------ | ------ | ------ |
| **MS 1**      | **Analysis & Requirements**      | **[████]** |        |        |        |        |
|               | Purpose of the Program           | **[████]** |        |        |        |        |
|               | IPO Table & System Constraints   |            | [████] |        |        |        |
|               | Diary Entries                    |            | [████] |        |        |        |
| **MS 2**      | **Design and Algorithms**        |            |        | [████] |        |        |
|               | Flowcharts  and Algorithm design |            |        | [████] |        |        |
|               | Research project                 |            |        |        | [████] |        |
| **MS 3**      | **Java Implementation**          |            |        |        |        | [████] |
|               | Researchs                        |            |        |        |        | [████] |
|               | Start writng code                |            |        |        |        | [████] |
| **MS 4**      | **Testing  and Debugging**       |            |        |        |        |        |
| **MS 5**      | **Final Submission**             |            |        |        |        |        |

------------------------------------------------------------------------------------------------------------------------------

### Diary Entries

------------------------------------------------------------------------------------------------------------------------------

* 08/02/2026

Today I started my CityRide Lite project and I wrote the first java code. I used my notes from the class and some examples from Geeksforgeeks website to help me I created a simple class for journey and I made my first object. It was a bit difficult at first but I followed the class examples and now my code works. I can show the ticket price on the screen. I am happy because I understand the basic coding now and I will add more things soon.

------------------------------------------------------------------------------------------------------------------------------
