package com.xiaoma.serialize.protobuf;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

import java.io.IOException;

public class ProtoBufDemo {

    private static void executeWithProtoBuf() throws IOException {

        Proto proto = new Proto();

        Codec<Proto> codec = ProtobufProxy.create(Proto.class, false);

        byte[] bytes = codec.encode(proto);

        Proto proto1 = codec.decode(bytes);
    }
}
