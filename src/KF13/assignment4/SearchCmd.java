package KF13.assignment4;
import java.io.*;
import java.util.Scanner;

public class SearchCmd {

    public static void main(String[] args) throws IOException {
        
        // Check that a filename has been given as argument
        if (args.length != 1) {
            System.out.println("Usage: java SearchCmd <datafile>");
            System.exit(1);
        }
        
        HashMap hashMap = Searcher.readHtmlList (args[0]);
  
        System.out.println("hashMap has been filled.");
        // Ask for a word to search
        BufferedReader inuser = new BufferedReader (new InputStreamReader (System.in));

        System.out.println ("Hit return to exit.");
        boolean quit = false;
        
        Scanner sc = new Scanner(System.in); 
        String word = sc.next(); 
        
        Bucket found = hashMap.searchForWord(word);
        found.getWord(word).url.showList();
        
    }
}