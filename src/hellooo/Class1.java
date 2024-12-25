package hellooo;

public class Class1 {

	public static void main(String[] args) {
		String str = "java";
		
		StringBuffer sb = new StringBuffer(str);
		String result = sb.reverse().toString();
		System.out.println(result);
	}

}



/*String result = "";
String s1 = "prajakta";

for (int i= s1.length() - 1; i >= 0; i--) 
{
	result = result + charAt(i);
}

System.out.print(result);
}*/