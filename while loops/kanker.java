import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class kanker {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter(new File("kak.txt"));
		PrintWriter pw = new PrintWriter(fw);
		pw.println("kak");
		pw.close();
		fw.close();
	}
}
