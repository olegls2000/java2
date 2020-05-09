package lesson7;

import data.Animal;
import enums.Gender;
import enums.DaysOfWeek;
import utils.MyConstants;

public class HomeWork {
    //Constants:
    public static void main(String[] args) {
        Animal lion = new Animal("leo", 29, "lion", Gender.MALE);

        HomeWork instance = new HomeWork();
        instance.myMeth();

        System.out.println(MyConstants.DAYS_OF_A_WEEK);

        int weeks = 400/MyConstants.DAYS_OF_A_WEEK;

        MyConstants.myMethSt();

        //System.out.println(DaysOfWeek.MONDAY.isWorkingDay);
        //System.out.println(DaysOfWeek.SUNDAY.isWorkingDay);
    }

    public void myMeth(){
        System.out.println("HHH");
    }



}
