import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest_Fullboard {
	ScoreBoard  T= new ScoreBoard(5);
	
	@Before
	public void setUp() throws Exception {
		T.add(new GameEntry("Bob", 10));
		T.add(new GameEntry("Bob", 8));
		T.add(new GameEntry("Bob", 6));
		T.add(new GameEntry("Bob", 4));
		T.add(new GameEntry("Bob", 2));
	}

	/* insert a lowest score */
	@Test
	public void test1() {
		//TODO:
		T.add(new GameEntry("Tyler", 1));
		
		assertEquals("Bob", T.get(4).getName());
		assertEquals(2, T.get(4).getScore());
		assertEquals(5, T.getNum());
		
	}

	/* insert a non lowest score */
	@Test
	public void test2() {
		T.add(new GameEntry("James", 7));
		
		assertEquals("James", T.get(2).getName());
		assertEquals(7, T.get(2).getScore());
		assertEquals(5, T.getNum());
		
		
	}
	
	@Test
	public void test3() {
		T.add(new GameEntry("A", 9));
		
		assertEquals("A", T.get(1).getName());
		assertEquals(9, T.get(1).getScore());
		assertEquals(5, T.getNum());
	}
}
