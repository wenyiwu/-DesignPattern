package com.xiaoma.serialize.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiaoma.serialize.Person;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonDemo {

    private static Person init() {
        Person person = new Person();
        person.setName("wenyiwu");
        person.setAge(22);
        return person;
    }

    public static void main(String[] args) {
        try {
            executeWithJack();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void executeWithJack() throws IOException {
        Person person = init();

        ObjectMapper mapper = new ObjectMapper();
        byte[] writeBytr = null;

        writeBytr = mapper.writeValueAsBytes(person);
        Person person1 = mapper.readValue(writeBytr, Person.class);
    }


    private static void executeWithFastJson() throws IOException {
        Person person = init();

        String text = JSON.toJSONString(person);


        Person person1 = JSON.parseObject(text, Person.class);
    }
}
