package Tool;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonUtil {

    public static String GsonFormatToString(JsonObject Object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(Object);
    }


}
