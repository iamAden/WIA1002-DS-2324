/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package course;

import java.util.Arrays;

/**
 *
 * @author User
 */

class Course{
    private String courseName;
    private String[]students;
    private int numberOfStudents;
    public Course(String courseName){
        this.courseName = courseName;
        this.students=new String[1];
        this.numberOfStudents = 0;
    }
    String getCourseName(){
        return this.courseName;
    }
    void addStudent(String student){
        if (numberOfStudents == students.length) {
            // If the array is full, increase its size
            int newCapacity = students.length * 2;
            students = Arrays.copyOf(students, newCapacity);
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    void dropStudent(String student){
        int index=-1;
        for(int i=0; i<numberOfStudents;i++){
            if (student==students[i]){
                index=i;
                break;
            }
        }
        if(index!=-1){
            for(int i=index;i<numberOfStudents-1;i++){
                students[i]=students[i+1];
            }
            students[numberOfStudents - 1] = null; // Set the last element to null
            numberOfStudents--;
        }
    }
    String[] getStudentList(){
        return Arrays.copyOf(students, numberOfStudents);
    }
    int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    void clear(){
        this.students=new String[1];
        this.numberOfStudents=0;
    }
}

public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    }

}
