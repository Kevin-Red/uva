import java.io.*;
import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		File[] list = new File("F:\\UVA").listFiles();
		for(File f : list){
			String name = f.getName();
			File C = new File(f.getAbsolutePath() + "\\C____" + name);
			File J = new File(f.getAbsolutePath() + "\\JAVA____" + name);
			copyFolder(new File("F:\\java"), J);
			copyFolder(new File("F:\\c"), C);
//			deleteFile(C, true);
//			deleteFile(J, true);
		}
	}

	public static void deleteFile(File file, boolean isRoot){
		File[] files = file.listFiles();
		if(files != null){
			for (File f: files){
				if (f.isDirectory()){
					deleteFile(f, false);
				}else {
					f.delete();
				}
			}
		}else{
			System.out.println(file.getName());
		}
		if(!isRoot){
			file.delete();
		}
	}


	/**
	 * 复制文件夹
	 *
	 */
	public static void copyFolder(File resourceFile, File targetFile){



		// 获取源文件夹下的文件夹或文件
		File[] resourceFiles = resourceFile.listFiles();
		for (File file : resourceFiles) {
			if (file.isFile()) {
				copyFile(file, new File(targetFile.getAbsolutePath() + "\\" + file.getName()));
			}else if (file.isDirectory()) {// 复制源文件夹
				new File(targetFile.getAbsolutePath() + "\\" + file.getName()).mkdirs();
				copyFolder(file, new File(targetFile.getAbsolutePath() + "\\" + file.getName()));
			}
		}

	}

	/**
	 * 复制文件
	 *
	 * @param resource
	 * @param target
	 */
	public static void copyFile(File resource, File target){

		try {
			FileInputStream inputStream = new FileInputStream(resource);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

			FileOutputStream outputStream = new FileOutputStream(target);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = inputStream.read(bytes)) != -1) {
				bufferedOutputStream.write(bytes, 0, len);
			}
			bufferedOutputStream.flush();
			bufferedInputStream.close();
			bufferedOutputStream.close();
			inputStream.close();
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}


