package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String>projectsForDeveloper=new ArrayList<>();
        for (Map.Entry<String, Set<String>> e : projects.entrySet()){
        for(Set<String> valueList : projects.values()) {
            for(String value : valueList) {
                if(value.equals(developer)){
                    projectsForDeveloper.add(e.getKey());
            }}}}
        projectsForDeveloper.sort(Comparator.comparingInt(String::length));
        return projectsForDeveloper;
}}
