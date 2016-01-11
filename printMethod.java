package pkg;

import java.lang.reflect.Method;
import java.util.Scanner;

public class printMethod {
	public void getMethods(String className) {
		try {
			Class<?> c = Class.forName(className);
			Method[] methods = c.getMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println(methods[i]);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String className;
		// className="java.util.Collections";
		Scanner scan = new Scanner(System.in);
		className = scan.next();
		new printMethod().getMethods(className);

	}

}
