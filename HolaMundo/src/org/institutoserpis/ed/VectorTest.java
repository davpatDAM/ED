package org.institutoserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VectorTest {

	@Test
	void indexOf() {
		int [] v = new int[] {16, 12, 15, 14, 17};
		assertEquals(0, Vector.indexOf(v,16));
		assertEquals(2, Vector.indexOf(v,15));
		assertEquals(4, Vector.indexOf(v,17));
		assertEquals(-1, Vector.indexOf(v,33));
	}
	@Test
	void index0fEmpty() {
		int [] v = new int[] {};
		assertEquals(-1, Vector.indexOf(v,22));
		assertEquals(-1, Vector.indexOf(v,10));
		assertEquals(6, Vector.indexOf(v,13));
		assertEquals(-3, Vector.indexOf(v,5));
		assertEquals(9, Vector.indexOf(v,7));
		assertEquals(11, Vector.indexOf(v,20));
	}
	@Test
	void min() {
			assertEquals(12, Vector.menor(new int[] {16, 12, 15, 14, 17}));
			//assertEquals(9, min(new int[] {9, 12, 15, 14, 17}));
	}
	@Test
	void sort() {
		int[]v = new int[]{12};
		Vector .sort(v);
		assertArrayEquals(new int[] {12}, v);
		v = new int[]{15, 12};
		Vector .sort(v);
		assertArrayEquals(new int[] {15, 12}, v);
		v = new int[]{17, 15, 12};
		Vector .sort(v);
		assertArrayEquals(new int[] {17, 15, 12}, v);
		v = new int[]{16, 17, 15, 12};
		Vector .sort(v);
		assertArrayEquals(new int[] {16, 17, 15, 12}, v);
		v = new int[]{16, 17, 15, 12};
		Vector .sort(v);
		assertArrayEquals(new int[] {13, 16, 17, 15, 12}, v);
		v = new int[]{13, 16, 17, 15, 12};
		Vector .sort(v);
		assertArrayEquals(new int[] {13, 16, 17, 15, 12}, v);
	}
	

	@Test
	void indexOfMinwithInitialialIndex() {
		int [] v = new int[] {16, 12, 15, 14, 17}, 0;
		int [] v = new int[] {16, 12, 15, 14, 17}, 0;
}