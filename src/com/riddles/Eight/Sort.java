package com.riddles.Eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Sort {
    Scanner sc = new Scanner(System.in);

    public void sortStrings(){
        ArrayList<String> strings = new ArrayList<>();
        int counter = 0;
        int limit = 5;

        while(counter<limit){
            System.out.println("Skriv et ord");
            String word = sc.nextLine();
            strings.add(word);
            counter++;
        }
        for(String s : strings){
            System.out.println(s);
        }
        System.out.println();
        strings.sort(Collections.reverseOrder());
        for(String s : strings){
            System.out.println(s);
        }
    }
}
