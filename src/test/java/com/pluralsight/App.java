package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book[] books = new Book[20];

        books[0] = new Book(1, "9780000000001","The Complete Book of Classic Cars", false);
        books[1] = new Book(2, "9780000000002", "The History of the Automobile", false);
        books[2] = new Book(3, "9780000000003", "Sports Cars: A Complete History", false);
        books[3] = new Book(4, "9780000000004", "American Muscle Cars", false);
        books[4] = new Book(5, "9780000000005", "The Art of Automotive Design", false);
        books[5] = new Book(6, "9780000000006", "Classic Ferrari: The Essential Guide", false);
        books[6] = new Book(7, "9780000000007", "Porsche: A History of Excellence", false);
        books[7] = new Book(8, "9780000000008", "The Story of Ford Mustang", false);
        books[8] = new Book(9, "9780000000009", "Chevrolet Corvette: Generations", false);
        books[9] = new Book(10, "9780000000010", "The Complete Book of BMW", false);
        books[10] = new Book(11, "9780000000011", "Japanese Performance Cars", false);
        books[11] = new Book(12, "9780000000012", "The History of Toyota", false);
        books[12] = new Book(13, "9780000000013", "Lamborghini: Design and Performance", false);
        books[13] = new Book(14, "9780000000014", "The World of Formula One", false);
        books[14] = new Book(15, "9780000000015", "Automotive Engineering Basics", false);
        books[15] = new Book(16, "9780000000016", "Electric Cars: The Future of Driving", false);
        books[16] = new Book(17, "9780000000017", "The Evolution of Mercedes-Benz", false);
        books[17] = new Book(18, "9780000000018", "The Ultimate Guide to Car Maintenance", false);
        books[18] = new Book(19, "9780000000019", "Vintage Cars of the World", false);
        books[19] = new Book(20, "9780000000020", "Supercars: Speed and Innovation", false);

//        Book book = new Book();
//        System.out.println(books[4].isCheckedOut());
//        books[4].CheckOut("Ruby");
////        System.out.println(books[4].isCheckedOut());
////        books[4].CheckIn();
//        System.out.println(books[4].getCheckedOutTo());
        int menuDecision = 0;
        while(menuDecision != 3) {
            displayMenu(input);
            menuDecision = input.nextInt();
            input.nextLine();

            switch (menuDecision) {
                case 1 -> showAvailableBooks(books, input);
                case 2 -> checkedOutBooks(books, input);
                case 3 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid Input!");
            }
        }
    }

    public static void displayMenu(Scanner input){
        System.out.print("""
            1. Show Available Books
            2. Show Checked Out Books
            3. Exit - closes out of the application
            Enter An Option:\s""");

    }

    public static void showAvailableBooks(Book[] books, Scanner input){

        int i = 0;
        for(Book book : books){
            if(!book.isCheckedOut()) {
                System.out.println(book);
                i++;
            }
        }

        promptBookCheckOut(input, books);
        //String bookTitle = input.nextLine();

        //System.out.println(bookTitle);
    }

    public static void checkedOutBooks(Book[] books, Scanner input){
        //int i = 0;
        for(Book book : books){
            if(book.isCheckedOut()) {
                System.out.println(book);
                System.out.println(book.getCheckedOutTo());
                //i++;
            }
        }

        System.out.print("""
                C - to Check In a book
                X - to go back to the home screen:\s""");
        String returnBookOrExit = input.nextLine();
        input.nextLine();

        checkInBook(input, returnBookOrExit, books);
    }

    public static void promptBookCheckOut(Scanner input, Book[] books){

        System.out.print("""
                --------------------------------
                Enter book title you want to check out or
                EXIT to exit:\s""");
        String checkOutBook = input.nextLine();
        //input.nextLine();
        int i = 0;
        if(checkOutBook.equalsIgnoreCase("exit")){
            System.out.println("Goodbye!");
        }else{
            System.out.print("What is your name: ");
            String userName = input.nextLine();
            input.nextLine();
            for (Book book : books){
                if(book.getTitle().equalsIgnoreCase(checkOutBook)){
                    book.CheckOut(userName);
                    System.out.println("Book " + book.getTitle() + " checked out.");
                }
            }
        }
//        System.out.println(checkOutBook);
    }

    public static void checkInBook(Scanner input, String returnBookOrExit, Book[] books){
        if(returnBookOrExit.equalsIgnoreCase("c")){
            System.out.println("Enter ID of Book: ");
            int bookId = input.nextInt();
            for(Book book : books){
                if(book.getId() == bookId){
                    book.CheckIn();
                    System.out.println(book);
                    //displayMenu(input);
                }
            }
        }

        if (returnBookOrExit.equalsIgnoreCase("x")){
            displayMenu(input);
            input.nextLine();
        }
//        System.out.println("""
//                C - to Check In a book
//                X - to go back to the home screen:\s""");
//        String returnBookOrExit = input.nextLine();
        //input.nextLine();
    }
}
