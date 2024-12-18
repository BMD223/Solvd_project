package com.example.org;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        System.out.println("hello!");
        String path="/Users/bbd223/Desktop/Solvd/T7/Solvd_project/UniqueWordsCounter/src/main/java/com/example/org/input.txt";
        ArrayList<String> lines = null;
        try {
            lines= (ArrayList<String>) FileUtils.readLines(FileUtils.getFile(path), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Something bad happened");
            e.printStackTrace();
        };
        System.out.println("check");
        ArrayList<String> allStrings= new ArrayList<>();
        int counter=0;
        for(String s:lines){
            s=StringUtils.replace(s,".","");
            s=StringUtils.replace(s,",","");
            allStrings.addAll(Arrays.asList(StringUtils.split(s)));
        }

        HashSet hs= new HashSet();
        for(String s : allStrings){
            hs.add(s.toLowerCase());
            //System.out.println(s.toLowerCase());
        }
        System.out.println(hs.size());

        //try {
        //    FileUtils.write(FileUtils.getFile(path), String.valueOf(hs.size()),StandardCharsets.UTF_8);
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        //not sure if I have to write it into the file as in replace the text with the number
        //If not then :
        try {
            FileUtils.writeStringToFile(FileUtils.getFile(path), "\n"+String.valueOf(hs.size()),StandardCharsets.UTF_8,true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
