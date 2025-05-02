package StringBuffer;

public class setLengthg {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Amar");
		
		s.setLength(10);
		
		s.setCharAt(4, ' ');
		s.setCharAt(5, 'R');
		
		System.out.println(s);
		
		s.setLength(4);
		
		System.out.println(s);

	}

}
