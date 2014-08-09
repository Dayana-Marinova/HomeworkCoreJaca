package hackbulgariaFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;

public class WordCountResult {
	
	int lineCount;
	static int wordCount;
	static int charCount;
	
	public WordCountResult(){
		this.lineCount = 0;
		WordCountResult.setWordCount(0);
		WordCountResult.setCharCount(0);
	}
	
	public WordCountResult(int line, int word, int chars){
		this.lineCount = line;
		WordCountResult.setWordCount(word);
		WordCountResult.setCharCount(chars);
	}
	
	public int getLine(){
		return this.lineCount;
	}
	
	public int getWord(){
		return WordCountResult.getWordCount();
	}
	
	public int getChar(){
		return WordCountResult.getCharCount();
	}
	
	public void setLine(int line){
		this.lineCount = line;
	}
	
	public void setWord(int word){
		WordCountResult.setWordCount(word);
	}
	
	public void setChar(int chars){
		WordCountResult.setCharCount(chars);
	}
	
	
	public static WordCountResult wordCount(Path path) throws IOException{
		return new WordCountResult(LineCount(path), wordsCount(path), CharCount(path));
	}

	public static int wordsCount(Path path) throws IOException{
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		for (String line : lines){
			String[] words = line.split("\\s");
			setWordCount(getWordCount() + words.length);
		}
		return getWordCount();
	}

	public static int LineCount(Path path) throws IOException {
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		return lines.size();
	}

	public static int CharCount(Path path) throws IOException {
		LinkedList<String> lines = (LinkedList<String>) Files.readAllLines(path, Charset.defaultCharset());
		for(String line : lines){
			setCharCount(line.length());
		}
		return getCharCount();
	}

	public static int getCharCount() {
		return charCount;
	}

	public static void setCharCount(int charCount) {
		WordCountResult.charCount = charCount;
	}

	public static int getWordCount() {
		return wordCount;
	}

	public static void setWordCount(int wordCount) {
		WordCountResult.wordCount = wordCount;
	}
}
