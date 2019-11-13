import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		long start=System.currentTimeMillis();
		FileInputStream instream = null;
		PrintStream outstream = null;
		try {
			instream = new FileInputStream("./date.in");
			outstream = new PrintStream(new FileOutputStream("./date.out"));
			System.setIn(instream);
			System.setOut(outstream);
		}catch (Exception e) {
			System.err.println("Error Occurred.");
		}
		Scanner input = new Scanner(System.in);
		//begain

		//end
		long time = System.currentTimeMillis() - start;
		System.out.print("\n???к??= "+time+" ????");
	}
}


