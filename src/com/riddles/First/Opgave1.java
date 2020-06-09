package com.riddles.First;

import java.util.ArrayList;
import java.util.Collections;

public class Opgave1 {

    public void runApp() {
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("\n### ArrayList Opgave ###");
        System.out.println(firstList(strings,"aac"));
        System.out.println(firstList(strings,"aab"));
        System.out.println(firstList(strings,"aaa"));
        System.out.println(firstList(strings,null));
    }

    public boolean firstList(ArrayList<String> arrayList, String size){
        boolean def = false;
        if(arrayList.contains(size) || size == null){
            return false;
        }
        if(!arrayList.contains(size)){
            arrayList.add(size);
            Collections.sort(arrayList);

            def = true;
        }
        System.out.print(arrayList);
        return def;
    }

}
