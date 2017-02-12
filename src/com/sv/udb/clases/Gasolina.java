/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;
import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leyes
 */
public class Gasolina {
    public List<Valores> getData()
    {
        List<Valores> resp = null;
        try
        {
            String csvFile = "com/sv/udb/files/Datos.csv";
            File file = new File(ClassLoader.getSystemResource(csvFile).getFile());
            String line = "";
            String simb = ",";
            if(file.exists())
            {
                resp = new ArrayList<>();
                BufferedReader br = new BufferedReader(new FileReader(file));
                while ((line = br.readLine()) != null)
                {
                    String[] nota = line.split(simb);
                    resp.add(new Valores(nota[0], nota[1], nota[2]));
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    return resp;
    }
    
    
    
    
    
    
     public void Actualizar(List<Valores> Nuevo){
        
        String outputFile = "src\\com\\sv\\udb\\files\\Datos.csv";
        boolean alreadyExists = new File(outputFile).exists();
         
        if(alreadyExists){
            File ArchivoEmpleados = new File(outputFile);
            ArchivoEmpleados.delete();
        }
        
        try {  
            CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ',');
            for(Valores temp : Nuevo){
                 
                csvOutput.write(temp.getTipo());
                csvOutput.write(temp.getGalo());
                csvOutput.write(temp.getNombre());
                csvOutput.endRecord();                   
            }
            
            csvOutput.close();
         
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
