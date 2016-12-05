import cs345.bdsl._

object ScheduleExample extends Bdsl {

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

    CREATE NEW MEETING WITH NAME AS "Meeting with Lane" WITH DURATION AS 60; // MEETING ID: 2
    ASSIGN EMPLOYEE 3 TO EVENT MEETING 2;
    ASSIGN EMPLOYEE 5 TO EVENT MEETING 2;

    CREATE NEW MEETING WITH NAME AS "Company Party" WITH START AS "12/09/2016 03:30 PM" WITH DURATION AS 90; // MEETING ID: 3
    BATCH ALL EMPLOYEE ASSIGN EVENT MEETING 3;

    CREATE NEW MEETING WITH NAME AS "Staff Dev Meeting" WITH DURATION AS 60; // MEETING ID: 4
    BATCH ALL EMPLOYEE WHERE RANK EQUAL 3 ASSIGN EVENT MEETING 4;

    CREATE NEW MEETING WITH NAME AS "Software Scrum" WITH START AS "12/06/2016 08:30 AM" WITH DURATION AS 30; // MEETING ID: 5
    BATCH ALL EMPLOYEE WHERE RANK GREATERTHANEQUAL 2 ASSIGN EVENT MEETING 5;

    CREATE NEW MEETING WITH NAME AS "Software Scrum" WITH START AS "12/07/2016 08:30 AM" WITH DURATION AS 30; // MEETING ID: 6
    BATCH ALL EMPLOYEE WHERE RANK GREATERTHANEQUAL 2 ASSIGN EVENT MEETING 6;

    CREATE NEW MEETING WITH NAME AS "Software Scrum" WITH START AS "12/08/2016 08:30 AM" WITH DURATION AS 30; // MEETING ID: 7
    BATCH ALL EMPLOYEE WHERE RANK GREATERTHANEQUAL 2 ASSIGN EVENT MEETING 7;

    CREATE NEW MEETING WITH NAME AS "Client Project Meeting" WITH DURATION AS 60; // MEETING ID: 8
    BATCH ALL EMPLOYEE WHERE RANK EQUAL 3 ASSIGN EVENT MEETING 8;

    CREATE NEW MEETING WITH NAME AS "Meeting with Client" WITH DURATION AS 60 WITH START AS "12/08/2016 10:00 AM" // MEETING ID: 9
    BATCH ALL EMPLOYEE WHERE RANK EQUAL 2 ASSIGN EVENT MEETING 9;

    CREATE NEW MEETING WITH NAME AS "Code Review" WITH DURATION AS 60 WITH START AS "12/07/2016 08:00 AM" // MEETING ID: 10
    BATCH ALL EMPLOYEE WHERE RANK EQUAL 3 ASSIGN EVENT MEETING 10;

    CREATE NEW MEETING WITH NAME AS "Break Block" WITH DURATION AS 60 WITH START AS "12/07/2016 11:00 AM" // MEETING ID: 11
    ASSIGN EMPLOYEE 4 TO EVENT MEETING 11;

    CREATE NEW MEETING WITH NAME AS "Design Meeting" WITH DURATION AS 60 WITH START AS "12/07/2016 10:00 AM" // MEETING ID: 12
    ASSIGN EMPLOYEE 3 TO EVENT MEETING 12;
    ASSIGN EMPLOYEE 5 TO EVENT MEETING 12;

    CREATE NEW MEETING WITH NAME AS "Meeting with Steven" WITH DURATION AS 60 WITH START AS "12/07/2016 10:00 AM"; // MEETING ID: 13
    ASSIGN EMPLOYEE 2 TO EVENT MEETING 13;
    ASSIGN EMPLOYEE 4 TO EVENT MEETING 13;
    
    PRINT ALL MEETING;

    EXPORT CALENDAR "COMPANY_CAL";
    EXPORT EMPLOYEE 1 CALENDAR "Bill_Calendar";
    EXPORT EMPLOYEE 2 CALENDAR "Jane_Calendar";
    EXPORT EMPLOYEE 3 CALENDAR "Lane_Calendar";
    EXPORT EMPLOYEE 4 CALENDAR "Steven_Calendar";
    EXPORT EMPLOYEE 5 CALENDAR "Jill_Calendar";
    EXPORT EMPLOYEE 6 CALENDAR "Jack_Calendar";

    ASSIGN EMPLOYEE "Steven Jay" TO EVENT MEETING "Design Meeting";

    EXPORT CALENDAR "COMPANY_CAL_AFTER";
  }

}