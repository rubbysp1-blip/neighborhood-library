package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    public void CheckOut(String name){
        this.checkedOutTo = name;
        this.isCheckedOut = true;
    }

    public void CheckIn(){

    }
}
