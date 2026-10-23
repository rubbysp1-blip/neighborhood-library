package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Book[] books = new Book[20];

        books[0] = new Book(1, "9780000000001","The Complete Book of Classic Cars");
        books[1] = new Book(2, "9780000000002", "The History of the Automobile");
        books[2] = new Book(3, "9780000000003", "Sports Cars: A Complete History");
        books[3] = new Book(4, "9780000000004", "American Muscle Cars");
        books[4] = new Book(5, "9780000000005", "The Art of Automotive Design");
        books[5] = new Book(6, "9780000000006", "Classic Ferrari: The Essential Guide");
        books[6] = new Book(7, "9780000000007", "Porsche: A History of Excellence");
        books[7] = new Book(8, "9780000000008", "The Story of Ford Mustang");
        books[8] = new Book(9, "9780000000009", "Chevrolet Corvette: Generations");
        books[9] = new Book(10, "9780000000010", "The Complete Book of BMW");
        books[10] = new Book(11, "9780000000011", "Japanese Performance Cars");
        books[11] = new Book(12, "9780000000012", "The History of Toyota");
        books[12] = new Book(13, "9780000000013", "Lamborghini: Design and Performance");
        books[13] = new Book(14, "9780000000014", "The World of Formula One");
        books[14] = new Book(15, "9780000000015", "Automotive Engineering Basics");
        books[15] = new Book(16, "9780000000016", "Electric Cars: The Future of Driving");
        books[16] = new Book(17, "9780000000017", "The Evolution of Mercedes-Benz");
        books[17] = new Book(18, "9780000000018", "The Ultimate Guide to Car Maintenance");
        books[18] = new Book(19, "9780000000019", "Vintage Cars of the World");
        books[19] = new Book(20, "9780000000020", "Supercars: Speed and Innovation");

        displayMenu(input);
        int menuDecision = input.nextInt();

        switch (menuDecision){
            case 1-> showAvailableBooks();
            case 2-> checkOutBooks();
            default -> System.out.println("Invalid Input!");
        }

    }

    public static void displayMenu(Scanner input){
        System.out.print("""
            1. Show Available Books
            2. Show Checked Out Books
            Exit - closes out of the application
            Enter An Option:\s""");

    }

    public static void showAvailableBooks(){

    }

    public static void checkOutBooks(){

    }
}
