package src.TaskManager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class HttpURLConnectionTM {

	private final String USER_AGENT = "SK Task manager Mozilla/3.0";

	public static void main(String[] args) throws Exception {

		HttpURLConnectionTM http = new HttpURLConnectionTM();

		System.out.println("Sending HTTP GET Request: ");
		http.sendGet();
	}

	// HTTP GET request
	void sendGet() throws Exception {

		String url = "https://www.bing.com/search?q=rexburg+idaho&qs=n&form=QBLH&pq=rexburg+idaho&sc=9-13&sp=-1&sk=&cvid=FAD1A46F11654F9EB2A035E9363703AD";

		URL anObject = new URL(url);
		HttpURLConnection connection = (HttpURLConnection) anObject.openConnection();

		// optional default is GET
		connection.setRequestMethod("GET");

		//add request header
		connection.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = connection.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());

	}
}
	

