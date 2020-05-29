import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ian {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("getal.txt"));
		PrintWriter pw = new PrintWriter(fw);
				
		for (int i = 0; i < 40;) {
			int random = (int) Math.floor(Math.random()*10);
			pw.println(random);
			i++;
		}
		
		fw.close();
		pw.close();
	}

}
