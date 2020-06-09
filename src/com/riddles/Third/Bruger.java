package com.riddles.Third;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bruger {
    static Scanner sc = new Scanner(System.in);

    public void inputRunApp(){
        System.out.println("\n### Opgave 3: Hvor tit skal græsset slås ###");
       DecimalFormat df = new DecimalFormat("#.00");
        Grass grass = new Grass();
        System.out.println("Hvor højt er dit græss?");
        double currentHoejde = Double.parseDouble(sc.nextLine());
        System.out.println("Hvor højt må det blive?");
        double desiredHoejde = Double.parseDouble(sc.nextLine());
        int dageTilKlipning = grass.dageTilKlipning(currentHoejde,desiredHoejde);

        System.out.printf("Efter %d dage når græsset %.2f cm\n",dageTilKlipning,desiredHoejde);
    }
}
