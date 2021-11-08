package com.company;

import java.util.Date;

public class Person {
    String name;
    private String sex;
    private String religion;
    String languageSpoken;
    String job;
    String nationality;
    private int EGN;
    Date dateOfBirth;
    int age;
    String countryOfResidence;


    public Person(String name, String sex, String religion, String languageSpoken,
                  String job, String nationality) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.EGN = EGN;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.countryOfResidence = countryOfResidence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setLanguageSpoken(String languageSpoken) {
        this.languageSpoken = languageSpoken;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEGN(Integer EGN) {
        this.EGN = EGN;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getReligion() {
        return religion;
    }

    public String getLanguageSpoken() {
        return languageSpoken;
    }

    public String getJob() {
        return job;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getEGN() {
        return EGN;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }
}
