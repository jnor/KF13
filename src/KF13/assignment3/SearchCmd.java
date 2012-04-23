package KF13.assignment3;

/* SearchCmd.java
   Written by Rune Hansen
   Updated by Alexandre Buisse <abui@itu.dk>
*/

import java.io.*;




public class SearchCmd {

    public static void main(String[] args) throws IOException {
        String name;
       
        // Check that a filename has been given as argument
        if (args.length != 1) {
            System.out.println("Usage: java SearchCmd <datafile>");
            System.exit(1);
        }
        
        // Read the file and create the linked list
 System.out.println("hellos");
        HtmlList l = Searcher.readHtmlList (args[0]);
         /* System.out.println("-----------------------------------");
          while(l !=null)
          {   System.out.print(l.str);
              l.url.showList();
              System.out.println("---");
              l = l.next;
          }*/
          //System.out.println(l);
        
        // Ask for a word to search
        BufferedReader inuser =
            new BufferedReader (new InputStreamReader (System.in));

        System.out.println ("Hit return to exit.");
        boolean quit = false;
        while (!quit) {
            System.out.print ("Search for: ");
            name = inuser.readLine(); // Read a line from the terminal
            if (name == null || name.length() == 0) {
                quit = true;
            } else if (Searcher.exists (l, name) != null) {
                HtmlList list = Searcher.exists(l, name);
                System.out.println ("The word \""+name+"\" has been found.");
                list.url.showList();
                
            } else {
                System.out.println ("The word \""+name+"\" has NOT been found.");
            }
        }
    }
}