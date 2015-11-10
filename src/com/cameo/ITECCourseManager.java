package com.cameo;
import java.util.ArrayList;

public class ITECCourseManager {
        public static void main(String args[]) {
            //create arraylist to store every course
            ArrayList<ITECCourse> courseList = new ArrayList<>();
            ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
            courseList.add(maintenanceCourse);

            //Add some students.
            maintenanceCourse.addStudent("Anna");
            maintenanceCourse.addStudent("Bill");
            maintenanceCourse.addStudent("Carl");

            maintenanceCourse.removeStudent("Carl");

            maintenanceCourse.writeCourseInfo();

            ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);
            courseList.add(datacomCourse);
            //Add some students
            datacomCourse.addStudent("Dave");
            datacomCourse.addStudent("Ed");
            datacomCourse.addStudent("Flora");

            datacomCourse.writeCourseInfo();

            ITECCourse javaProgramming = new ITECCourse("Java Programming", 2545, 24);
            courseList.add(javaProgramming);
            //add some students
            javaProgramming.addStudent("Gus");
            javaProgramming.addStudent("Harry");
            javaProgramming.addStudent("Izzy");

            javaProgramming.writeCourseInfo();

            ITECCourse smallCourse = new ITECCourse("Small Course", 1111, 3);
            courseList.add(smallCourse);
            //add some students
            smallCourse.addStudent("Jake");
            smallCourse.addStudent("Kirby");
            smallCourse.addStudent("Liam");
            smallCourse.addStudent("Marigold");

            smallCourse.writeCourseInfo();
            String smallCourseName = smallCourse.getCourseName();
            System.out.println(smallCourseName);
            smallCourse.setCourseName("Very Small Course");
            //just checking
            smallCourse.writeCourseInfo();

            ITECCourse infoTechConcepts = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");
            courseList.add(infoTechConcepts);
            //add some students
            infoTechConcepts.addStudent("Max");
            infoTechConcepts.addStudent("Nancy");
            infoTechConcepts.addStudent("Orson");

            //loop over all ITECCourse objects and print name and number of free spaces
            for (ITECCourse course : courseList){
                System.out.println(course + " has " + course.availableSpace() + " seats remaining.");
            }
        }

        public static void writeCourseInfo(String name, int code, ArrayList<String>students, int maxStudents) {
            System.out.println("Course Name: " + name);
            System.out.println("Course Code: " + code);
            System.out.println("Students enrolled:");
            for (String student : students) {
                System.out.println(student);
            }
            System.out.println("There are " + getNumberOfStudents(students) + " students enrolled");
            System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
        }
        public static int getNumberOfStudents(ArrayList<String> students) {
            return students.size();
        }
    }
