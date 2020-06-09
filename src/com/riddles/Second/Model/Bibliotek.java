package com.riddles.Second.Model;

import java.util.ArrayList;

public class Bibliotek{

    private final ArrayList<Bog> boger = new ArrayList<>();

    public Bibliotek() {
    }

    public boolean addBog(Bog bog){
        if(!boger.contains(bog)){
            boger.add(bog);
            return true;
        }else{
            System.out.println(bog.getTitel() + " Allready exist.");
            return false;
        }
    }

    public boolean findBog(Bog bog) {
        for(Bog b : boger) {
            if (b.getIsbn() == bog.getIsbn()) {
                return true;
            }
        }
        return false;
    }

    public int countBog(){
        return boger.size();
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "boger=" + boger +
                '}';
    }
}
