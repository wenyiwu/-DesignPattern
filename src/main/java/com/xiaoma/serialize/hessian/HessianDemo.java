package com.xiaoma.serialize.hessian;

import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.xiaoma.serialize.People;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HessianDemo {

    private static void executeWithProtoBuf() throws IOException {

        People person = new People();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(outputStream);
        hessianOutput.writeObject(person);

        HessianInput hessianInput = new HessianInput(new ByteArrayInputStream(outputStream.toByteArray()));
        People person1 = (People)hessianInput.readObject();
    }
}
