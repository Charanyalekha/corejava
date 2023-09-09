package testex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class BuildLifeCycleEx {

		@BeforeClass
		public static void beforeAll() { 
		System.out.println("Connect to the database");
		}
		@Before
		public void beforeEach() { 
		System.out.println("Load the schema");
		}
		@After
		public void afterEach() { 
		System.out.println("Drop the schema");
		}
		@AfterClass
		public static void afterAll() {
		System.out.println("Disconnect from the database");
		}
		@Test
		@DisplayName("Executing test one")
		public void testOne() { 
		System.out.println("Test One");
		}
		@Test
		@DisplayName("Executing test two")
		public void testTwo() { 
		System.out.println("Test Two");
		}

	

}
