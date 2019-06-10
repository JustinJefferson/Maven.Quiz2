package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] result = new Integer[array1.length + array2.length];

        Integer index = 0;

        for(Integer num : array1) {
            result[index] = num;
            index++;
        }

        for(Integer num : array2) {
            result[index] = num;
            index++;
        }

        return result;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] result = new Integer[array.length];
        Integer i = index;
        Integer count = 0;

        while(count < array.length) {
            result[count] = array[i];
//            System.out.println(result[count]);
            count++;
            if(i + 1 < array.length) {
                i++;
            }
            else {
                i = 0;
            }
        }

        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count = 0;

        for(Integer num : array1) {
            if(num.equals(valueToEvaluate)) count++;
        }

        for(Integer num : array2) {
            if(num.equals(valueToEvaluate)) count++;
        }

        return count;
    }

    public Integer mostCommon(Integer[] array) {

        Integer value = null;
        Integer most = 0;

        for(Integer num : array) {

            Integer count = 0;

            for(int i = 0; i < array.length; i++) {
                if(num.equals(array[i])) count++;
            }

            if(count > most) {
                value = num;
                most = count;
            }
        }

        return value;
    }
}
