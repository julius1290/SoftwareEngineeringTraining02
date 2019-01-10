package com.julius.utility;

import com.julius.field.IPosition;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//This is a workaround to the originally intended method to sort the HashMap by value into a TreeMap
public class ValueSorter {

    HashMap<IPosition, Integer> sortedMap;

    public ValueSorter(){
        sortedMap = new HashMap<>();
    }

    public HashMap<IPosition, Integer> sortMapByGrains(HashMap<IPosition, Integer> unsortedMap){
        return sortedMap = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }
}
