import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScoreBoardTest_Afewitems {

	ScoreBoard  T=new ScoreBoard(5);
	
	@Before
	public void setUp() throws Exception {
		T = new ScoreBoard(5);
		T.add(new GameEntry("Bob", 10));
		T.add(new GameEntry("Bob", 8));
		T.add(new GameEntry("Bob", 6));
		T.add(new GameEntry("Bob", 4));
	}
	
	
	@Test
	public void testsetup() {
		int[] expected= {10,8,6,4};
		for (int i=0;i<4;i++) {
			assertEquals(expected[i], T.get(i).getScore());
		}
		assertEquals(4, T.getNum());
	}
	
	
	/* insert a highest score*/
	@Test
	public void testadd2() {
		//TODO:
		T.add(new GameEntry("Joe", 20));
		
		assertEquals("Joe", T.get(0).getName());
		assertEquals(20, T.get(0).getScore());
		assertEquals(5, T.getNum());
	}

	/* insert a lowest score*/
	@Test
	public void testadd3() {
		//TODO:
		T.add(new GameEntry("Carson", 3));
		
		assertEquals("Carson", T.get(4).getName());
		assertEquals(3, T.get(4).getScore());
		assertEquals(5, T.getNum());
		
	}

	/* insert a middle score*/
	@Test
	public void testadd4() {
		//TODO:
		T.add(new GameEntry("Johnny", 7));
		
		assertEquals("Johnny", T.get(2).getName());
		assertEquals(7, T.get(2).getScore());
		assertEquals(5, T.getNum());
	}
	
	
}
