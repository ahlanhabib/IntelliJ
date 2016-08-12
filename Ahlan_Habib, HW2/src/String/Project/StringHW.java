package String.Project;

public class StringHW {

	public static void main(String[] args) {
		String a = "Hello World";
		String b = "What's Up, World";
		String c = "    Salam World";
		System.out.println(a.length());
		System.out.println(a.codePointAt(8));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.toCharArray());
		System.out.println(a.charAt(8));
		System.out.println(a.codePointAt(8));
		System.out.println(a.codePointBefore(8));
		System.out.println(a.replace("e", "k"));
		System.out.println(a.concat(" What's up!"));
		System.out.println(a.contains("H"));
		System.out.println(a.compareTo("Hello Earth"));
		System.out.println(b.endsWith("d"));
		System.out.println(b.replaceAll("What's Up, World","Replaced"));
		System.out.println(b.startsWith("123"));
		System.out.println(b.substring(2));
		System.out.println(b.substring(2,6));
		System.out.println(c.trim());
		System.out.println(String.valueOf("t"));
		System.out.println(a + b + c);
		System.out.println(b.compareToIgnoreCase("Salam"));
		System.out.println(c.contentEquals("Sa"));
		System.out.println(b.isEmpty());
		System.out.println(b.intern());
		System.out.println(b.toString());
		
	
		

	}

}
