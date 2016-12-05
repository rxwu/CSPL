import cs345.bdsl._

object ScheduleTest extends Bdsl {

  def main(args: Array[String]): Unit = {
    CREATE NEW EMPLOYEE WITH NAME AS "Bill Peters" WITH RANK AS 1; // EMP ID: 1

    CREATE NEW EMPLOYEE WITH NAME AS "Jane Doe" WITH RANK AS 2; // EMP ID : 2
    CREATE NEW EMPLOYEE WITH NAME AS "Lane Smith" WITH RANK AS 2; // EMP ID : 3
    CREATE NEW EMPLOYEE WITH NAME AS "Steven Jay" WITH RANK AS 2; // EMP ID : 4

    CREATE NEW EMPLOYEE WITH NAME AS "Jill Kale" WITH RANK AS 3; // EMP ID : 5
    CREATE NEW EMPLOYEE WITH NAME AS "Jack Pale" WITH RANK AS 3; // EMP ID : 6

    PRINT ALL EMPLOYEE;

    CREATE NEW MEETING WITH NAME AS "Meeting with CEO" WITH DURATION AS 60; // MEETING ID: 1
    ASSIGN EMPLOYEE 1 TO EVENT MEETING 1;
    ASSIGN EMPLOYEE 3 TO EVENT MEETING 1;
    CREATE NEW MEETING WITH NAME AS "Meeting with CEO2" WITH DURATION AS 60; // MEETING ID: 1

    PRINT ALL MEETING;
    ASSIGN EMPLOYEE 1 TO EVENT MEETING 2;


    CREATE NEW MEETING WITH NAME AS "Company Party" WITH START AS "12/09/2016 03:30 PM" WITH DURATION AS 60; // MEETING ID: 2
    // Assign all available to time. SHOULD NOT NEED MORE CODE.

    // CREATE NEW MEETING WITH NAME AS "Staff Dev Meeting"; // MEETING ID: 3
    // BATCH ALL EMPLOYEE WHERE RANK EQUAL 3 ASSIGN TO MEETING 3;

    // CREATE NEW MEETING WITH NAME AS "Software Scrum" WITH START AS "12/06/2016 08:30 PM" WITH DURATION AS 30; // MEETING ID: 4
    // BATCH ALL EMPLOYEE WHERE RANK LESSTHANEQUAL 2 ASSIGN TO MEETING 4;

    // CREATE NEW MEETING WITH NAME AS "Software Scrum" WITH START AS "12/08/2016 08:30 PM" WITH DURATION AS 30; // MEETING ID: 5
    // BATCH ALL EMPLOYEE WHERE RANK LESSTHANEQUAL 2 ASSIGN TO MEETING 5;
    
    PRINT ALL MEETING;
  }

}