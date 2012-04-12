package Tobias_code;

public class PageListNode {

    private final String page;
    private final PageListNode next;
	
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