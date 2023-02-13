package com.example.restaurantsupply.util;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;


@Data
@Accessors(chain = true)
public class Result {

    private Integer code;
    private String message;
    private Boolean success;
    private Map<String, Object> data = new HashMap<String, Object>();

    private Result(){}

    public static Result ok(){
        Result result = new Result();
        result.setCode(20000);
        result.setMessage("success");
        result.setSuccess(true);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setCode(20001);
        result.setMessage("fail");
        result.setSuccess(false);
        return result;
    }

    public static Result auto(Boolean success){
        return success ? ok() : error();
    }

    public Result code(Integer code){
        this.code = code;
        return this;
    }

    public Result message(String message){
        this.message = message;
        return this;
    }

    public Result success(Boolean success){
        this.success = success;
        return this;
    }

    public Result data(String key , Object value){
        data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.data = map;
        return this;
    }


}
