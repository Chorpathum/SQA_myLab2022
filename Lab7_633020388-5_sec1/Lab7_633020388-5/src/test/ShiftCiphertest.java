package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ShiftCipher;

class ShiftCiphertest {
	
	ShiftCipher shif = new ShiftCipher();

	@Test
	void test1() {
		String result = shif.shift("ABC", 3);
		assertEquals("DEF",result);
	}
	@Test
	void test2() {
		String result = shif.shift("XYZ", 3);
		assertEquals("ABC",result);
	}
	@Test
	void test3() {
		String result = shif.shift("abc", 3);
		assertEquals("invalid",result);
	}
	@Test
	void test4() {
		String result = shif.shift("?", 3);
		assertEquals("invalid",result);
	}
	@Test
	void test5() {
		String result = shif.shift("ABC", -3);
		assertEquals("XYZ",result);
	}

}
