package hashtable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashTableTest {
	@Test
	void test01Add() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
	}
	@Test
	void test02AddDuplicate() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Add(5));
	}
	@Test
	void test03AddCollision() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Add(3725));
	}
	@Test
	void test04SearchNotFound() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(25));
	}
	@Test
	void test05SearchFound() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
		assertTrue(ht.Search(5));
	}
	@Test
	void test06SearchNotFoundInEmptyBucket() {
		HashTable ht = new HashTable(10);
		assertTrue(ht.Add(5));
		assertFalse(ht.Search(7));
	}
}
