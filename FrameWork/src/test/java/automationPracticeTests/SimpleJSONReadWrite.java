package automationPracticeTests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class SimpleJSONReadWrite {
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) throws Exception {
		/*writeJsonSimple();
		JSONObject output=new JSONObject();
		output=(JSONObject) readJson();
		System.out.println(output);
		System.out.println(output.get("name"));
		output.replace("age", "30");
		System.out.println(output);*/
		readEmpJson();
		
	}
	
	@SuppressWarnings("unchecked")
	public static void writeJsonSimple() throws Exception {
	    JSONObject sampleObject = new JSONObject();
	    sampleObject.put("name", "SanaIffatKhan");
	    sampleObject.put("age", 25);

	    JSONArray messages = new JSONArray();
	    messages.add("Hey!");
	    messages.add("What's up?!");

	    sampleObject.put("messages", messages);

	    FileWriter file = new FileWriter(".//newJSON.json");
	    file.write(sampleObject.toJSONString());
	    file.close();
	}
	
	public static Object readJson() throws IOException, ParseException {
		FileReader reader= new FileReader(".//newJSON.json");
		JSONParser parser=new JSONParser();
		return parser.parse(reader);
	}
	
	@SuppressWarnings("unchecked")
	public static void readEmpJson() throws IOException, ParseException {
		FileReader reader= new FileReader("C:\\Users\\admin\\eclipse-workspace\\FrameWork\\src\\test\\java\\automationPracticeTests\\emp.json");
		JSONParser parser=new JSONParser();
		Object obj= parser.parse(reader);
		JSONObject output=(JSONObject) obj;
		System.out.println(output.get("secondName"));
		JSONArray array= (JSONArray)output.get("address");
		
		for(int i=0;i<array.size();i++)
		{
			JSONObject addarray = (JSONObject) array.get(i);	
			String street = (String) addarray.get("street");  
			System.out.println(street);
			String city = (String) addarray.get("city");  
		    System.out.println(city);
		         
		        //Get employee website name
		    String state = (String) addarray.get("state");    
		    System.out.println(state);
		}
		array.forEach( (e) -> parseEmployeeObject((JSONObject)e) );
	}

	private static void parseEmployeeObject(JSONObject emp) 
	{
		JSONObject addarray = (JSONObject) emp.get("address");	
		String street = (String) addarray.get("street");  
		System.out.println(street);
		String city = (String) addarray.get("city");  
	    System.out.println(city);
	         
	        //Get employee website name
	    String state = (String) addarray.get("state");    
	    System.out.println(state);
		
	}
	

}
