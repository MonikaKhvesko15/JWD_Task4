package com.epam.task4.data;

import com.epam.task4.entity.Array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer{
    private String filename;

    //constructor
    public FileDataAcquirer(String filename){
        this.filename=filename;
    }

    @Override
    public Array getIntArray() throws DataException{
        Array array=new Array();
        //this.getClass().getResourceAsStream("input.txt");
        BufferedReader reader=null;
        try {
            reader=new BufferedReader(new FileReader(filename));
            String line= reader.readLine();
            for (int i: array.getArray()
                 ) {
                array.getArray()[i]=Integer.parseInt(line);
            }
            return array;
        } catch (IOException |NumberFormatException e) {
            throw  new DataException(e.getMessage(),e);
        }finally {
            if(reader!=null){
                try{
                    reader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
