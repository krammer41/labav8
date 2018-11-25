package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Base {
    ArrayList<Notation> ATCBase = new ArrayList<Notation>();

    public void add(Notation notation) {
        this.ATCBase.add(notation);
    }

    public void searchByNumber(String search) {
        int searchI = -1;
        boolean searchB = false;
        for (int i = 0; i < ATCBase.size(); i++) {
            if (ATCBase.get(i).getPhoneNumber().equals(search)) {
                searchB = true;
                searchI = i;
                break;
            }

        }
        if (searchB) {
            System.out.println("number found!");
            if (ATCBase.get(searchI).getNameOfTheSubscriber().equals(""))
                System.out.println("phone number is free!");
            else {
                System.out.println("Name Of The Subscriber:" + ATCBase.get(searchI).getNameOfTheSubscriber());
                System.out.println("Subscriber Address:" + ATCBase.get(searchI).subscriberAddress.getSubscriberAddress());
            }
        } else
            System.out.println("number not found!");


    }

    public void lisOfFreeNumbers() {
        for (int i = 0; i < ATCBase.size(); i++) {
            if (ATCBase.get(i).getNameOfTheSubscriber().equals("phone number is free")) {
                System.out.println("phone number " + ATCBase.get(i).phoneNumber+"is free.");
            }
        }
    }

    public void searchByName(String search){
        boolean flag=false;
        for (int i = 0; i <ATCBase.size() ; i++) {
            if (ATCBase.get(i).NameOfTheSubscriber.equals(search)){
                System.out.println("The object of the search is the owner of the phone number:"+ATCBase.get(i).phoneNumber);
                flag=true;

            }
        }
        if (!flag)
            System.out.println("The search has not given any results.");
    }

    public void changeOwner(String number){
        boolean flag =false;
        for (int i = 0; i <ATCBase.size() ; i++) {
            if (ATCBase.get(i).getPhoneNumber().equals(number)){
                Scanner scn=new Scanner(System.in);
                String temp="";
                if (ATCBase.get(i).getNameOfTheSubscriber().equals("phone number is free")){
                    System.out.println("phone number is free. \nspecify new owner:");
                    temp=scn.next();
                    ATCBase.get(i).setNameOfSubscriber(temp);
                }
                else{
                    System.out.println("The owner is "+ATCBase.get(i).getNameOfTheSubscriber()+"\nspecify new owner:");
                    temp=scn.next();
                    ATCBase.get(i).setNameOfSubscriber(temp);
                }
            }
            else
                System.out.println("number not found!");

        }

    }
}
