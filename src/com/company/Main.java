package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        FIRSTRANDOM info = new FIRSTRANDOM();
        String FinalRealPass = info.getPass();



        Scanner Username = new Scanner(System.in);
        System.out.println("Please enter your desired username");
        String RealUserName = Username.next().trim();
        RealUserName = RealUserName.replace(" ", "");

        do {
            System.out.println("Please input a username that's over eight characters, and doesn't contain spaces!");
            RealUserName = Username.next().trim();
            RealUserName = RealUserName.replace(" ", "");
            if (RealUserName.length() > 8) {
                break;
            }

        } while (RealUserName.length() < 8);

        System.out.println("Verified username " + RealUserName + " now generating random secure password");
        System.out.println("Your Random Password: " + FinalRealPass);
        Scanner PhoneNumber = new Scanner(System.in);




        Scanner EndingPass = new Scanner(System.in);
        Scanner EndingUser = new Scanner(System.in);
        System.out.println("Please login with your new credentials to obtain your account\n");
        System.out.println("Enter your username\n");
        String FinalUser = EndingUser.next();
        System.out.println("Enter your password");
        String FinalPass = EndingPass.next();
        do {
            Scanner Tryagain = new Scanner(System.in);
            System.out.println("Your credentials are not correct, please try again");
            System.out.println("Enter your username\n");
            FinalUser = Tryagain.next();
            System.out.println("Enter your password");
            FinalPass = Tryagain.next();
            if (FinalUser == RealUserName || FinalPass == FinalRealPass) {
                break;

            }
        } while (FinalUser == RealUserName || FinalPass == FinalRealPass);


        System.out.println("Thanks for your cooperation, Enjoy your new account!");

    }
}
//A lot of additional work will have to be done, but this a more organized start than last time...
//Try your best, and hopefully it works out.
