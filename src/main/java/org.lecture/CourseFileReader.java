package org.lecture;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class CourseFileReader {

    public static LinkedList<Course> loadCourses (String fileName) throws IOException {
        Path path = Paths.get("src","main","resources",fileName);
        if(Files.notExists(path))
            throw new IOException("File not Found");
        LinkedList<Course> courses = new LinkedList<>();

        List<String> lines = Files.readAllLines(path);
        lines.removeFirst();
        for(String s:lines){

            String[] split = s.split(",");
            Course tempCourse = new Course.CourseBuilder()
                    .datum(new Datum(split[0]))
                    .start(new Zeit(split[1]))
                    .end(new Zeit(split[2]))
                    .place(split[3])
                    .lector(split[4])
                    .group(Group.convert(split[5]))
                    .subject(Subject.convert(split[6]))
                    .notes(split[7])
                    .build();
            courses.add(tempCourse);
        }
        return courses;
    }

}
