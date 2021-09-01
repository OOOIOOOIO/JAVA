package file;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BoxOfficeView {
	private static String contents;
	
	public static String getContents() {
		return contents;
	}
	
	public static void setContents(String contentes) {
		BoxOfficeView.contents = contents;
	}
	
	public static void main(String[] args) throws Exception{
		contents = new String(Files.readAllBytes(Paths.get("boxOffice.txt")), "EUC-KR");
		System.out.println(contents);
	}
	
	
	
}
