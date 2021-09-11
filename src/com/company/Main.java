package com.company;
import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();
        System.out.print("What is the state? ");
        String state = input.next();

        System.out.print("The subtotal is $" +String.format("%.2f", amount));

        if(state.toLowerCase().equals("wi")) {
            double tax = amount * 0.055;
            System.out.print("\nThe tax is $" +String.format("%.2f", tax));

            amount = amount + tax;
            System.out.print("\nThe total is $" +String.format("%.2f", amount));
        }
    }
}
