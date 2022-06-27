package baithicuoiki.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StoredFiles {
    private String storedFiles;
    private JsonArray memory;
    public StoredFiles(){
        
    }

    public StoredFiles(String storedFiles) {
        this.storedFiles = storedFiles;
        this.memory = read();
    }

    public int search(String key, String value) {
        int index = -1;
        String temp = null;

        for (int i = 0; i < memory.size(); i++) {
            JsonObject jB = memory.get(i).getAsJsonObject();
            temp = jB.get(key).getAsString();
            if (value.equals(temp)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public JsonArray read() {
        JsonArray jsonArray = null;

        try (FileReader reader = new FileReader(storedFiles)) {
            jsonArray = (JsonArray) JsonParser.parseReader(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonArray;
    }

    public void update(String iD, String name, String job, String phoneNumber, String address, String email,
            String borrowedBooks) {
        JsonObject jB = new JsonObject();

        jB.addProperty("iD", iD);
        jB.addProperty("name", name);
        jB.addProperty("job", job);
        jB.addProperty("phoneNumber", phoneNumber);
        jB.addProperty("address", address);
        jB.addProperty("email", email);
        jB.addProperty("Borrowed Books", borrowedBooks);

        memory.add(jB);
    }

    public void write() {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(storedFiles)) {
            gson.toJson(memory, writer);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void set(int index, JsonObject jsonObject) {
        memory.set(index, jsonObject);
    }

    public JsonArray getAll() {
        return this.memory;
    }   

}
