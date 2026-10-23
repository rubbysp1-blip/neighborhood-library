package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    Book[] books = new Book[20];

    public Book(){

    }

    public Book(int id, String isbn, String title) {
        this.title = title;
        this.isbn = isbn;
        this.id = id;
    }


    public void CheckOut(String name){
        checkedOutTo = name;
        isCheckedOut = true;
    }

    public void CheckIn(){
        isCheckedOut = false;
        checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return "Book\n" + "---------------------\n" +
                "ISBN: " + isbn + '\'' +
                "ID: " + id +
                "Title: '" + title;
    }
}
