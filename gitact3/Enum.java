public class Enum{
   
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] Strawhat) {
       
        Day today = Day.FRIDAY;

       
        switch (today) {
            case MONDAY:
                System.out.println("Monday its another day, bunal!");
                break;
            case TUESDAY:
                System.out.println("Tuesday its 2nd day of the week");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday its middle of work week");
                break;
            case THURSDAY:
                System.out.println("Thursday is another day");
                break;
            case FRIDAY:
                System.out.println("Friday, 1 more day to sunday");
                break;
            case SATURDAY:
                System.out.println("Saturday, last work day");
                break;
            case SUNDAY:
                System.out.println("Sunday, a day for family time");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
}
