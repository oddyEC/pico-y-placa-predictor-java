package org.example;

import java.text.ParseException;
import java.time.LocalTime;
import java.util.Objects;

public class Car {
    private final String plate_number;
    private final String time;

    private final String date;

    public Car(String plate_number, String date, String time) {
        this.plate_number = plate_number;
        this.time = time;
        this.date = date;
    }
    public boolean allowed_to_drive(String time) throws ParseException {
        LocalTime time1 = LocalTime.parse(time);
        LocalTime morning1 = LocalTime.parse("07:00");
        LocalTime morning2 = LocalTime.parse("09:30");
        LocalTime afternoon1 = LocalTime.parse("16:00");
        LocalTime afternoon2 = LocalTime.parse("19:30");
        if(time1.isAfter(morning1) && time1.isBefore(morning2)){
            return last_digit_day();
        }else if(time1.isAfter(afternoon1) && time1.isBefore(afternoon2))
            return last_digit_day();
        return false;
    }
    public boolean last_digit_day() throws ParseException {
        String last_digit = this.plate_number.substring(this.plate_number.length() - 1);
        Date day_consult = new Date(this.date);
        String day_consult_string = day_consult.apply_date_pattern(this.date);
        if(Objects.equals(day_consult_string, "MONDAY") && last_digit.equals("1") || last_digit.equals("2")){
            return true;
        }if(Objects.equals(day_consult_string, "TUESDAY") && last_digit.equals("3") || last_digit.equals("4")){
            return true;
        }if(Objects.equals(day_consult_string, "WEDNESDAY") && last_digit.equals("5") || last_digit.equals("6")){
            return true;
        }if(Objects.equals(day_consult_string, "THURSDAY") && last_digit.equals("7") || last_digit.equals("8")){
            return true;
        }if(Objects.equals(day_consult_string, "FRIDAY") && last_digit.equals("9") || last_digit.equals("0")){
            return true;
        }else return false;


    }
}
