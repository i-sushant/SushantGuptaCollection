package org.epam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
    private static final Logger Logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) {
        MyCustomList<Integer> list = new MyCustomList<>();
        for(int i = 0; i < 5 ; i++) {
            list.add(i);
        }
        Logger.info(list);
        //Remove an element
        Logger.info("Removed : " + list.remove(3));
        Logger.info("Removed : " + list.remove(2));
        list.add(8);
        Logger.info("List size : " + list.size());
        //Get an element
        Logger.info("Element at index 2 : " + list.get(2));
        //Show list
        Logger.info("List : " + list);
    }
}
