import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		File[] list = new File("F:\\UVA").listFiles();
		for(File l : list){
			String name = l.getName();
			if(!name.contains(" ")){
				System.out.println(name + "----命名错误");
			}

			boolean cFlag = false, jFlag = false, QFlag = false;
			File[] is = l.listFiles();
			if(is == null){
				System.out.println(name + "----内容错误");
				continue;
			}
			for (File f : is){
				String n = f.getName();
				if(n.contains("C____")){
					cFlag = true;
				}else if(n.contains("JAVA____")){
					jFlag = true;
				}else if(n.contains("Question____")){
					QFlag = true;
					File P = new File(f.getAbsolutePath() + "\\PDF____" + name + ".pdf");
					if(!P.exists()){
						System.out.println(name + "----PDF错误");
					}
				}
			}
			if(!cFlag){
				System.out.println(name + "----C内容错误");
			}
			if(!jFlag){
				System.out.println(name + "----JAVA内容错误");
			}
			if(!QFlag){
				System.out.println(name + "----Question内容错误");
			}
		}
	}
}


