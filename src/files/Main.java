package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        try{ //( FileWriter fileWriter = new FileWriter("java 17.txt")){ // try with resorse
//            FileWriter fileWriter = new FileWriter("java 17.txt");
//            fileWriter.write("Hello java 17");
//            fileWriter.close(); //CloseZB
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try(FileReader fileReader = new FileReader("java 17.txt")){
//            Scanner scanner = new Scanner(fileReader);
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        Song song = new Song("Lovely\n", "Bella\n ", "Thought I found a way,\nThought I found a way, yeah (found)");

        try {
            FileWriter fileWriter = new FileWriter("song.txt");
            fileWriter.write("Title: " + song.title());
            fileWriter.write("Author: " + song.author());
            fileWriter.write(song.text());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader("song.txt")){
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
