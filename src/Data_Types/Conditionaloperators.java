package Data_Types;

public class Conditionaloperators {

	public static void main(String[] args) {
	
		int a,b=5,c=6,d=7,e=8;;
	
		
		a=(b>c?d:e);
		
		System.out.println(a); //8
		
		int f=8,v=10;
		
		String s=(f<v)?"it's less":" v its more";
		System.out.println(s);
		
		int y=10;
		
		y=(y<20? -y:y);
		
		System.out.println(y);
		
		
		//operator precedence
		
		int x=5,k=6,z=7;
		
		System.out.println(x*k+7); //higer is * so this wilkl execute first
		
		System.out.println(5*6+10/2-8%3); //30 + 5- 2 ==33
		
		int g=5*6+10/2-8%3;  //6 opertors == last priority  it will get execute at last
		
		System.out.println(g);
		
		int p=10,w=5,i=6;
		
		System.out.println(p>w && !(w>i)); //true
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
