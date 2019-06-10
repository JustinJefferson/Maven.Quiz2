package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListUtility {

    private List<Integer> list;

    public ListUtility(){
        list = new LinkedList<>();
    }

    public Boolean add(Integer i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {

        List<Integer> unique = new LinkedList<>();

        for(Integer num : list) {
            if(!unique.contains(num)) unique.add(num);
        }

        return unique;
    }

    public String join() {

        String result = "";
        Integer index = 0;

        while(index < list.size()) {

            result += Integer.toString(list.get(index));
            if(index + 1 < list.size()) result += ", ";
            index++;

        }

        return result;
    }

    public Integer mostCommon() {

        Integer value = null;
        Integer most = 0;

        for(int i = 0; i < list.size(); i++) {

            Integer count = 0;

            if(list.get(i) != null) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) count++;
                }
            }
            else{

                for (int j = 0; j < list.size(); j++) {
                    if(list.get(j) == null) count++;
                }
            }

            if(count > most){
                value = list.get(i);
                most = count;
            }
        }

        return value;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
