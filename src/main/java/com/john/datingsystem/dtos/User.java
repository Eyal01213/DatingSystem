package com.john.datingsystem.dtos;

import com.john.datingsystem.Gender;

public class User {

    private int id;
    private int age;
    private Gender gender;



    public User() {
    }

    public User(int id, int age, Gender gender) {
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public User(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
