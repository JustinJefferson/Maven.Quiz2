package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return ((isGreaterThan5(valueToEvaluate)) && (isLessThan7(valueToEvaluate)));
    }

    public Boolean startsWith(String string, Character character) {

        String lowerString = string.toLowerCase();
        Character lowerChar = Character.toLowerCase(character);

        return (lowerChar.equals(lowerString.charAt(0)));
    }
}
