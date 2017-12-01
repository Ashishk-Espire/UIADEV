package com.uia.encrypt.blowfish;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

import sun.misc.BASE64Encoder;

public class UIABlofishEncryption {

	private static String key = "uia_privilege_key";
	private static final String boundaryString = "jdnfuiqorsafcytp3293idcxkasnLIUuqwE9#e";
	private static final int BLOCK_SIZE = 8;
	
	// private static final String decryptedValue =
	// "K/KaY+KckLLWptCOAjA+9ulR1bROKtvIwpdUYAnsN1HqtB3LKFLH5WNmO055SDSRpzgEkhWlDJ0=";
	private Charset charset;

	
	public static void main(String[] str) {
		UIABlofishEncryption uiEncp = new UIABlofishEncryption();
		String newpassword = uiEncp.encodePassword("0iXnXTF");
		System.out.println("encrypted :" + newpassword);

	}

	public String encodePassword(String password) {
		
		String newPAsssword = null;

		try {
			byte[] encodedBytes = encodeToByteArray(password, key);
			newPAsssword = new BASE64Encoder().encode(encodedBytes);
		} catch (Exception ex) {
			newPAsssword = "null";
		}

		return newPAsssword;

	}

	public byte[] encodeToByteArray(String key, String str) {
		byte[] buf = getCharset().encode(str).array();
		return encode(key, buf);
	}

	protected byte[] getBoundary() {
		return boundaryString.getBytes();
	}

	private Charset getCharset() {
		if (charset == null) {
			charset = Charset.forName("ISO-8859-1");
		}
		return charset;
	}

	public byte[] encode(String key, byte[] buf) {
		return encrypt(buf, key);
	}

	public byte[] encrypt(byte[] clearText, String key) {
		BlockCipher cipher = createBlockCpher(key);
		int blockSize = getBlockSize();
		byte[] block = new byte[blockSize];
		byte[] boundary = getBoundary();
		int length = clearText.length + boundary.length;
		byte[] clear = new byte[length + BLOCK_SIZE - length % BLOCK_SIZE];
		System.arraycopy(clearText, 0, clear, 0, clearText.length);
		System.arraycopy(boundary, 0, clear, clearText.length, boundary.length);
		byte[] encoded = new byte[clear.length];
		int idx = 0;
		while (idx < clear.length) {
			encodeBlock(cipher, clear, idx, block);
			System.arraycopy(block, 0, encoded, idx, blockSize);
			idx += blockSize;
		}
		return encoded;
	}

	public String encode(String key, String str) {
		return getCharset().decode(ByteBuffer.wrap(encodeToByteArray(key, str))).toString();
	}

	protected int getBlockSize() {
		return BLOCK_SIZE;
	}

	protected void encodeBlock(BlockCipher cipher, byte[] clearText, int offset, byte[] buffer) {
		cipher.encrypt(clearText, offset, buffer, 0);
	}

	protected BlockCipher createBlockCpher(String key) {
		return new BlowfishCipher(key);
	}

}
