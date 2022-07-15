package org.example;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class Date {
    public String date_input;

    public String apply_date_pattern(String date_input) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(this.date_input, formatter);
        return date.getDayOfWeek().toString();
    }

    public String getDate_input() {
        return date_input;
    }

    public void setDate_input(String date_input) {
        this.date_input = date_input;
    }

    public Date(String date_input) {
        this.date_input = date_input;
    }
}
