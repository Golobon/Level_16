package Lecture_3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in);){
            String way = scanner.nextLine();
            Path path = Paths.get(way);
            List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
            lines.stream().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

