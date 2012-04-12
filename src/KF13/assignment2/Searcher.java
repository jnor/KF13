package KF13.assignment2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Searcher {
    
    public static HTMLlist search (HTMLlist l, String word) {
        
/*   
    PageObject temp;
    for(int i =0; i < htmllist.lenght; i++)
    if(htmllist[i].str.equals("*PAGE:"))
    temp = new PageObject(bla bla);
    PageList.AddPage(temp);
    else
    StringObject so = new StringObject(blabla);
    temp.AddString(so);        
*/        
        HTMLlist temp = l;
        String page;
        LinkList pageList;
     
        //CustomList searchResults = new CustomList();
            while(temp.next != null) {
                if(temp.str.startsWith("*PAGE:")) {
                    //You got a PAGE OBJECT!
                    //temp.add = temp.str;
                    pageList.insert(23, 23);
                 
                    System.out.println(temp.str);
                    System.exit(0);

                }
                else {
                //You got another object.. something
                }
                
            }

        return null;
    }    
    
    
    
    public static boolean exists (HTMLlist l, String word) {
        while (l != null) {
            if (l.str.equals (word)) {
                return true;
            }
            l = l.next;
        }
        return false;
    }

    public static HTMLlist readHtmlList (String filename) throws IOException {
        String name;
        HTMLlist start, current, tmp;

        // Open the file given as argument
        BufferedReader infile = new BufferedReader(new FileReader(filename));

        name = infile.readLine(); //Read the first line
        start = new HTMLlist (name, null);
        current = start;
        name = infile.readLine(); // Read the next line
        while (name != null) {    // Exit if there is none
            tmp = new HTMLlist(name,null);
            current.next = tmp;
            current = tmp;            // Update the linked list
            name = infile.readLine(); // Read the next line
        }
        infile.close(); // Close the file

        return start;
    }
}