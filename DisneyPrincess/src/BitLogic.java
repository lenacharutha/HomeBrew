
public class BitLogic {
	public static void main(String args[])
	{
		String name = "Snow";
		String names[]={"Snow","White"};
		System.out.println("BitLogic.main()"+names[1]);
		System.out.println("name="+ name);
		
		int a = 3; // 0 + 2 + 1 or 0011 in binary
		int b = 6; // 4 + 2 + 0 or 0110 in binary
		int c = a | b;
		System.out.println("BitLogic.main()" + c);
		//int d = a & b;
		//System.out.println(" a&b = " + binary[d]);
		
		
	}

}
