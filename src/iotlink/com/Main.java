/**
 * 
 */
package iotlink.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Option op = new Option(args);
		try {
			if(op.needFind != null && op.pathFile != null) {
				File file = new File(op.pathFile);
				if(!file.exists()) {
					System.err.println("File not exist file=" + op.pathFile);
					return;
				}
				NumberLine num = new NumberLine(op.numLine);
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(new FileReader(file));
				String st; 
				int count = 0;
				while ((st = br.readLine()) != null) {
					num.push(st);
				    if(st.contains(op.needFind)) {
				    	System.out.println("Line: " + count + " Content" + st);
				    	System.out.println(num.toString());
				    }
				    count++;
				} 
			}else {
				System.out.println("Invalid input parameter: -f pathFile -c content -l numberLineBefore");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
