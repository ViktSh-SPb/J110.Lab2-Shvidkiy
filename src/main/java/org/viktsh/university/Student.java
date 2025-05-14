package org.viktsh.university;

public class Student extends Person{
    private static  String verb = "studies";

    public Student(String name, Gender gender, String department) {
        super(name, gender, department);
    }

    public static String getVerb() {
        return verb;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getVerb() + " at " + getDepartment());
    }
}
