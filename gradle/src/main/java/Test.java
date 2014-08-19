
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.*;
import java.io.*;

public class Test{
  public Test(){

  }

  public void start() throws IOException{
      URL yahoo = new URL("http://httpbin.org/get");
      URLConnection yc = yahoo.openConnection();
      BufferedReader in = new BufferedReader(
                              new InputStreamReader(
                              yc.getInputStream()));
      String inputLine;
      String output = "";
      while ((inputLine = in.readLine()) != null)
    	  output += inputLine;
      in.close();

      System.out.println(output);

      JsonParser parser = new JsonParser();
      JsonObject o = (JsonObject)parser.parse(output);
      //System.out.println(o);
      JsonObject o2 = o.getAsJsonObject("headers");
      System.out.println(o2.getAsJsonPrimitive("User-Agent").getAsString());

  }
}
