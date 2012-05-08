package KF13.assignment4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Searcher {

    public HashMap hashMap; 
    
     public static HtmlList exists (HtmlList l, String word) {
        while (l != null) {
            if (l.str.equals (word)) {
                return l;
            }
            l = l.next;
        }
        return null;
    }
    
    public static HashMap readHtmlList (String filename) throws IOException {
       
        String word, currentPage;
        BufferedReader infile = new BufferedReader(new FileReader(filename));
        currentPage = infile.readLine(); //Read the first line
        HashMap hash = new HashMap();
         
        word = infile.readLine(); // Read the next line
        System.out.println(word);
        while (word != null ) {    // Exit if there is none
            if(word.startsWith("*PAGE")){
                currentPage = word;
            }else{
               hash.addWord(word, currentPage);
            }
          word = infile.readLine(); // Read the next line
        }
        infile.close(); // Close the file
        return hash;
    }
    
    
    
}