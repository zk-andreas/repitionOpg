package com.riddles.Second;

import com.riddles.Second.Model.Bibliotek;
import com.riddles.Second.Model.Bog;

public class BogController {
    Bibliotek bib = new Bibliotek();

    public BogController() {
        System.out.println("\n### Bog Opgave ###");
    }
    public void addBooks(){
        System.out.println("# Opret Bøger #");
        Bog bog1 = new Bog("99921-58-10-7","bog1", 1997);
        System.out.println(bog1);
        Bog bog2 = new Bog("9971-5-0210-0", "bog2", 1998);
        System.out.println(bog2);
        Bog bog3 = new Bog("960-425-0590", "bog3", 1999);
        System.out.println(bog3);
        Bog bog4 = new Bog("80-902734-1-6", "bog4", 2000);
        System.out.println(bog4);
        Bog bog5 = new Bog("99921-58-10-7","bog5", 2001);
        System.out.println(bog5);

        System.out.println("### Add Books ###");
        bib.addBog(bog1);
        bib.addBog(bog2);
        bib.addBog(bog3);
        bib.addBog(bog4);
        bib.addBog(bog5);
        System.out.println(bib.countBog() + " Books Added.\n");

        System.out.println("### Find Books ###");
        if(bib.findBog(bog1)){
            System.out.println("Book Found");
            System.out.println(bog1);
        }

    }
}
