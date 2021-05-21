package com.djulb.resource;

import com.djulb.io.ResourceRead;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class JsonToClassResourceReader<T> {

    public abstract String getResourceFilePath();

    protected T readConfig(Type contentClass){
        List<T> configs = new ArrayList<>();
        Gson gson = new Gson();

        String jsonInString = ResourceRead.readString(getResourceFilePath());
        T config= gson.fromJson(jsonInString, contentClass);
        return config;
    }
}