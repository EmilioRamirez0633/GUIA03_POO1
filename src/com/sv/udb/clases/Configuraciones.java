/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leyes
 */
public class Configuraciones {
    
    public List<Valoresconf> getData()
    {
        List<Valoresconf> resp = null;
        try
        {
            String csvFile = "com/sv/udb/files/Configuraciones.csv";
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
                    resp.add(new Valoresconf(nota[0], nota[1], nota[2],nota[3], nota[4], nota[5]));
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    return resp;
    }
}
