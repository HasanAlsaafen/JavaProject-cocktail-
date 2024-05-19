/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktail;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class MyLogger implements Logger {

    @Override
    public void log(String something) {
       
    try {
 FileWriter fw=new FileWriter("mylogger.txt",true);
fw.write(something);
fw.close();
} catch (IOException e) {
  
JOptionPane.showMessageDialog(null,"Error writing to file: " + e.getMessage());
}

    }

    public MyLogger() {
    }
}
    
