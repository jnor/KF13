package KF13.assignment3;

import Tobias_code.*;

public class PageListNode {

    public final String page;
    public final PageListNode next;
	
    public PageListNode(String page, PageListNode next) {
        super();
        this.page = page;
        this.next = next;
    }
	
    public String getPage() {
        return page;
    }
	
    public PageListNode getNext() {
        return next;
    }
}