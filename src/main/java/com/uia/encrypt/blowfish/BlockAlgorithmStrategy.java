package com.uia.encrypt.blowfish;


public abstract class BlockAlgorithmStrategy implements CryptographyAlgorithmStrategy {
	private static final String boundaryString = "jdnfuiqorsafcytp3293idcxkasnLIUuqwE9#e";

	protected byte[] getBoundary() {
		return boundaryString.getBytes();
	}

	public byte[] encrypt(byte[] clearText, String key) {
		BlockCipher cipher = createBlockCpher(key);
		int blockSize = getBlockSize();
		byte[] block = new byte[blockSize];
		byte[] boundary = getBoundary();
		int length = clearText.length + boundary.length;
		byte[] clear = new byte[length + 8 - length % 8];
		System.arraycopy(clearText, 0, clear, 0, clearText.length);
		System.arraycopy(boundary, 0, clear, clearText.length, boundary.length);
		byte[] encoded = new byte[clear.length];
		int idx = 0;
		while(idx < clear.length) {
			encodeBlock(cipher, clear, idx, block);
			System.arraycopy(block, 0, encoded, idx, blockSize);
			idx += blockSize;
		}
		return encoded;
	}

	public byte[] decrypt(byte[] encodedText, String key) {
		
		byte[] result = null;;
		BlockCipher cipher = createBlockCpher(key);
		int blockSize = getBlockSize();
		byte[] block = new byte[blockSize];
		byte[] decoded = new byte[encodedText.length];
		int idx = 0;
		while(idx < encodedText.length) {
			decodeBlock(cipher, encodedText, idx, block);
			System.arraycopy(block, 0, decoded, idx, blockSize);
			idx += blockSize;
		}
		byte[] boundary = getBoundary();
		outer: for(int i = decoded.length - 1; i > 0; i--) {
			if (decoded[i] == boundary[0]) {
				for(int j = 0; j < boundary.length; j++) {
					if (decoded[i + j] != boundary[j]) {
						continue outer;
					}
				}
				result = new byte[i];
				System.arraycopy(decoded, 0, result, 0, i);
				
			}
		}
		return result;
	}

	protected int getBlockSize() {
		return 8;
	}

	protected void encodeBlock(BlockCipher cipher, byte[] clearText, int offset, byte[] buffer) {
		cipher.encrypt(clearText, offset, buffer, 0);
	}

	protected void decodeBlock(BlockCipher cipher, byte[] encodedText, int offset, byte[] buffer) {
		cipher.decrypt(encodedText, offset, buffer, 0);
	}

	protected abstract BlockCipher createBlockCpher(String key);
}
