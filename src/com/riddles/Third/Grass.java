package com.riddles.Third;

import java.text.DecimalFormat;

public class Grass {
    public DecimalFormat df = new DecimalFormat("#.00");
    public double hoejde;

    public Grass() {
        this.hoejde = 0.8;
    }
    public int dageTilKlipning(double currentHoejde, double desiredHoejde){
        int klippeTid = 0;

        while(currentHoejde < desiredHoejde){
            klippeTid++;
            currentHoejde += hoejde;
            System.out.println(df.format(currentHoejde));
        }
        return klippeTid;
    }
}
