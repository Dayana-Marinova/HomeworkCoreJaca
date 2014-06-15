import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger{
	
	public DateLogger(Integer level){
		super(level);
	}
	
	public DateLogger(){
		this(3);
	}
	
	public void log(Integer level, String sentence){
		SimpleDateFormat date = new SimpleDateFormat("hh:mm:ss dd-M-yyyy");
		String result = "|" + date.format(new Date()) + "| " + level.toString() + "-->";
		sentence = result + sentence;
		
		super.log(level, sentence);
	}
}
