import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Bandwidth {
	public static void main(String [] args){
		String str = null;
		try {
			str = Bandwidth.buildfromFile("Sample.txt");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(str);
		String[] all = str.split("\n");
		all[0] = all[0].toString().trim();
		all[1] = all[1].toString().trim();
		int verts = Integer.parseInt(all[0]);
		int edgs = Integer.parseInt(all[1]);
		String s = "vertex";
		ArrayList<String> v = new ArrayList<String>();
		for(int i = 0; i<verts; i++){
			v.add(s + i);
			System.out.println(v.get(i));
		}
		
	}
	public static String buildfromFile(String pagesFile) throws IllegalArgumentException, FileNotFoundException, IOException{
		String everything2;
		try(BufferedReader br = new BufferedReader(new FileReader(pagesFile))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();
	
		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    everything2 = everything;
		}
		return everything2;
	}
	//Every possible permutation from array to finish call
	//return to unmake move
	//tracks number of characters allowed
	//All calls with 1 are permuted with the first letter
	//If size = array size -1 then good
	//global variable to hold shortest length
}
