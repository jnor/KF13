package Tobias_code;

public class PageListTest {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
		
        PageList myList = new PageList();		
        myList.addPage("Page1");
	myList.addPage("Page2");
	myList.addPage("Page3");
	myList.showList();
		
	System.out.println("List contains: " + myList.containsPage("Page1"));
        System.out.println("List contains: " + myList.containsPage("Page32"));                
    }
}
