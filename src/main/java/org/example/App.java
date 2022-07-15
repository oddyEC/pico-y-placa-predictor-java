package org.example;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        Scanner sc= new Scanner(System.in);
        System.out.println("******** Pico y Placa Predictor ********\n" +
                "ANT recommends to verify if your car is allowed to circulate in order to avoid fines.");
        System.out.println("Enter your license plate: ");
        String license_plate = sc.nextLine(); 
        System.out.println("Enter the date in format (dd/MM/yyyy):  ");
        String date_input = sc.nextLine();
        System.out.println("Enter the time in HH:mm: ");
        String time_input = sc.nextLine();
        Date day = new Date(date_input);
        String dayString = day.apply_date_pattern(date_input);
        final Car car = new Car(license_plate, date_input, time_input);
        if(car.allowed_to_drive(time_input)){
            System.out.println(dayString + ", your car is not allowed to circulate at this " + time_input + " time and date: " + date_input );
        }else {
            System.out.println(dayString + ", your car is allowed to circulate at this " + time_input + " time and date: " + date_input );
        }
    }
}
