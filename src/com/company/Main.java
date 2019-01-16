package com.company;

import java.util.Scanner;

public class Main {

                public static void main(String[] args) {

                String cusName;
                double purAmount, taxCode;
                double salesTax, total;

                Scanner n = new Scanner(System.in);
                System.out.println("Enter the customer's name");
                cusName = n.nextLine();
                System.out.println("Enter Purchase Amount");
                purAmount = n.nextInt();
                System.out.println("Enter tax code");
                taxCode = n.nextInt();

                if (taxCode==0){
                    salesTax= 0;
                    total = purAmount + salesTax;
                    System.out.println(cusName +"\n" +purAmount +"\n" +"0%\n" +total);}

                else if (taxCode==1){
                    salesTax= 0.03;
                    total = purAmount + salesTax*purAmount;
                    System.out.println(cusName +"\n" +purAmount +"\n" +"3%\n" +total);}
                else if (taxCode==2){
                    salesTax= 0.05;
                    total = purAmount + salesTax*purAmount;
                    System.out.println(cusName +"\n" +purAmount +"\n" +"5%\n" +total);}

                else if (taxCode==3){
                    salesTax= 0.07;
                    total = purAmount + salesTax*purAmount;
                    System.out.println(cusName +"\n" +purAmount +"\n" +"7%\n" +total);}

                else if (taxCode>3){
                    System.out.println("Invalid");}

            }
        }



