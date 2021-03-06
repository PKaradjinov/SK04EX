package com.company;

//Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality, EGN, date of birth,
//age, country of residence. The name, language, nationality and job can be fully accessed from other classes. The sex, religion and
//EGN can be set only once outside. The date of birth attribute is composed during the creation of an object based on the EGN, the
//age also. The Person class should have methods sayHello (), celebrateEaster (), isAdult (), canTakeLoan () with the relevant
//parameters if any. sayHello () should print Hello on the relevant language, by default is English, celebrateEaster should print if the
//concrete person celebrates Easter based on their religion, isAdult should take in consideration the country of residence,
//canTakeLoan is based on the job. Create 3 classes Child, Bulgarian and Italian which inherit Person class and using polymorphism change the implementation of the
//methods that need different behavior. Implement new methods specific only for the concrete class. Create different objects in th e main class and use their methods.
public class Main {
    public static void main(String[] args) {
        Person Ivan = new Person(
                "Ivan",
                "male",
                "Christian",
                "Bulgarian",
                "QA",
                "Bulgarian");
        System.out.println(Ivan.getName());
        System.out.println(Ivan.getSex());
        System.out.println(Ivan.getReligion());
        System.out.println(Ivan.getLanguageSpoken());
        System.out.println(Ivan.getJob());
        System.out.println(Ivan.getNationality());
        System.out.println(Ivan.getCountryOfResidence());
    }
}
