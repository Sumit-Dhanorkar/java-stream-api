package com.javaTechie.skipAndLimit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8);

        numbers.stream()
                .skip(1)
                .limit(5)
                .forEach(System.out::print);


        Path filePath = Paths.get("./data.txt");
        if (Files.exists(filePath)) {
            // File exists, proceed with reading
            List<String> fileData = Files.readAllLines(filePath);
            fileData.forEach(System.out::println);
        } else {
            System.out.println("File not found: " + filePath);
        }



    }
}
