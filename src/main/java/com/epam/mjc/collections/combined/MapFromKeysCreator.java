package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>>result=new HashMap<>();
        ArrayList<Integer>keysLength=new ArrayList<>();
        for (Map.Entry<String, Integer> e : sourceMap.entrySet()){
            keysLength.add(e.getKey().length());
        }
        ListIterator<Integer> it = keysLength.listIterator(keysLength.size());
        while(it.hasNext()) {
            for (Map.Entry<String, Integer> e : sourceMap.entrySet()){
                if(it.next()==e.getKey().length())
                    result.put(it.next(), Collections.singleton(e.getKey()));
            }
        }
        return result;
    }
}
