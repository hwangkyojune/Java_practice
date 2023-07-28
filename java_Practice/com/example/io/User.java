package com.example.io;

import java.io.Serializable;

//Serializable을 상속 받으면 객체의 순간이동이 가능해진다.
public class User implements Serializable {
    private String name;
    private String email;
    private String birthDay;
    public User(String name, String email, String birthDay){
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return this.name+this.email+this.birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
}
