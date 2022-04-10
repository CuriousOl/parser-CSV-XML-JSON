package ru.netology;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonParserImpl implements JsonParser {

    public static String readString(String fileName) {
        String str = "";
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(fileName));
            JSONArray jsonArray = (JSONArray) obj;
            str = jsonArray.toJSONString();
        } catch (IOException | ParseException e) {
            System.out.println(e.getMessage());
        }
        return str;
    }

    public static void writeString(String jsonFileName, String json) {
        try (FileWriter file = new FileWriter(jsonFileName)) {
            file.write(json);
            file.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
