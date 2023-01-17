package csd;

class App {
	public static void main(String [] args)
	{
		ReverseTest.run();	
	}
}

class ReverseTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Bir yazı giriniz:");
			String s = kb.nextLine();
			
			if ("quit".equals(s))
				break;
			
			System.out.printf("Yazının tersi: %s%n", StringUtil.reverse(s));			
		}
	}
}

class StringUtil {
	public static String reverse(String s)
	{
		String temp = "";
		int len = s.length();
		
		for (int i = len - 1; i >= 0; --i)
			temp += s.charAt(i);
		
		return temp;
	}
}


