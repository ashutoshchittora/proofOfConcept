package com.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetData
{
	 @JsonProperty("id")
    private String id;

	 @JsonProperty("name")
    private String name;

	 @JsonProperty("desc")
    private String desc;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return this.desc;
    }
}
