package com.xiaoma.serialize;

import java.io.*;

public class SerializeDemo {

    public static void main(String[] args) {
        SerializePerson();

//        Son.height = 190;
//
//        DeSerializePerson();
    }

    private static void SerializePerson() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(new File("person")));
            People person = new People();
            person.setAge(22);
            person.setName("wenyiwu");
            outputStream.writeObject(person);
            outputStream.flush();

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));

            People person1 = (People) inputStream.readObject();
            System.out.println("person1.name = " + person1.getName());
            person.setName("wanghui");
            System.out.println("person1.name = " + person1.getName());
            outputStream.writeObject(person);
            outputStream.flush();
            People person2 = (People) inputStream.readObject();
            System.out.println("person2.name = " + person2.getName());
            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void DeSerializePerson() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File("person")));
            People person = (People) inputStream.readObject();
            System.out.println(person.getName() + " : " + person.getAge() + " : " + person.height);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
