package org.lecture;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverHund {

    public static void main(String[] args) throws IOException {
        HundFileReader fileReader = new HundFileReader();

        List<Hundi> hundiList = new ArrayList<>(Arrays.asList(
                new Hundi.dogBuilder().age(9).breed("Labrador").name("Whiskey").build(),
                new Hundi.dogBuilder().age(12).breed("Dackel").name("Foxy").build(),
                new Hundi.dogBuilder().age(5).breed("Schäferhund").name("Chipsy").build()
        ));

        hundiList.forEach(System.out::println);

        List <Hundi> hundis = HundFileReader.dogfile("dog_info.csv");
        hundis.forEach(System.out::println);


    }
}
