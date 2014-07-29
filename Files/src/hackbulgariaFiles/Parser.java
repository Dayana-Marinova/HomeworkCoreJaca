package hackbulgariaFiles;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;

public class Parser {
	
	public Parser(){
		
	}
	
	private static Map<String, String> helper(java.util.LinkedList<String> list){
		Map<String, String> map = new HashMap<String, String>();
		for (String string : list){
			if (!(string.substring(0).equals("#"))){
				int index = string.indexOf('=');
				map.put(string.substring(0, index).trim(), string.substring(index + 1, string.length()));
			}
		}
		return map;
	}
	
	public static Map<String, String> parser(File file) throws IOException{
		LinkedList<String> list = (LinkedList<String>) Files.readAllLines(file.toPath(), Charset.defaultCharset());
		Map<String, String> result = new HashMap<String, String>();
		result = helper(list);
		return result;
	}
}
