package String;

public class Practice {

	public static void main(String[] args) {
		String d="03:34";
		
		String[] h=d.split(":"); 
		int hw=Integer.parseInt(h[1]);
		
		System.out.println(hw);
		
		System.out.println("--------------------");
		
		String s="Amar is Good at Automation";
		 
		String hs[]=s.split(" ");
		
		String res="";
		
		
		for(int i=hs.length-1;i>=0;i--) {
			res+=hs[i]+" "; 
		}
		
		System.out.println(res);
		
		
		
	
	}

}
