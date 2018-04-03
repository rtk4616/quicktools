package com.github.xbynet.test;

import com.alibaba.fastjson.JSONObject;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void test1(String a) throws Exception{
        //throw new Exception("111");
        String c="333";
        System.out.println(a+c);
    }

    public static void main1(String[] args) throws Exception {
        JSONObject json=JSONObject.parseObject("{\"id\":123,\"value\":\"123456\"}");
        System.out.println(json.getString("aaa"));
        String a="sadaad 'a' cxxccxcx @ sdsfsdf ^ sdfsdfd";
        System.out.println(a.replaceAll("\\'|@|#|\\^",""));
        System.out.println(a.getBytes().length);
        System.out.println(a.getBytes().length>=65535);

    }

    public static void main(String[] args) {
        //System.out.println(TaskRuleType.Transfer.name());
        //System.out.println(String.format("aaa%scv","1213"));
        try {
            System.out.println("中".getBytes("UTF-8").length+"::"+"z".getBytes("UTF-8").length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
