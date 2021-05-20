package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student me = new Student();

        me.setName("Luna");
        me.setStudentId(3523525);
        me.setNumberOfCredits(1);
        me.setGpa(4.0);

        System.out.println(me.getGpa());
        System.out.println(me.getNumberOfCredits());

        me.addGrade(94, 3.5);

        System.out.println(me.getGpa());
        System.out.println(me.getNumberOfCredits());
        System.out.println(me.getGradeLevel());
    }
}
