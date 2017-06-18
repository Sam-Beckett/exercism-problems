public class HelloWorld {
    public static String hello(String name) {
	String output;

	/*
	 * If no name is given, default output to "Hello, World!"
	 * Else output "Hello, <name>!"
	 */
	if ((name == null) || (name.equals(""))){
	    output = "Hello, World!";
	} else {
	    output = "Hello, " + name + "!";
	}

	return output;
	
    }
	
}
