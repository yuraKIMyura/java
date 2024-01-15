//240115 파일에서 객체 읽어오기
package array;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjEx2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("c:/temp/acc.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Acc acc2 = (Acc) ois.readObject();
		System.out.println("read: " + acc2);
	}

}
