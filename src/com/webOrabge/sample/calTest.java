package com.webOrabge.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class calTest {

	@Test
	public void testMulti() {
		cal cal = new cal();
		assertEquals(6, cal.multi(2,3));
	}

	@Test
	public void testAdd() {
		cal cal = new cal();
		assertEquals(9, cal.add(2,3));
	}
}
