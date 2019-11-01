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

		int[] data = new int[1005];

		for(int a = 2; a <= 1000; a ++){
			int count = 1, b = a;
			while(b != 1){
				if(b % 2 == 0){
					b /= 2;
				}else{
					b = 3 * b + 1;
				}
				count ++;
			}
			data[a] = count + 1;
		}

		int i ,j;
		while((i = input.nextInt()) != 0){
			j = input.nextInt();
			int max = 0;
			for(; i < j; i ++){
				if(data[i] > max){
					max = data[i];
				}
			}

			System.out.println(i + " " + j + " " + max);

		}



		//end
		long time = System.currentTimeMillis() - start;
		System.out.print("\n‘À––∫ƒ ±= "+time+" ∫¡√Î");
	}
}


