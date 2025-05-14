package org.viktsh;

import org.viktsh.university.*;

/**
 * Hello world!
 *
 */
public class MainClass
{
    public static void main( String[] args )
    {
        Person[] person = new Person[6];
        person[0] = new Professor("Ronald Turner", Gender.MALE, "Computer Science", AcademicDegree.PHD, "Programming paradigms");
        person[1] = new Professor("Routh Hollings", Gender.FEMALE, "Jurisprudence", AcademicDegree.MASTERSCIENCE, "Domestic arbitration");
        person[2] = new Master("Leo Wilkinson", Gender.MALE, "Computer Science", Stage.BACHELOR, 3);
        person[3] = new Master("Anna Cunningham", Gender.FEMALE, "World Economy", Stage.BACHELOR, 1);
        person[4] = new Master("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", Stage.MASTER, 1);
        person[5] = new Aspirant("Ronals Correa", Gender.MALE, "Computer Science", "Design of a functional programming language");

        System.out.println("+-----------------+");
        System.out.println("|\u001B[32m Контингент ВУЗа \u001B[0m|");
        System.out.println("+-----------------+");
        Person.printAll(person);
    }
}
