package com.xiaoma.design.pattern.clone;


import java.io.*;
import java.util.ArrayList;

public class Cloner implements Cloneable, Serializable{
    public String name;
    public ArrayList<String> strArr;
    public int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
        //return deepClone();
    }

    public Object deepClone() {
        try {

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            Cloner copy = (Cloner) ois.readObject();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }


}
