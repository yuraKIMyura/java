//240115 객체를 파일에 저장(교재 p.627)
//implements Serializable을 해야 해당 class의 객체 직렬화 가능 
package array;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//java.io.Serializable interface를 구현한 객체만 직렬화 가능
//Serializable interface is a "marker interface"
//it doesn't contain any method that must be implemented
//simply serves as a "marker" to the JRE(runtime environment) that instances of the class can be serialized
class Acc implements Serializable{
		
	int x;
	String y;
	
	@Override
	public String toString() {
		return "Acc [x=" + x + ", y=" + y + "]";
	}
	
}//class



public class ObjEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Acc acc = new Acc();
		acc.x = 100;
		acc.y = "가나다";
		System.out.println("write: " + acc);
		
		
	//Writing an object to a file using SERIALIZATION
			
		//Creating a FileOutputStream to write the serialized object to a file
		//최상위클래스 OutputStream의 하위클래스 FileInputStream(바이트 기반 스트림)
		FileOutputStream fos = new FileOutputStream("C:/temp/acc.db");
		
		//Creating an ObjectOutputStream on top of the FileOutputStream
		//Setting up the serializtion process by wrapping the 'FileOutputStream' in an 'ObjectOutputStream'
		//ObjectOutputStream은 객체를 직렬화(바이트 배열로 만드는 것)하는 역할
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//This line ACTUALLY performs the serialization!
		//객체를 직렬화해서 출력 스트림으로 보냄
		oos.writeObject(acc);

		//출력 버퍼에 잔류하는 모든 바이트를 출력
		//Flushing the output stream to ensure any remaining bytes are written
		//Forces any remaining data in the buffer to be written to the destination file
		//making sure all the "kids(data)" are in the "car(output stream)" to prevent 'Home alone' situation
	
		oos.flush();

		//출력 스트림 닫기
		//Closing the ObjectOutputStream and the underlying FileOutputStream
		oos.close();
	
		
		
	//Reading an object to a file using DESERIALIZATION	
		
		//Creating a FileOutputStream to read the serialized object from a file
		FileInputStream fis = new FileInputStream("c:/temp/acc.db");
		
		//Creating an ObjectInputStream on top of the FileInputStream
		//ObjectInputStream은 객체로 역직렬화(바이트 배열을 객체로 복원)하는 역할
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//ObjectInputStream의 readObject() method는 입력 스트림에서 읽은 바이트를 역직렬화, 객체를 복원
		//리턴 타입은 Object type이기 때문에 원래 타입으로 강제 형변환 필요
		Acc acc2 = (Acc) ois.readObject();
		
		//Closing the ObjectInputStream after reading the object
		//(ensures the object is successfully read before closing the stream)
		ois.close();
		
		System.out.println("read: " + acc2);
	}

}//class
