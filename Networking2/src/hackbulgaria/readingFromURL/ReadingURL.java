package hackbulgaria.readingFromURL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadingURL {
	public static void main(String[] args) throws Exception {

        URL oracle = new URL("http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
}
