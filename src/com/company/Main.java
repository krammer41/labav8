package com.company;

public class Main {

    public static void main(String[] args) {
        formulationOfTheProblem();

        Notation n = new Notation();
        System.out.println("_________________________");
        System.out.println(n.getNameOfTheSubscriber());
        n.setNameOfSubscriber("");
        System.out.println(n.getNameOfTheSubscriber());

        System.out.println("_________________________");
        System.out.println(n.getPhoneNumber());
        n.setPhoneNumber("+380665285745");
        System.out.println(n.getPhoneNumber());

        System.out.println("_________________________");


        System.out.println(n.subscriberAddress.getSubscriberAddress());
        n.subscriberAddress.setSubscriberAddress("Odessa", "Dovga", "11");
        System.out.println(n.subscriberAddress.getSubscriberAddress());

        Notation n2=new Notation();
        n2.setNameOfSubscriber("Li Hack");
        n2.setPhoneNumber("+380665285999");
        n2.subscriberAddress.setSubscriberAddress("Odessa", "Dovga", "21");


        Base base = new Base();
        base.add(n);
        base.add(n2);
        base.searchByNumber("+380997630991");
        base.lisOfFreeNumbers();
        base.searchByName("Li Hack");
        base.changeOwner("+380665285999");


    }

    public static void formulationOfTheProblem() {
        System.out.println("Создать базу данных - телефонный справочник некоторой АТС города. Каждая запись содержит следующие сведения:\n" +
                "\uF02D\tномер телефона;\n" +
                "\uF02D\tФИО абонента ;\n" +
                "\uF02D\tадрес абонента.\n" +
                "Предусмотреть:\n" +
                "а) выдачу сведений об абоненте по его телефонному номеру;\n" +
                "б) выдачу телефонного номера по фамилии абонента;\n" +
                "в) назначение заданного телефонного номера другому владельцу;\n" +
                "г) выдачу списка свободных телефонных номеров.\n");
    }


}
