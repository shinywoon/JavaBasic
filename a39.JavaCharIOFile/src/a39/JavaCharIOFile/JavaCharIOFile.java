package a39.JavaCharIOFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class JavaCharIOFile {

	public static void main(String[] args) {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			br = new BufferedReader(new FileReader("src/a39/JavaCharIOFIle/JavaCharIOFile.java"));
			pw = new PrintWriter(new FileWriter("test.txt"));
			String line = null;
			while((line = br.readLine()) != null) {
				pw.write(line);				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			pw.close();
		}
		
	}

}
