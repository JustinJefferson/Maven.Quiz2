package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class Router {

    private Map<String, String> routerMap;


    public Router(){
        routerMap = new HashMap<>();
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



        return null;//(path + " -> " + getController(path));

    }
}
