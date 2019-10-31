package com.jetbrains;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class DuplicateRemover {
    private Set<String> uniqueWords;

public void remove(String dataFile) throws FileNotFoundException {
        uniqueWords  = new HashSet<String>(); // the HashSet function will only allow unique Words from the InputFile
        Scanner scan = new Scanner(new File(dataFile));
        while(scan.hasNext()){
            String wordsFromInputFile = scan.next();
            uniqueWords.add(wordsFromInputFile);
        }
        scan.close();
    }

public void write(String outputFile) throws IOException{
        File out             = new File(outputFile);
        FileWriter fileWriter = null;

        if(out.exists()) {
            fileWriter = new FileWriter(out, false);
            Iterator iterate = uniqueWords.iterator();
            while (iterate.hasNext()) {
                String str = (String) iterate.next();
                fileWriter.write(str + "\n");
            }
            fileWriter.close();
            System.out.println("Output File has Data now!!! :)");
        }
        else {
            out.createNewFile();
            fileWriter = new FileWriter(out, true);
            Iterator iterate = uniqueWords.iterator();
            while(iterate.hasNext()){
                String str = (String)iterate.next();
                fileWriter.write(str + "\n");
            }
            fileWriter.close();
            System.out.println("Output File has Data Finally!!! :)");
        }
    }
}