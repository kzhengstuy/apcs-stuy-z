public class Driver{
    public static void main(String[] args){
	MyStack a= new MyStack();
	/*a.push("one");
	a.push("two");
	a.push("three");
	System.out.println(a);	
	while(!a.isEmpty()){
	    return a.pop();
	    }
	a.push("Hello");
	a.push("World");
	System.out.println(a.peek());*/	
	a.push("1");
	a.push("2");
	a.push("3");
	a.push("4");
	a.push("5");
	a.push("6");
	a.push("7");
	a.push("8");
	a.push("9");
	a.push("10");
	a.push("11");
	System.out.println(a);
	while (!a.isEmpty()){
	    System.out.println(a.pop());
	}
	a.push("hello");
	System.out.println(a.peek());
	a.push("bye");
	System.out.println(a.pop());
    }
}