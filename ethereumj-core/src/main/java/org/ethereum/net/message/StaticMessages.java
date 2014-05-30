package org.ethereum.net.message;

import org.ethereum.crypto.HashUtil;
import org.spongycastle.util.encoders.Hex;

/**
 * www.ethereumJ.com
 * User: Roman Mandeleil
 * Created on: 13/04/14 20:19
 */
public class StaticMessages {

    public static final byte[] PING             = Hex.decode("2240089100000002C102");
    public static final byte[] PONG             = Hex.decode("2240089100000002C103");
    public static final byte[] GET_PEERS        = Hex.decode("2240089100000002C110");
    public static final byte[] GET_TRANSACTIONS = Hex.decode("2240089100000002C116");

    public static final byte[] DISCONNECT_08 = Hex.decode("2240089100000003C20108");
    public static final byte[] GENESIS_HASH = Hex.decode("77ef4fdaf389dca53236bcf7f72698e154eab2828f86fbc4fc6cd9225d285c89"); // (new Genesis()).getHash();
    public static final byte[] MAGIC_PACKET = Hex.decode("22400891");

    static {
        HELLO_MESSAGE = generateHelloMessage();
    }
    public static HelloMessage HELLO_MESSAGE;
    public static HelloMessage generateHelloMessage(){
        byte[] peerIdBytes = HashUtil.randomPeerId();

        return new HelloMessage((byte) 0x13, (byte) 0x00,
                "EthereumJ [v0.5.1]  by RomanJ", (byte) 0b00000111,
                (short) 30303, peerIdBytes);
    }
}
