package main;

import java.util.*;

/**
 * Created by therioyo on 28.11.14.
 */
public class Cat {
    static int idCounter = 0;
    int id;
    String name;
    Map<String,String> history;

    public Cat(String name){
        this.id = idCounter++;
        this.name = name;
        history = new HashMap<String, String>();
    }

    public void addHistory(String history){
        this.history.put(new Date().toString(),history);
    }

    public void showHistory(){
        System.out.println("\n"+this.name+":");
        Set<String>keys = history.keySet();
        for(String h:keys){
            System.out.println(h+" "+history.get(h));
        }
    }
}
