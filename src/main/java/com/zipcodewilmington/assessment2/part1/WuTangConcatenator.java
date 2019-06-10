package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    private Integer num;
    public WuTangConcatenator(Integer input) {
        num = input;
    }

    public Boolean isWu() {
        return (num % 3 == 0);
    }

    public Boolean isTang() {
        return (num % 5 == 0);
    }

    public Boolean isWuTang() {
        return ((isWu() && isTang()));
    }
}
