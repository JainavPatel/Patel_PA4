package com.jetbrains;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.IOException;
import java.util.Map.Entry;

public class DuplicateCounter {
    private int wordCounter;
    private Map<String, Integer> wordCountFromInputFile;

    public DuplicateCounter(){

        this.wordCountFromInputFile = new HashMap<String, Integer>();
    }

public void count(String dataFile) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(dataFile));
        while(scan.hasNext()){
            String wordsFromInputFile = scan.next();
            Integer countEachWord = wordCountFromInputFile.get(wordsFromInputFile);
            wordCounter++;
            if(countEachWord != null){
                countEachWord = countEachWord + 1;

            }
            else{
                countEachWord = 1;
            }
            wordCountFromInputFile.put(wordsFromInputFile, countEachWord);
        }
        System.out.println("Output File has Data now!!! :)");
    }

public void write(String outputFile) throws IOException{
        FileWriter fileWriter = new FileWriter(new File(outputFile));
        for(Entry<String, Integer> entry : wordCountFromInputFile.entrySet()) // used entrySet to create set out of the same words
        {
            fileWriter.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        fileWriter.write("number of total words in the output file as of now are:"+wordCounter+"\n");
        fileWriter.close();
    }

}