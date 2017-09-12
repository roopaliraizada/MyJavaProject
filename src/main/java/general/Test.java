package main.java.general;

import java.io.Console;

public class Test {
	public static void main(String[] args){
		/*Object[] names = new Object[4];
		ArrayList<String> namelist  = new ArrayList<String>();
		namelist.add("R1");
		namelist.add("R2");
		namelist.add("R3");
		namelist.add("R4");
		namelist.add("R5");
		
		names = namelist.toArray();
		for (Object obj : names) {
			System.out.println((String)obj);
		}
		Object[] names2 = new Object[2];
		System.arraycopy(names, 1, names2, 0, 2);
		System.out.println("____________");
		for (Object obj : names2) {
			System.out.println((String)obj);
		}*/
		
		Console cons;
		 char[] passwd;
		 if ((cons = System.console()) != null &&
		     (passwd = cons.readPassword("[%s]", "Password:")) != null) {
		     System.out.println("Filling..." + passwd.toString());
		     java.util.Arrays.fill(passwd, ' ');
		 }
	}
}
