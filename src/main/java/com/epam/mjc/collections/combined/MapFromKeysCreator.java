package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>>result=new HashMap<>();
        ArrayList<Integer>keysLength=new ArrayList<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()){
            keysLength.add(e.getKey().length());
        }

        for (Integer integer : keysLength) {
            Set<String> daysOfWeek = new HashSet<>();
            for (Map.Entry<String, Integer> e : sourceMap.entrySet()) {
                if (integer == e.getKey().length())
                    daysOfWeek.add(e.getKey());
                result.put(integer, daysOfWeek);
            }
        }
        return result;
    }
}
