package com.uia.util;

import java.security.NoSuchAlgorithmException;

public class jcetest1 {
	public static void main(String[] arg){
		int len = 0;
		try {
			len = javax.crypto.Cipher.getMaxAllowedKeyLength("AES");
			
			System.out.println(javax.crypto.Cipher.getMaxAllowedKeyLength("AES") >= 256);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(len);
	
	
	}

}
