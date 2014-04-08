public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList() {
	head = null;
    }
    
    public void add(String d) {
	Node tmp = new Node(d);
	tmp.setNext(head);
	head = tmp;
    }

    public String toString() {
	String s = "";
	Node tmp = head;
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    public void add (int i, String s) {
	int count = 0;
	Node tmp = head;
	while (tmp != null) {
	    count++;
	    if (count == (i-1)) {
		Node x = new Node(s);
		x.setNext(tmp.getNext()); 
		tmp.setNext(x); 
	    }
	}
    }

    public String get(int i) {
	int count = -1;
	Node tmp = head;
	while(tmp != null) {
	    count++;
	    if (count == (i-1)) {
		return tmp.getData();
	    }
	    tmp = tmp.getNext();
	}
	return "Try again";
    }

    public String set(int i, String s) {
	int count = -1;
	String answer = "";
	Node tmp = head;
	while (tmp != null) {
	    if (count == (i-1)) {
		answer = tmp.getNext().getData();
		Node x = new Node(s);
		x.setNext(tmp.getNext().getNext());
		tmp.setNext(x);
	    }
	    tmp = tmp.getNext();
	}
	return answer;
    }

    public String remove(int i) {
	int count = -1;
	String ans = "";
	Node tmp = head;
	while (tmp != null) {
	    count++;
	    if (count == (i-1)) {
		ans = tmp.getNext().getData(); //to return this value
		tmp.setNext(tmp.getNext().getNext()); 
	    }
	    tmp = tmp.getNext();
	}
	return ans;
    }

    
    public int find(String s) {
	int count = -1;
	Node tmp = head;
	while (tmp != null) {
	    count++;
	    if (tmp.getData().equals(s)) { 
		return count;
	    }
	    tmp = tmp.getNext();
	}
	return -1;
    }

    public int size() {
	int ans = 0;
	Node tmp = head;
	while (tmp != null) {
	    ans++;
	    tmp = tmp.getNext(); 
	}
	return ans;
    }	 

}
