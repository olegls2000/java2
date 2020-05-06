public class Lesson7 {
    //Constants:
    public static void main(String[] args) {
        Animal lion = new Animal("leo", 29, "lion", Gender.MALE);
        MyConstants.ZEBRA.age=9;

        Lesson7 instance = new Lesson7();
        instance.myMeth();

        System.out.println(MyConstants.DAYS_OF_A_WEEK);

        int weeks = 400/MyConstants.DAYS_OF_A_WEEK;

        MyConstants.myMethSt();

        System.out.println(DaysOfWeek.MONDAY.isWorkingDay);
        System.out.println(DaysOfWeek.SUNDAY.isWorkingDay);
    }

    public void myMeth(){
        System.out.println("HHH");
    }



}
