package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) {

		File dir2 = new File("c:/temp/images");
		dir2.mkdirs();
		
		File dir = new File("c:/temp");
		File[] list = dir.listFiles();
		
		for(File file : list) {
		
			if(file.isDirectory()) System.out.print("<DIR> | " );
			
			System.out.print(file.getName() + " | " );
			
			System.out.print(file.length() + " | ");
			System.out.print(file.lastModified() + " | ");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			System.out.println();
			
		}//for
		
	}//main

}//class
