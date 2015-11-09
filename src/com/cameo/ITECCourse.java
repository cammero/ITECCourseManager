package com.cameo;
import java.util.ArrayList;

public class ITECCourse {
    //Data for an ITECCourse object to store
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String roomNumber;

    //Constructor
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoomNumber){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.roomNumber = courseRoomNumber;
    }

    public void addStudent(String studentName) {
        //If the number of students is the same as the max allowed, can't add any more
        if (students.size() == maxStudents) {
            System.out.println("Course is full = can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName){
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.name);
        } else {
            System.out.println(studentName + " was not found in " + this.name);
        }
    }

    public void writeCourseInfo() {
        System.out.println("Course name: " + this.name);
        System.out.println("Course Code: " + this.code);
        System.out.println("Students enrolled:");
        System.out.println("The room the course is held in is " + this.roomNumber);
        for (String student : this.students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + this.maxStudents);
    }

    //getter and setter methods
    public String getCourseName(){
        return this.name;
    }
    public void setCourseName(String newName) {
        this.name = newName;
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public ArrayList<String> getStudents() {
        return students;
    }
    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
    public void setMaxStudents(int max) {
        maxStudents = max;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
