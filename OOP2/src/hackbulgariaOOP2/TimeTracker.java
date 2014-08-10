package hackbulgariaOOP2;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeTracker {
	
	Map<String, Info> map = new HashMap<>();
	
	public TimeTracker(){
		
	}
	
	public void start(String name){
		Info info = new Info(name);
		info.setStart(System.currentTimeMillis());
		map.put(name, info);
	}
	
	public void update(String name){
		Info info = map.get(name);
		info.addList(new Date(0));
	}
	
	public void finish(String name){
		Info info = map.get(name);
		info.setEnd(System.currentTimeMillis());
	}
	
	public int getTime(String name){
		Info info = map.get(name);
		return (int) (info.getEnd() - info.getStart());
	}
	
	public String getReport(String name) {

		Info info = map.get(name);

        Date startDate = new Date(info.getStart());
        Date endDate = new Date(info.getEnd());

        long time = getTime(name);

        StringBuilder executionTimeString = new StringBuilder("Operation " + info.getName()
                + " took " + time + " ms." + "\n" + startDate + " - started" + "\n" + endDate + " - finished" + "\n");
        
        StringBuilder updateTimeString = new StringBuilder();
        for (java.util.Date date : info.getUpdates()) {
            updateTimeString.append("next update: " + date + "\n");
        }
        
        return executionTimeString.append(updateTimeString).toString();

    }

}
