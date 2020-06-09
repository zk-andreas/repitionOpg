package com.riddles.Second.Model;

public class Bog implements Comparable<Bog> {
    private String isbn;
    private String titel;
    private int ar;

    public Bog(String isbn, String titel, int ar) {
        this.isbn = isbn;
        this.titel = titel;
        this.ar = ar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return titel + " - " + ar + " - ISBN: " + isbn;
    }

    @Override
    public boolean equals(Object o) {
      boolean retVal = false;
      if(o == this)
          retVal = true;
      if(! (o instanceof Bog))
          return retVal;
      Bog otherBog = (Bog) o;
      if(this.isbn.equals(otherBog.isbn)){
          retVal = true;
      }
      return retVal;
    }


    @Override
    public int compareTo(Bog o) {
        return this.ar - o.getAr();
    }
}
