import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ListToJson {
    public static void ToJson(List<Employee> employees, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            Type listType = new TypeToken<List<Employee>>() {
            }.getType();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            String json = gson.toJson(employees, listType);
            fileWriter.write(json);
            fileWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
