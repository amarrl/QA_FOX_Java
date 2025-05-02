package StringBuffer;

public class ReplaceMethod {

	public static void main(String[] args) {
		StringBuffer re=new StringBuffer("Amar Rajkumar Ade");
		
		re.replace(0, 4, "replaced");  // index, +1," "
		
		System.out.println(re);

	}

}
