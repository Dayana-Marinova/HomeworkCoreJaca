public class Logger {
	private Integer level;
	
	public Logger(Integer level){
		if (level > 0){
			this.level = level;
		}
	}
	
	public int getLevel(){
		return this.level;
	}
	
	public void setLevel(Integer level){
		if (level > 0){
			this.level = level;
		}
	}
	
	public void log(Integer level, String sentence){
		if (this.level >= level && level > 0){
			System.out.println(sentence);
		}
	}
	
	public void log(String sentence){
		if (this.level >= 3){
			System.out.println(sentence);
		}
	}
}
