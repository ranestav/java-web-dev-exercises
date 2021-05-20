package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int newStudentId) {
        this.studentId = newStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int newNumberOfCredits) {
        this.numberOfCredits = newNumberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa( double newGpa) {
        this.gpa = newGpa;
    }

    public void addGrade(int courseCredits, double grade) {
        double currentTotalQualityScore = gpa * numberOfCredits;
        double newTotalQualityScore = currentTotalQualityScore + (courseCredits * grade);
        numberOfCredits += courseCredits;
        gpa = newTotalQualityScore/numberOfCredits;
    }

    public String getGradeLevel() {
        if(numberOfCredits <= 29) {
            return "Freshman";
        } else if(numberOfCredits > 30 && numberOfCredits <= 59) {
            return "Sophomore";
        } else if(numberOfCredits > 60 && numberOfCredits <= 89) {
            return "Junior";
        }else {
            return "Senior";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}