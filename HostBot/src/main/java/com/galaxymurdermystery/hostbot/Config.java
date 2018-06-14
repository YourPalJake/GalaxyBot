package com.galaxymurdermystery.hostbot;

import org.json.simple.JSONObject;

import java.io.File;

public class Config {
    private static JSONObject config;
    private static File file;

    private Config(){}

    public static void setup(){
        file = new File("./", "config.json");
        if(!file.exists()){

        }
    }

    public static JSONObject getConfig() {
        return config;
    }


}
