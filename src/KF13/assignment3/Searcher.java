package KF13.assignment3;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Searcher {

    public static HtmlList exists (HtmlList l, String word) {
        while (l != null) {
            if (l.str.equals (word)) {
                return l;
            }
            l = l.next;
        }
        return null;
    }
    
     

    public static HtmlList readHtmlList (String filename) throws IOException {
       
        String  word, currentPage;
        HtmlList start, current, tmp;
         
        // Open the file given as argument
        BufferedReader infile = new BufferedReader(new FileReader(filename));
        currentPage = infile.readLine(); //Read the first line
         
        word = infile.readLine(); // Read the next line
        start = new HtmlList (word, null, new PageList());
        current = start;
       
        while (word != null ) {    // Exit if there is none
            if(word.startsWith("*PAGE"))
            {
                  currentPage = word;
            }
            if(Searcher.exists(start, word) != null && !word.startsWith("*PAGE"))
            {
                tmp = Searcher.exists(start, word);
               
                if(tmp.url.containsPage(currentPage) == false)
                {
                    tmp.url.addPage(currentPage);
                }
                // System.out.println("Existing word: " + tmp.str);
                //System.out.println("Its linkList: ");
                //tmp.url.showList();
            }
            else
            {
                // If exists get the object where it exists.
                 // If word doesnt exist, create one
                 //System.out.println(word);
                  tmp = new HtmlList(word, null, new PageList());
                  tmp.url.addPage(currentPage);
                  current.next = tmp;
                  current = tmp;            // Update the linked list
                // System.out.println("This word exists once: " + tmp.str);
               // System.out.println("Its linkList: ");
               // tmp.url.showList();
            }
          
            word = infile.readLine(); // Read the next line
        }
        infile.close(); // Close the file
         //System.out.println("ta");
        return start;
    }
}