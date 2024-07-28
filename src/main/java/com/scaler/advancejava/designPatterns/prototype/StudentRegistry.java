package com.scaler.advancejava.designPatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    void register(String name, Student student) {
        map.put(name, student);
    }

    Student get(String name){
        return map.get(name);
    }
}
