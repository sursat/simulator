package com.egnaro.entities;

/**
 * Created by prasad on 12/12/16.
 */
public enum ContentType {
    TEXT("text"),TEXTPLAIN("text/plain"),
    JAVASCRIPT("application/javascript"),
    JSON("application/json"),XML("application/xml"),
    XMLTEXT("text/xml"),HTML("text/html");

    private String type;

    ContentType(String type){
        this.type = type;
    }

    public static boolean isMember(String type){
        ContentType[] contentTypes = ContentType.values();
        for(ContentType contentType : contentTypes)
            if(contentType.type.equals(type))
                return true;
        return false;
    }

    public static ContentType of(String type){
        ContentType[] contentTypes = ContentType.values();
        for(ContentType contentType : contentTypes)
            if(contentType.type.equals(type))
                return contentType;
        throw new IllegalArgumentException();
    }
}
