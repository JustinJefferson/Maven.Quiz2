package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Router {

    private Map<String, String> routerMap;


    public Router(){
        routerMap = new LinkedHashMap<>();
    }

    public void add(String path, String controller) {
        routerMap.put(path, controller);

    }

    public Integer size() {
        return routerMap.size();
    }

    public String getController(String path) {
        return routerMap.get(path);
    }

    public void update(String path, String studentController) {
        routerMap.replace(path, studentController);
    }

    public void remove(String path) {
        routerMap.remove(path);
    }

    @Override
    public String toString() {

        String result = "";
        Integer index = 0;

        for(String path : routerMap.keySet()) {
            String key = path;
            String value = routerMap.get(path);
            result += key + value + "\n";

//            index++;
//            if(index < routerMap.size()) result += "\n";


        }

        if(routerMap.containsKey("/students")) {
            result += "/students" + routerMap.get("/students") + "\n";
        }
        
        System.out.println(result);


        return result;//(path + " -> " + getController(path));

    }
}
