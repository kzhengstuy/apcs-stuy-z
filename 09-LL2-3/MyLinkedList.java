public class MyLinkedList {
    
    private Node head;
    
    public MyLinkedList() {
	head = new Node("temp");
    }
 

    public void add (String d) {
	Node tmp = new Node(d);
	Node tmp2 = head.getNext();
	while (tmp2 != null) {
	    tmp2 = tmp2.getNext();
	}
	tmp2.setNext(tmp);
    }


    public String toString() {
	String s = "";
	Node tmp = head.getNext();
	while (tmp != null) {
	    s += tmp + ", ";
	    tmp = tmp.getNext();
	}
	return s;
    }

    public void add (int i, String s) {
	int count = 0;
	Node tmp1 = head.getNext();
	Node tmp2 = tmp1.getNext();
	Node node1 = new Node(s);
	while (count<i-1) {
	    tmp1=tmp1.getNext();
	    tmp2=tmp2.getNext();
	}
	node1.setNext(tmp2);
	tmp1.setNext(node1);
    }

    public String get(int i) {
	Node tmp = head.getNext();
	int count = 0;
	while(count<i) {
	    count++;
	    tmp=tmp.getNext();
	}
	return tmp.getData();
    }
    

    public String set(int i, String s) {
	int count = 0;
	String answer = "";
	Node tmp = head.getNext();
	while(count<i) {
	    count++;
	    tmp=tmp.getNext();
	}
	tmp.setData(s);
	return tmp.getData();
       	
    }

    public String remove(int i) {
	int count = 0;
	String ans = "";
	Node tmp1 = head.getNext();
	Node tmp2 = tmp1.getNext();
	while (count<i-1) {
	    count++;
	    tmp1 = tmp1.getNext();
	    tmp2 = tmp2.getNext();
	}
	ans = tmp2.getData();
	tmp1.setNext(tmp2.getNext());
	return ans;
    }

   
    public int find(String s) {
	int count = 0;
	Node tmp = head.getNext();
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
	Node tmp = head.getNext();
	while (tmp != null) {
	    ans++;
	    tmp = tmp.getNext(); 
	}
	return ans;
    }
}
