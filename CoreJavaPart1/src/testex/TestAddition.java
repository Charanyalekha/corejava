package testex;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class TestAddition {
	public int add(int a,int b) {
		return a+b;
	}

	
	public String evenOrOdd(int n) {
		if(n%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	public boolean compareArray(int arr1[],int arr2[]) {
		boolean bool=false;
		if(Arrays.equals(arr1, arr2)) {
			bool=true;
		}
		return bool;
	}
	
	public static void main(String[] args) {
		TestAddition t=new TestAddition();
		t.add(3, 5);
		System.out.println(t.evenOrOdd(4));
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		t.compareArray(arr1, arr2);

	}
	TestAddition t;
	@Before
	public void init() {
		t=new TestAddition();
	}
	@Test(timeout=1000)
	@DisplayName("Add test Method")
	public void addTest() {
		//TestAddition t=new TestAddition();
		//creating multiple testcases....
		assertAll(
				()->assertEquals(8, t.add(3, 5)),
				()->assertEquals(5, t.add(2, 3)),
				()->assertEquals(9, t.add(7, 2))			
				);
	}
	@Test(timeout=100)
	public void checkTest() {
		//TestAddition t=new TestAddition();
		assertSame("evenOrodd", "even", t.evenOrOdd(4));
	}
	@Test
	public void checkArray() {
		Assert.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
		
	}
	@Test
	public void arrayTest() {
		//TestAddition t=new TestAddition();
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		
		Assert.assertEquals(true,t.compareArray(arr1, arr2));
	}
	@Test
	public void arrayTest1() {
		//TestAddition t=new TestAddition();
		int arr1[]= {1,2,3};
		int arr2[]= {1,2,3};
		int arr3[]= {1,2,3,4};
		assertTrue(t.compareArray(arr1, arr2));
		assertFalse(t.compareArray(arr2, arr3));
		
	}
	@Test
	public void stringTest() {
		String str="";
		String str1=null;
		assertNotNull(str);
		assertNull(str1);
	}
	

}
