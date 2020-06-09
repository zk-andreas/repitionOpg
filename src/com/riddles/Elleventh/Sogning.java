package com.riddles.Elleventh;

public class Sogning {
    public Sogning() {
        System.out.println("### Søgnings opgave ###");
    }
    public int runStringFindArray(String[] array, String ord) throws Exception {

        if(ord.isEmpty()){
            throw new Exception("String må ikke være tom!");
        }
        if(array == null){
            throw new Exception("Array må ikke være tom!");
        }

        for(int i = 0; i<array.length;i++){
            if(array[i].equals(ord)){
                return i;
            }
        }
        throw new Exception("\"" + ord + "\" findes ikke i arrayet.");
    }
}
