/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Andy
 */
public class MapExample {
    
    void wordMap(String[] words, Map<String, Integer> m)
    {
        for (String word : words)
        {
            word = word.toLowerCase()
                    .replaceAll("^\\W+", "")
                    .replaceAll("\\W+$", "");
            if (m.containsKey(word))
                m.put(word, m.get(word)+1);
            else
                m.put(word, 1);
        }
    }
    void printMap(Map<String, Integer> m)
    {
        for(Map.Entry<String, Integer> e : m.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
        
    }
    void printMapSortValue(Map<String, Integer> m)
    {
        m.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue((v1,v2)->v2.compareTo(v1)))  // sort from large to small
                    .forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
        
        //m.forEach((k,v)->System.out.println(k+" "+v));
    }
    public void wordCount()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader("TomSawyer.txt"));)
        {
            String line;
            int lineCount=0;
            int wordCount=0;
            Map<String, Integer> map=new TreeMap<>();
            while ( (line =reader.readLine()) != null  )
            {
                lineCount++;
                String[] words = line.split("[- ]");
                wordCount += words.length;
                
                wordMap(words, map);
            }
            printMap(map);
            printMapSortValue(map);
            System.out.println("unique word count "+map.size());
            System.out.println("line "+lineCount+" words "+wordCount);
        } catch (IOException e)
        {
            System.out.println("read file exception");
        }
    }
    
    public static void main(String[] args)
    {
        new MapExample().wordCount();
    }
}
