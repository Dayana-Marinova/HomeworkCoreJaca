package hackbulgariaOOP2;

import java.util.ArrayList;
import java.util.Date;

public class Info {
	
	protected String name;
	protected long start = 0;
	protected long end = 0;
	protected ArrayList<Date> updateList = new ArrayList<>();
	
	public Info(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public long getStart(){
		return this.start;
	}
	
	public long getEnd(){
		return this.end;
	}
	
	public ArrayList<Date> 	getUpdates(){
		return this.updateList;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setStart(long start){
		this.start = start;
	}
	
	public void setEnd(long end){
		this.end = end;
	}
	
	public void setUpdates(ArrayList<Date> list){
		this.updateList = list;
	}
	
	public void addList(Date date){
		this.updateList.add(date);
	}
}
