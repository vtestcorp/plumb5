package helperMethods;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtils {

	private static FileReader reader;
	private static JSONParser jsonParser;
	private static JSONObject jsonObject;
	private static Object object;
	private static JSONArray jsonArray;

	public static String getData(String filePath, String field) {

		try {
			reader = new FileReader(filePath);
			jsonParser = new JSONParser();
			object = jsonParser.parse(reader);
			jsonObject = (JSONObject) object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (String) jsonObject.get(field);
	}

	public static void getData1(String filePath, String field) {

		try {
			reader = new FileReader(filePath);
			jsonParser = new JSONParser();
			object = jsonParser.parse(reader);
			jsonObject = (JSONObject) object;
			jsonObject.get("Name");
			System.out.println(jsonObject.get("Name"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] ar) {
		JsonUtils.getData1("Contact Details.json", "Details");
	}

}
