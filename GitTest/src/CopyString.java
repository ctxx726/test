

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		System.out.println(new Scanner(System.in).useDelimiter("end").next().replace("\n", "\\n").replace("\t", "\\t"));
		System.out.println(new Scanner(System.in).useDelimiter("end").next().replace("\n", "\\n").replace("\t", "\\t"));

		System.out.println(new Scanner(System.in).useDelimiter("end").next().replace("\n", "\\n").replace("\t", "\\t"));
		/*
		 * Scanner scanner = new Scanner(System.in); String t = ""; String s = "";
		 * while(scanner.hasNextLine()) { t += scanner.nextLine(); t += "\\n"; }; s =
		 * escape(s,t); System.out.println(s);
		 */
	}

	/*
	 * public static String escape(String s, String t) { t = t.replace("\t",
	 * "\\\\t"); if (t.substring(t.length()-3,t.length()).equals("g\\n")) { s =
	 * t.substring(0,t.length()-2); return s; } return t; }
	 */

}
