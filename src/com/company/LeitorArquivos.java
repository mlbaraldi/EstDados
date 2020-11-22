package com.company;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class LeitorArquivo {
    public static void main(String[] args) {
        try {
            File myObj = new File("/home/mlbaraldi/Java/EstruturaDados/docs/1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}








/*
public class Main {
    static void LeitorArquivos() throws IOException {
        BufferedReader leitor = new BufferedReader(
                new FileReader("/home/mlbaraldi/Java/EstruturaDados/docs/*.txt"));
        String one = leitor.readLine();
        System.out.println(one);
        leitor.close();
    }
}*/
