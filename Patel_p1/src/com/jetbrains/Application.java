package com.jetbrains;
import java.io.IOException;

public class Application{

    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        duplicateRemover.remove("C:\\Users\\jaina\\IdeaProjects\\Patel_PA3\\Patel_p1\\src\\com\\jetbrains\\problem1");
        duplicateRemover.write("C:\\Users\\jaina\\IdeaProjects\\Patel_PA3\\Patel_p1\\src\\com\\jetbrains\\unique_words");
    }
}