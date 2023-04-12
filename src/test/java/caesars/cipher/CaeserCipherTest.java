package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaeserCipherTest {
	private CaesarsCipher caesarsCipher = new CaesarsCipher();

	@Test
	void testEmptyOffsetInput() {
		assertEquals("Test", caesarsCipher.cipher("Test", 0));
	}
	@Test
	void testNegativeOffsetInput() {
		assertEquals("aa", caesarsCipher.cipher("bb", -1));
	}
	@Test
	void testCipheredMessageWithOffset12() {
		assertEquals("bcd",caesarsCipher.cipher("abc", 1));
	}
	@Test
	 void testEmptyInput() {
		 assertEquals("", caesarsCipher.cipher("", 5));
	 }
	@Test
	void testOffsetOfValue26() {
		assertEquals("hello world", caesarsCipher.cipher("hello world", 26));
	}
	@Test
	void testCaptialMessageInput() {
		assertEquals("Hello World", caesarsCipher.cipher("Hello World", 26));
	}

}
