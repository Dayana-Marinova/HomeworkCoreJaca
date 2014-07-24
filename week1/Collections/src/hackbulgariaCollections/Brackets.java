package hackbulgariaCollections;

public class Brackets {
	int openBrackets;
	int closeBrackets;
	
	public Brackets(){
		this.openBrackets = 0;
		this.closeBrackets = 0;
	}
	
	public boolean bracketsCorrect(String input){
		if (input.charAt(0) != '(' && input.charAt(input.length() - 1) != ')'){
			return false;
		}
		for (int i = 0; i < input.length(); i++){
			if (input.charAt(i) == '('){
				openBrackets += 1;
			}
			if (input.charAt(i) == ')'){
				closeBrackets += 1;
			}
		}
		if (openBrackets != closeBrackets){
			return false;
		}
		return true;
	}
}
