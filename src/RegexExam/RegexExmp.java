package RegexExam;

import java.util.regex.Pattern;

public class RegexExmp {

	public static void main(String[] args) {
		boolean a=Pattern.matches("Amar", "Amar");
		System.out.println("Matched");
		
		boolean ab=Pattern.matches("[Aa]mar", "amar"); 
		
		System.out.println(ab);
		boolean abc=Pattern.matches("[sij]it", "sit");
		System.out.println(abc);
		
		boolean tim=Pattern.matches("[0-9]am", "5am");
		System.out.println(tim);
		
		boolean af=Pattern.matches("[A-Z]Ast", "JAst");
		
		System.out.println(af);
		
		boolean shoulnotbeanyout=Pattern.matches("s[^aeiou]t", "spt");
		System.out.println(shoulnotbeanyout);
		
		

	}

}
