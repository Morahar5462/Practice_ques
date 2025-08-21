package Mor;

import java.util.Scanner;

public class Booking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of rows:");
        int rows = sc.nextInt();
        boolean[][] a = new boolean[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the no of seats in row " + (i + 1) + ": ");
            a[i] = new boolean[sc.nextInt()];
        }

        int pos, usercol;
        while (true) {
            System.out.println("Seat Booking");
            System.out.print("Enter the row: ");
            char userRow = sc.next().charAt(0);
            pos = Character.toUpperCase(userRow) - 'A' + 1;

            if (pos <= 0 || pos > rows) {
                System.out.println("Enter the valid Row ");
                continue;
            }

            System.out.print("Enter the seat no: ");
            usercol = sc.nextInt();

            if (usercol <= 0 || usercol > a[pos - 1].length) {
                System.out.println("Enter valid seat no ");
                continue;
            }

            break;
        }

        a[pos - 1][usercol - 1] = true;
        System.out.println("Ticket Booked Successfully");
        System.out.println("Theatre Booking Status");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
