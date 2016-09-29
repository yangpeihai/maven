package org.mavenChild1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	@Before
	public void before() {
		System.out.println("global");
	}

	@After
	public void after() {
		System.out.println("global destroy");
	}

	@Test
	public void test1() {
		System.out.println("--------------child1 test1----------------");
		Assert.assertEquals("1", "1");
	}

	@Test
	public void test2() {
		System.out.println("--------------child1 test2----------------");
		Assert.assertEquals("1", "1");
	}

	@Test
	public void test3() {
		System.out.println("--------------child1 test3----------------");
		Assert.assertEquals("1", "1");
	}

	@Test
	public void test4() {
		System.out.println("--------------child1 test4----------------");
		Assert.assertEquals("1", "1");
	}
}
