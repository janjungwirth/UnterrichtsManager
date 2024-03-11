package org.lecture;

import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Driver {
    public static void main(String[] args) throws IOException {
        CSVCleaner.doCleanupProcess("Termine_09_03_2024.csv");
        LinkedList<Course> courses = CourseFileReader.loadCourses("Refectored_Termine_09_03_2024.csv");


        Set<Datum> dates = new LinkedHashSet<>();
        for(Course c : courses){
            if(c.getPlace().contains("P.")&&!c.getPlace().contains("/")){
                dates.add(c.getDatum());
            }
        }

        dates.forEach(System.out::println);
        System.out.println(dates.size());
    }
}
