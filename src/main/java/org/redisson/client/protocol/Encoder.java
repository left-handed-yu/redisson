package org.redisson.client.protocol;

public interface Encoder {

    byte[] encode(Object in);

}