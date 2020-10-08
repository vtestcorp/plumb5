package helperMethods;

import java.io.FileReader;
import java.io.FileWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtils {

	private static FileWriter file;
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

	public static void setData(String key, String value, String inputFile) {
		try {
			jsonParser = new JSONParser();
			object = jsonParser.parse(new FileReader(inputFile));
			jsonObject = (JSONObject) object;

			jsonObject.put(key, value);

			file = new FileWriter(inputFile);
			file.write(jsonObject.toJSONString());
			file.flush();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static JSONArray getArrayValues(String filePath, String field) {
		try {
			reader = new FileReader(filePath);
			jsonParser = new JSONParser();
			object = jsonParser.parse(reader);
			jsonObject = (JSONObject) object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (JSONArray) jsonObject.get(field);
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

	public static void main(String[] ar) throws Exception {
		JsonUtils.setData("shop", "", "C:\\Users\\Admin\\Desktop\\abc.json");
	}
}