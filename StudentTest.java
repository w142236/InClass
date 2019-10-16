import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	private static final int INITIAL_RATING = 5;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testStudent() {
		try {
			Student s = new Student();

			Integer rating = s.getRating();
			Integer expected = INITIAL_RATING;

			assertEquals(expected, rating);
		} catch (NameException e) {
			fail();
		}
	}

	@Test
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "Y", 2);
		Student secondStudent = new Student("x", "Y", 3);
		//Do we need more students?
		Student student = new Student("A", "A", 5);
		Student empty = new Student("Z","", 3);
		
		LastFirstName clfn = new LastFirstName();
		
		clfn.compare(firstStudent, secondStudent);
		int actual = secondStudent.compareTo(firstStudent);
		//Should be bigger than zero
		boolean result = false;
		if (actual > 0) 
			result = true;
		assertTrue(result);
		
		
		int expected = 1;
		
		Student student = new Student("x", "Y", 5);
		result = false;
		
		expected = -1;
		actual = secondStudent.compareTo(student);
		if (actual < 0)
			result = true;
		assertTrue(true);
		
		//Should be the same, therefore should be 0
		result = false;
		//Have to check for zero. So let's create this
		Student studentSame = new Student("x" ,"y" , 5);
		actual = secondStudent.compareTo(studentSame);
		
		

	}
	
	@Test
	public void testGet() throws NameException {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
	}

}
