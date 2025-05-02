package String;

public class StringIndextOf {
	
	public static void main(String[] args) {
		
		String a="QAFox - The Spoftware testing turorials - The easiest way of learning ";
		 
		System.out.println(a.indexOf('T'));  //8
		
		System.out.println(a.indexOf("The")); //8
		
		System.out.println(a.indexOf('t'));  //16
		
		System.out.println(a.indexOf("The", 11)); //42
		
		System.out.println(a.indexOf("Amar", 11)); //-1  if the text or charc didn't matches men=ans returns -1
		
		String b="Arun motooru";
		
		System.out.println(b.indexOf('r'));  //1
		
		System.out.println(b.indexOf('r',3));  //10
		
		
		
		System.out.println(findWordorTextPresence(a,"Spo"));
		
		
		System.out.println(findWordorTextPresence(b,"Arun"));
		
	}
	
	public static String findWordorTextPresence(String str,String str1) {
		if(str.indexOf(str1)!=-1) {
			return "The given text is present";
		}
		
		else {
			
			return "the given text is not available";
		}
	}

}
