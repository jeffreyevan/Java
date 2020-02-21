/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author jeffrey evan
 */
public class Saj {
    public static void main(String args[]) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("Student.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);
            studentList.forEach( std -> parseStudentObject( (JSONObject) std ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseStudentObject(JSONObject student) {
      JSONObject studentObject = (JSONObject) student.get("student");
      String firstName = (String) studentObject.get("firstName");
      System.out.println(firstName);

      String lastName = (String) studentObject.get("lastName");
      System.out.println(lastName);

      String subject = (String) studentObject.get("subject");
      System.out.println(subject);

      String marks = (String) studentObject.get("marks");
      System.out.println(marks);
    }
  }
