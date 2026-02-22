# IY4113 Milestone 1

| Assessment Details | Please Complete All Details                                           |
| ------------------ | --------------------------------------------------------------------- |
| Group              | A                                                                     |
| Module Title       | 4113 Applied Software Engineering using Object-Orientated Programming |
| Assessment Type    | Java Fundamentals part 1                                              |
| Module Tutor Name  | Jonathan Shore                                                        |
| Student ID Number  | P490576                                                               |
| Date of Submission | 25/01/2026                                                            |
| Word Count         | 1065                                                                  |

- [x] *I confirm that this assignment is my own work. Where I have referred to academic sources, I have provided in-text citations and included the sources in
  the final reference list.*

- [x] *Where I have used AI, I have cited and referenced appropriately.

------------------------------------------------------------------------------------------------------------------------------

### Purpose of the Program

------------------------------------------------------------------------------------------------------------------------------

The main aim of this project is to build a Java console app called CityRide Lite. This program helps a user to track their public transport journeys for just one day It calculates prices for each trip gives discounts and checks if the user reached the daily money limit so they dont pay too much.

**Core program functionality**

Add Journeys: Users can enter trip details like date, start end zones and if it is peak time

Manage Discounts: It gives lower prices for students,childs and seniors based on the dataset

Show summaries: The system show total trips ,total cost and the most expensive journey ID

Filter and Remove: User can filter trips by passenger type or delete a journey if they made a mistake

Daily Caps: When a passenger reach their daily limit next trips are charged £0

**System constraints**

Zone limit: You can only use zones from 1 to 5.

Console only: This is a text-based program, no fancy graphics or windows.

Validation: If the user enters a wrong zone or empty text app should show a error and ask again

Single day only: App is only for one day of trips it doesnt track different dates or weeks. 

Fixed Dataset: The program must strictly follow  provided fare and discount rules.

Memory Storage: Data is stored in the system memory (RAM) and will be lost once the program is closed.

------------------------------------------------------------------------------------------------------------------------------

### Input Process Output Table

------------------------------------------------------------------------------------------------------------------------------

| **Feature / Task**   | **Inputs**                                            | **Processing**                                                                                                                                                              | **Outputs**                                                       |
| -------------------- | ----------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------- |
| **Add New Journey**  | Date, Start Zone- End Zone, Passenger Type, Time Band | 1. Check if zones are between 1 and 5. 2. Calculate zones crossed using the distance formula. 3. Get the price from the dataset. 4. Apply discount and check the Daily Cap. | Confirmation message unique ID for the trip, and the final price. |
| **Display Journeys** | Menu selection                                        | 1. Access the ArrayList where data is stored. 2. Use a Loop to read every journey object. 3. Print the data in a clean format.                                              | Table showing all journeys or a message if the list is empty.     |
| **Filter Data**      | User choice                                           | 1. Get the filter word from the user. 2. Compare it with the data in the list. 3. Show only the trips that match.                                                           | List of filtered journeys and a count of how many were found.     |
| **Daily Summary**    | Menu selection                                        | 1. Calculate the sum of all fares. 2. Find the average price. 3. Identify the journey with the highest cost.                                                                | Total spent today, average cost, and the most expensive trip.     |
| **Delete Journey**   | Journey ID                                            | 1. Search the list for the matching ID. 2. Remove the object from the memory. 3. Update the daily total.                                                                    | Success message or  an error if ID is wrong.                      |
| **Reset System**     | Menu selection                                        | 1. Use the clear method on the list. 2. Set all daily counters back to zero.                                                                                                | System reset message.                                             |

------------------------------------------------------------------------------------------------------------------------------

### Gantt Chart

------------------------------------------------------------------------------------------------------------------------------

| **Milestone** | **Task Description**           | **Week 1 (Jan 19-25)** | **Week 2 (Jan 26-Feb 1)** | **Week 3 (Feb 2-8)** | **Week 4 (Feb 9-15)** |
| ------------- | ------------------------------ | ---------------------- | ------------------------- | -------------------- | --------------------- |
| **MS 1**      | **Analysis & Requirements**    | **[██████]**           |                           |                      |                       |
|               | Purpose of the Program         | **[██████]**           |                           |                      |                       |
|               | IPO Table & System Constraints | **[██████]**           |                           |                      |                       |
|               | Diary Entries                  | **[██████]**           |                           |                      |                       |
| **MS 2**      | **Design and Algorithms**      |                        | [ ]                       |                      |                       |
|               | Flowcharts for Main Logic      |                        | [ ]                       |                      |                       |
|               | Research on Java Data Types    |                        | [ ]                       |                      |                       |
| **MS 3**      | **Java Implementation**        |                        |                           | [ ]                  |                       |
|               | Coding Classes Methods         |                        |                           | [ ]                  |                       |
|               | Fare Calculation Logic         |                        |                           | [ ]                  |                       |
| **MS 4**      | **Testing  and Debugging**     |                        |                           |                      | [ ]                   |
| **MS 5**      | **Final Submission**           |                        |                           |                      | [ ]                   |

------------------------------------------------------------------------------------------------------------------------------

### Diary Entries

------------------------------------------------------------------------------------------------------------------------------

**24/01/2026 - Entry 1: Starting the Plan and Timeline** Today I started  reading the project instructions for CityRide Lite. I spent  time to understand how the daily cap and the zone formula works. After that I worked on my project plan and the Gantt chart. I divided all the tasks into four weeks because the final deadline for the code is in middle of February. I put the analysis in the first week so I can start the design diagrams in the second week. It was  hard to plan everything at the start, but now I have a good timeline for the project. I also decided to store the data in the memory because we dont need to use files for this part.

**25/01/2026 - Entry 2: Finishing Milestone 1 and IPO Table** Today I finished the analysis part and the full IPO table. I made sure to include the rules for all passenger types like students,children and seniors because they have different discounts. I also checked the daily caps again. For example adults have a 8 pound limit and students have a 6 pound limit. This is very important for the price calculation logic. I checked everything again to make sure it is correct. Now the document is finished and ready. I will start the design part of the project next week.

------------------------------------------------------------------------------------------------------------------------------
