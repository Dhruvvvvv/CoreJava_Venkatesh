package IOPackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStorage {

	public static void main(String[] args) throws IOException{
		DataInputStream dis= new DataInputStream(System.in);
		System.out.println("Enter source path::");
		String fPath=dis.readLine();
		File f= new File(fPath);
		FileInputStream fis= new FileInputStream(f);
		System.out.println("Enter destination path::");
		String fPath2=dis.readLine();
		File f2=new File(fPath2);
		FileOutputStream fos= new FileOutputStream(f2);
		int ch;
		while(((ch=fis.read())!=-1)) {
			fos.write((char)ch);
		}
		System.out.println("File copied..!");
		fis.close();
		fos.close();
		

	}

}
