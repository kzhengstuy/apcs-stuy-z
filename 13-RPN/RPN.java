//discussed with Tina Zhu/Zhao Huang
//some minor errors to be fixed


public class RPN{
    private MyStack stack;
    
    public RPN(){
	MyStack temp = new Mystack();
	stack = temp;
    }
    
    public void calc(String s){
	if (s.length() > 2){
	    for (int a = 0; a < s.length(); a++){
		char var = s.charAt(a);
		if (var.isDigit()){
		    stack.push(var.getNumericValue());
		}
		else if(letter!='+'&&letter!='-'&&letter!='/'&&letter!='*'){
		    System.out.println("ERROR. MATH PLEASE.");
		}
		else{
		    String first = stack.pop();
		    String second = stack.pop();
		    if (letter=='+'){
			stack.push((double)first+(double)second);
		    }
		    else if (letter=='-'){
			stack.push((double)first-(double)second);
		    }
		    else if (letter=='/'){
			stack.push((double)first/(double)second);
		    }
		    else{
			stack.push((double)first*(double)second);
		    }
		}
	    }
	}
    }
}
