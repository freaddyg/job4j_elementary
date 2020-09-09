package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student programmer = new Student();
        programmer.setEntrance(new Date());
        programmer.setGroup("9");
        programmer.setName("Yuriy");
        programmer.setSurname("Korsakov");

        System.out.println(programmer.getName() + " " + programmer.getSurname() + " , group - " + programmer.getGroup() + " : " + programmer.getEntrance());
    }
}
