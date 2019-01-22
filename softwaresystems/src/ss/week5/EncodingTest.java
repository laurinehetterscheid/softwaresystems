package ss.week5;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;

/**
 * A simple class that experiments with the Hex encoding
 * of the Apache Commons Codec library.
 *
 */
public class EncodingTest {
    public static void main(String[] args) throws DecoderException {
        String input = "Hello World";
        
        String hexString = "4d6f64756c652032";
        
        String anotherHexString = "010203040506";
        
        String base64String = "U29mdHdhcmUgU31zdGVtcw==";

        System.out.println(Hex.encodeHexString(input.getBytes()));
                
        System.out.println(new String(Hex.decodeHex(hexString)));
        
        System.out.println(Base64.encodeBase64String(input.getBytes()));
        
        System.out.println(new String(Base64.decodeBase64(anotherHexString)));
        
        System.out.println(new String(Base64.decodeBase64(base64String)));
        
        System.out.println(Base64.encodeBase64String("a".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aa".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aaa".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aaaa".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aaaaa".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aaaaaa".getBytes()));
        
        System.out.println(Base64.encodeBase64String("aaaaaaa".getBytes()));
        
    }
}
