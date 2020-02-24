/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.xml;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author jeffrey evan
 */
public class SAJ {
    public static void main(String args[]) throws FileNotFoundException, IOException {

    //JSON parser object to parse read file
    FileReader fr = new FileReader("src/learning/xml/Student.json");
    JsonParser parser = new JsonParser();
    JsonElement jsonTree = parser.parse(fr);

    JsonObject jsonObject = jsonTree.getAsJsonObject();
    JsonElement A = jsonObject.get("Class");
    System.out.println(A);
    }
}
