/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercreator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

/**
 *
 * @author Suolapurkki
 */
public class ToJson {
    
    
    public static String createJson(Character character) throws IOException{
        //create ObjectMapper object
        ObjectMapper mapper = JsonFactory.create();
        
        //parse java object to string
        String jsonString = mapper.toJson(character);
        
        
        
        File file = new File ("testi.json");
        BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
        out.write(jsonString);
        out.close();
        return jsonString;
    }
}
