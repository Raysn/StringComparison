import java.io.*;

public class Start {
	public static void main( String args[] ) {
		StringComparison ac = new StringComparison();
		//System.out.println( ac.checkAlphabetPattern( "original", args[0], "perfect" ) );
		System.out.println( ac.checkAlphabetPattern( args[0], args[1], args[2] ) );
	}
}
