package String;

public class lastIndextof {   //returns the last occurance of the given char or string

	public static void main(String[] args) {
		
		String s="QA fox is the best-way of learning the software testing courses ";
		
		System.out.println(s.lastIndexOf("The"));  //-1 
		
		System.out.println(s.lastIndexOf("the"));    // 35
		
		System.out.println(s.lastIndexOf('x'));  //5
		 
		System.out.println(s.lastIndexOf('t', 11));  //10
		
		System.out.println(s.lastIndexOf("the",14));// 10
		

	}

}
