package com.xiaoma.serialize.json;

import com.alibaba.fastjson.JSON;
import com.xiaoma.serialize.People;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonDemo {

    private static People init() {
        People person = new People();
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
        People person = init();

        ObjectMapper mapper = new ObjectMapper();
        byte[] writeBytr = null;

        writeBytr = mapper.writeValueAsBytes(person);
        People person1 = mapper.readValue(writeBytr, People.class);
    }


    private static void executeWithFastJson() throws IOException {
        People person = init();

        String text = JSON.toJSONString(person);


        People person1 = JSON.parseObject(text, People.class);
    }
}
