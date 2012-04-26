package KF13.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Searcher {

    public static String whatPage(HTMLlist l, String word) {
        String currentPage = "";
        int count = 0;

        // Loop through all words in the list
        while (l != null) {
            // If a URL is found, keep it temporarily 
            if (l.str.startsWith("*PAGE")) {
                currentPage = l.str;
            }

            // If an occurence of the word is found, print the corresponding URL
            if (l.str.equals(word)) {
                System.out.println(currentPage);
                count++;                  
            }
            l = l.next;
        }
        
        // If no word has been found, print:
        if (count == 0) {
            System.out.println("Not found");
        }
        
        return null;
    }

    // If exists, return true
    /*
    public static boolean exists(HTMLlist l, String word) {
        while (l != null) {
            if (l.str.equals(word)) {
                return true;
            }
            l = l.next;
        }
        return false;
    }
    */

    // Build the linked list
    public static HTMLlist readHtmlList(String filename) throws IOException {
        String name;
        HTMLlist start, current, tmp;

        // Open the file given as argument
        BufferedReader infile = new BufferedReader(new FileReader(filename));

        name = infile.readLine(); //Read the first line
        start = new HTMLlist(name, null);
        current = start;
        name = infile.readLine(); // Read the next line
        while (name != null) {    // Exit if there is none
            tmp = new HTMLlist(name, null);
            current.next = tmp;
            current = tmp;            // Update the linked list
            name = infile.readLine(); // Read the next line
        }
        infile.close(); // Close the file

        return start;
    }
}