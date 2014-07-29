package hackbulgariaFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class WordCountResult {
	
	private int lineCount;
	private int wordCount;
	private int charCount;
	
	public WordCountResult(){
		this.lineCount = 0;
		this.wordCount = 0;
		this.charCount = 0;
	}
	
	public WordCountResult(int line, int word, int chars){
		this.lineCount = line;
		this.wordCount = word;
		this.charCount = chars;
	}
	
	public int getLine(){
		return this.lineCount;
	}
	
	public int getWord(){
		return this.wordCount;
	}
	
	public int getChar(){
		return this.charCount;
	}
	
	public void setLine(int line){
		this.lineCount = line;
	}
	
	public void setWord(int word){
		this.wordCount = word;
	}
	
	public void setChar(int chars){
		this.charCount = chars;
	}
	
	
	public WordCountResult wordCount(Path path) throws IOException{
		return new WordCountResult(LineCount(path), wordsCount(path), CharCount(path));
	}

	private int wordsCount(Path path) throws IOException {
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		for (String line : lines){
			String[] words = line.split("\\s");
			this.wordCount += words.length;
		}
		return this.wordCount;
	}

	private int LineCount(Path path) throws IOException {
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		return lines.size();
	}

	private int CharCount(Path path) throws IOException {
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		for(String line : lines){
			this.charCount = line.length();
		}
		return this.charCount;
	}
}
