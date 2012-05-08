/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KF13.assignment4;

/**
 *
 * @author Rasztemberg
 */
public class HtmlList {
    
    String str;
    HtmlList next;
    PageList url;

    HtmlList (String s, HtmlList n, PageList url) {
        str = s;
        next = n;
        this.url = url;
    }
    
    
    
}

