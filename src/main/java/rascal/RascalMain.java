package rascal;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RascalMain {
    public static void main(String[] args){
        System.out.println(new File("TrianlgeInput.txt").getAbsolutePath());
        File dataSet = new File("C:/Users/yaeldina/IdeaProjects/RascalsTriangle/TrianlgeInput.txt");
        RascalTriangle rascal = new RascalTriangle();
        try{
            Scanner scanner = new Scanner(dataSet, StandardCharsets.UTF_8.name());
            System.out.println(scanner.nextLine());
            while(scanner.hasNextLine()){
                System.out.println(scanner.next());
                rascal.R(scanner.nextInt(), scanner.nextInt());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
