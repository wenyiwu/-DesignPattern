package com.xiaoma.serialize.test;

import com.xiaoma.serialize.Person;
import com.xiaoma.serialize.parent.User;
import org.junit.jupiter.api.Test;

import java.io.*;

public class SerializeTest {
    @Test
    public void SuperSerializeTest() {
        User user = new User();
        user.setAge(18);
        serialize(user);

        User user1 = (User) deSerialize();
        System.out.println(user1.getAge());
    }

    private void serialize(Object obj) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("person")));
            outputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Object deSerialize() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));
            return inputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
