

public class MyStack{
    private String[] stack;
    private int height;
    private int top;

    public MyStack(){
	stack = new String[10];
	height = 0;
	top = -1;
    }

    public void push(String s){
	if(height < stack.length){
	    stack[top + 1] = s;
	    top++;
	    height++;
	}
	else{
	    String[] temp = new String[stack.length * 2];
	    for(int i = 0; i < stack.length; i++){
		temp[i] = stack[i];
	    }
	    temp[top + 1] = s;
	    top++;
	    height++;
	    stack = temp;
	}
    }
    
    public String pop(){
	String temp = stack[height-1];
	if (height != 0){
	   
	    stack[height-1] = null;
	    height--;
	}
	return temp;	
    }

    public String peek(){
	return stack[top];
    }

    public boolean isEmpty(){
	return height==0;
    }
 
    public String toString(){
	if (isEmpty()){
	    return "tryagain";
	}
	else{
	    String retStr = "";
	    for (int a = 0; a < height; a++){
		retStr += stack[a] + " ";
	    }
	    return retStr;
	}
    }
}
