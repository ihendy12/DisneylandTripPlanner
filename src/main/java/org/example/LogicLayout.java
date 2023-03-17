package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class LogicLayout {

    public static String getDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        int countForDateCheck = 0;
        String day = "";
        do {
            System.out.println("What day of the week is that? ");
            String dayOfWeekVisiting = scanner.next();
            if (dayOfWeekVisiting.equalsIgnoreCase("monday") || dayOfWeekVisiting.equalsIgnoreCase("m")) {
                countForDateCheck++;
                return day = "Monday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("tuesday") || dayOfWeekVisiting.equalsIgnoreCase("t")) {
                countForDateCheck++;

                return day = "Tuesday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("wednesday") || dayOfWeekVisiting.equalsIgnoreCase("w")) {
                countForDateCheck++;
                return day = "Wednesday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("thursday") || dayOfWeekVisiting.equalsIgnoreCase("th")) {
                countForDateCheck++;
                return day = "Thursday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("friday") || dayOfWeekVisiting.equalsIgnoreCase("f")) {
                countForDateCheck++;
                return day = "Friday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("saturday") || dayOfWeekVisiting.equalsIgnoreCase("sa")) {
                countForDateCheck++;
                return day = "Saturday";
            } else if (dayOfWeekVisiting.equalsIgnoreCase("sunday") || dayOfWeekVisiting.equalsIgnoreCase("su")) {
                countForDateCheck++;
                return day = "Sunday";
            } else {
                System.out.println("Please input a correct day of the week");
            }
        } while (countForDateCheck == 0);


        System.out.println(day);
        scanner.close();
        return day;
    }


    public static void main(String[] args) {

        //Goals for project
        // 1. Make an itinerary for a persons day at Disneyland based on the averaging the prior 3 years data to find the
        // shortest wait-time per 30 minute blocks

        // Will need to make sure we are finding an API or database that has historical wait times for Disneyland
        // Will need input from customer on the following: Day they are visiting, time they want to start, time they want
        // to end, if they want to include food and snack breaks (if so, how many), and if they want to watch
        // a parade, fireworks, or Fantasmic!, or all 3


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Disneyland Trip Planner!");
        System.out.println("We will start by asking some questions about your upcoming trip");
        System.out.println("What day will you be visiting? Please enter in MM-DD format");
        String dateVisiting = scanner.next();


// IF possible, replace with a dropdown and select menu

        System.out.println("Sounds good, looks like you will be visiting on " + getDayOfWeek() + ", " + dateVisiting);




        }




}