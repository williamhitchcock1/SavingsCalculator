package com.example.savingscalculator;
import android.util.Log;

import java.text.*;
import java.util.*;

public class CalculateDate {

    private String date;
    private int days;

    public String getDate() {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public int getDays() {
        return days;
    }

    public void setDays (int days) {
        this.days = days;
    }


    CalculateDate(String date, int days){
        this.date=date;
        this.days=days;
    }

    String calculateFinDate(String date, int days) {
        String finishDate;
        try {
            if(date==null){
                finishDate = " ";
            }else {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

                Calendar c = Calendar.getInstance(); // Get Calendar Instance

                c.setTime(sdf.parse(date));
                c.add(Calendar.DATE, (days - 1));

                sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date resultDate = new Date(c.getTimeInMillis());
                finishDate = sdf.format(resultDate);
            }
            return finishDate;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
