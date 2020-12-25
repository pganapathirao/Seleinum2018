package EncodeDecodePassword;

import org.apache.commons.codec.binary.Base64;

public class EncodeDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="admin123";
	    byte[] encoded= Base64.encodeBase64(str.getBytes());
	    System.out.println("Encoded String "+new String(encoded));
	    
	   byte[] decoded= Base64.decodeBase64(encoded);
	   System.out.println("Encoded String "+new String(decoded));
	}

}
