import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//use serializing to save and load functionality in program
//how to de-serialize array lists 

public class ReadObjects {

	public static void main(String[] args) {
		System.out.println("reading objects....");
		
		try(ObjectInputStream os = new ObjectInputStream(new FileInputStream("people.bin"))) {
			
			
			Person person = (Person)os.readObject();
			System.out.println(person);
			
		
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
