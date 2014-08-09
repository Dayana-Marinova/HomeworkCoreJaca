package hackbulgariaFiles;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {
	
	public FileUtils(){
		
	}
	
	public static String readFrom(File file) throws IOException{
		Path path = file.toPath();
		String result = new String(readFrom(path));
		return result;
	}

	public static String readFrom(Path path) throws IOException {
		byte[] bytes = Files.readAllBytes(path);
		String result = new String(bytes, Charset.defaultCharset());
		return result;
	}
}
