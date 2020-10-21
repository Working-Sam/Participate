package myPractice;

import java.util.Scanner;

public class Participate {
    public static void sellTicket(String name) {
        String participantsName = name;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        byte numberOfTicketsSold = 0;
        final int TOTAL_PARTICIPANTS = 3;
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {
            System.out.println("total ticket left= " + (TOTAL_PARTICIPANTS - numberOfTicketsSold));
            System.out.println("enter your name ");
            String name = scn.nextLine();
            sellTicket(name);
            numberOfTicketsSold++;
            if (numberOfTicketsSold == TOTAL_PARTICIPANTS) {
                System.out.println("sorry, ticket sold out!");
                break;
            }
        }
        scn.close();
    }
}

