package KF13.assignment4;

public class PageList {

    private PageListNode head;

    public PageList() {
        super();
        head = null;
    }

    public void showList() {
        PageListNode currentNode = head;
	while(currentNode != null) {
            System.out.println(currentNode.getPage());
            currentNode = currentNode.getNext();
        }
    }

    public void addPage(String page){
        PageListNode newNode = new PageListNode(page, head);
	head = newNode;
    }

    public boolean containsPage(String i) {
        PageListNode currentNode = head;
	while(currentNode != null) {
            if(currentNode.getPage() == i) return true;
                currentNode = currentNode.getNext();
            }
	return false;
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("(");
        PageListNode currentNode = head;
	while(currentNode != null) {
            res.append(", ");
            res.append(currentNode.getPage());
            currentNode = currentNode.getNext();
        }
        res.append(")");
        return res.toString();
    }
    
    
}