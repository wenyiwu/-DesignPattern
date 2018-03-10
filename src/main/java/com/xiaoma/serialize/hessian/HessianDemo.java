package com.xiaoma.serialize.hessian;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;
import com.xiaoma.serialize.Person;
import com.xiaoma.serialize.protobuf.Proto;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HessianDemo {

    private static void executeWithProtoBuf() throws IOException {

        Person person = new Person();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        HessianOutput hessianOutput = new HessianOutput(outputStream);
        hessianOutput.writeObject(person);

        HessianInput hessianInput = new HessianInput(new ByteArrayInputStream(outputStream.toByteArray()));
        Person person1 = (Person)hessianInput.readObject();
    }
}
