package com.uia.encrypt.blowfish;

public interface CryptographyAlgorithmStrategy {
	public byte[] encrypt(byte[] clearText, String key);

	public byte[] decrypt(byte[] encodedText, String key);
}
