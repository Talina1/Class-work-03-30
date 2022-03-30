package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Class work
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input temperature: ");
        int temperature = scanner.nextInt();

        String activity = null;

        if (temperature >= 80) {
            activity = "Swimming";
        } else if (temperature >= 60) {
            activity = "Tennis";
        } else if (temperature >= 40) {
            activity = "Golf";
        } else {
            activity = "Skiing";
        }

        System.out.println("The right activity for this temperature is: " + activity);
        }
    }
