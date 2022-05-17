package ru.job4j.pojo;

import java.text.DateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFlname("Хамидуллин Тимур Лоисович");
        student.setGroupp("3234");
        student.setDate(new Date());
        System.out.println("Студент: " + student.getFlname());
        System.out.println("группа: " + student.getGroupp());
        System.out.println("дата поступления: " + student.getDate());
    }
}
