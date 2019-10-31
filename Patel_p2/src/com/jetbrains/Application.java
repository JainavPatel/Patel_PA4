package com.jetbrains;
import java.io.IOException;

public class Application {

    public static void main(String [] args) throws IOException{
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        duplicateCounter.count("C:\\Users\\jaina\\IdeaProjects\\Patel_PA3\\Patel_p2\\src\\com\\jetbrains\\problem2");
        duplicateCounter.write("C:\\Users\\jaina\\IdeaProjects\\Patel_PA3\\Patel_p2\\src\\com\\jetbrains\\unique_word_counts");
    }
}
