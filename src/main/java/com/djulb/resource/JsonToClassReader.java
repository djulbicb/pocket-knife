package com.djulb.resource;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public abstract class JsonToClassReader<T> {

    public abstract String getResourceFilePath();

    protected T readConfig(Type contentClass, String jsonContent){
        Gson gson = new Gson();
        T config= gson.fromJson(jsonContent, contentClass);
        return config;
    }
}