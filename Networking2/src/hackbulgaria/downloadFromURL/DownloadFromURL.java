package hackbulgaria.downloadFromURL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadFromURL {
	
	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}
	
	public static void main(String[] args) throws Exception {
		String imageUrl = "http://d3dsacqprgcsqh.cloudfront.net/photo/aozrdx0_700b.jpg";
		String destinationFile = "/home/didi/image.jpg";

		DownloadFromURL.saveImage(imageUrl, destinationFile);
	}
}
