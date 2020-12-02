package rascal;

import java.io.File;
import java.util.Scanner;

public class RascalMain {
    public static void main(String[] args) {
        RascalTriangle rascal = new RascalTriangle();
        try {
            File file = new File("input");
            Scanner scanner = new Scanner(file);
            int P = Integer.parseInt(scanner.nextLine());
            System.out.println(P);
            for(int i = 0; i < P; i++){
                if(scanner.hasNext()){
                    System.out.print(scanner.next() + " ");
                    System.out.println(rascal.R(scanner.nextInt(), scanner.nextInt()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
