import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest_simple {

	ScoreBoard  T;
	
	@Before
	public void setUp() throws Exception {
		T = new ScoreBoard(5);
	}
	
	/* test one game entry, test the size and the entry at index 0*/
	@Test
	public void testadd1() {
		T.add(new GameEntry("Bob", 10));
		
		assertEquals("Bob", T.get(0).getName());
		assertEquals(10, T.get(0).getScore());	
		assertEquals(1, T.getNum());
	}
	
	/* test adding two scores, the second is high*/
	@Test
	public void testadd2() {
		//TODO:
		T.add(new GameEntry("Joe", 10));
		T.add(new GameEntry("Tim", 30));
		
		assertEquals("Joe", T.get(0).getName());
		assertEquals(10, T.get(0).getScore());
		assertEquals("Tim", T.get(1).getName());
		assertEquals(30, T.get(1).getScore());
		assertEquals(2, T.getNum());

	}

	/* test adding two scores, the second is lower*/
	@Test
	public void testadd3() {
		//TODO:
		T.add(new GameEntry("Jane", 50));
		T.add(new GameEntry("Robert", 10));
		
		assertEquals("Jane", T.get(0).getName());
		assertEquals(50, T.get(0).getScore());
		assertEquals("Robert", T.get(1).getName());
		assertEquals(10, T.get(1).getScore());
		assertEquals(2, T.getNum());
	}

}
