package Data_Types;

public class Escape_Char {

	public static void main(String[] args) {
String s=("i am amar \n son of rajkumar");  // next line
		
		String q=("i am amar \t son of rajkumar");  // tab space
		
		String r=("\'i am amar' son of rajkumar");  // single quote
		
		String z=("\"i am amar\" son of rajkumar");  //pring the words in string
		
		String p=("amar\\c floder");              // prints the single backward slash \
		
		String b=("amar \rrajkumar\rlaxmi");       // return or press entre and entre the words
		
		String c=("amar \nrajkumar\nlaxmi");
		
		System.out.println(z);
		
		System.out.println(p);
		
		System.out.println(b);
		
		System.out.println("======");
		
		System.out.println(c);
		
		String de=("amar \u00a9 laxmi"); // prints the required symbol based on the unicode 
		
		System.out.println(de);
		
		String d=("amar\blaxmi");  //clear the last word or data  // not working
		
		System.out.println(d);
		
		String e=("amar\flaxmi");  /*
		                             otput amar
		                                      laxmi   from last word next string should get print */
		
		System.out.println(e);
		
	}

}
