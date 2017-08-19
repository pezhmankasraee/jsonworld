package com.pezhmankasraee.jsonworld;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonIOException, IOException
    {
        Gson gson = new Gson();
        Student st = new Student();
        st.setStudentId("SE893w2983e525");
        st.setStudentFullName("John Dow");
        st.setFieldOfStudy("Master programme of software engineering");
        
        // POJO to Json
        String jsonString = gson.toJson(st);
        System.out.println(jsonString);
    	
        // Json to POJO
        Student pojo = gson.fromJson(jsonString, Student.class);
        
        System.out.println(pojo.getStudentId());
        System.out.println(pojo.getStudentFullName());
        System.out.println(pojo.getFieldOfStudy());
        
    	System.out.println("INFO> DONE...");
    }
}
