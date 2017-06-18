public class HelloWorld {
    public static String hello(String name) {
	String output;

	if( isEmpty(name) ) {
	    output = "Hello, World!";
	} else {
	    output = "Hello, " + name + "!";
	}

	return output;
	
    }

    public static Boolean isEmpty(String name) {

	if ((name == null) || (name.equals(""))) {
	    return true;
	} else {
	    return false;
	}
    }
	
}
