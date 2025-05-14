package org.viktsh.university;

public class Professor extends Person{
    private AcademicDegree academicDegree;
    private String speciality;
    private static String verb = "teaches";

    public Professor(String name, Gender gender, String department, AcademicDegree academicDegree, String speciality) {
        super(name, gender, department);
        this.academicDegree = academicDegree;
        this.speciality = speciality;
    }

    public AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public String getSpeciality() {
        return speciality;
    }

    public static String getVerb() {
        return verb;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(getVerb() + " at " + getDepartment());
        System.out.println(getGender().getPronoun() + " has " + getAcademicDegree().getTranslate() + " degree in " + getSpeciality() + ".");;
    }
}
