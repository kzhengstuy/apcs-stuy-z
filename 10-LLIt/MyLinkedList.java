import java.io.*;
import java.util.*;


public class MyLinkedList<E> implements iterable{
    private Node<E> head;
    private Node<E> tail;
    
    public MyLinkedList(){
	head = null;
	tail = null;

    }
    public LLIterator iterator(){
	E n = head.getData();
	return new LLIterator(n);
    }
     public void add1(E s){
	Node<E> tmp = new Node<E>(s);
	if (head == null){
	    tmp.setNext(tail);
	    head = tmp;
	}
	if (head.getNext() == null){
	    head.setNext(tmp);
	    tail = tmp;

	}
        else{
	    tail.setNext(tmp);
	    tail = tmp;
	}

     }
     /*     public void addTail(E s){
	int x = this.size();
        
	}*/
    
    public E get(int i){
	Node<E> tmp = head;
	for(int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }
    public E set(int i, E s){
	Node<E> tmp = head;
	for (int j=0;j<i;j++){
	    tmp = tmp.getNext();
	}
	E d = tmp.getData();
	tmp.setData(s);
	return d;
    }
    public E remove(int i){
	Node<E> tmp = head;
	for (int j=0;j<i-1;j++){
	    tmp = tmp.getNext();
	}
	E d = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return d;
    }
    public int find(E s){
	Node<E> tmp = head;
	int index = 0;
	while (tmp != null){
	    if (tmp.getData().equals(s)){
		return index;
	    }
	    tmp = tmp.getNext();
	    index++;
	}
	return -1;
    
      }
    public int size(){
	int l = 0;
	Node<E> tmp = head;
	while (tmp != null){
	    tmp = tmp.getNext();
	    l++;
	}
	return l;
    }


    public String toString(){
	String s = "";
        Node<E> tmp = head;
	while (tmp!=null){
	    s += tmp + " ";
	    tmp = tmp.getNext();
	}
	return s;
    }
    
}
