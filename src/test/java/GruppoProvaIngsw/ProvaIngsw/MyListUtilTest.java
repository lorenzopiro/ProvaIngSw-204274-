package GruppoProvaIngsw.ProvaIngsw;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.joda.time.JodaTimePermission;
import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class MyListUtilTest 
{
    /**
     * Rigorous Test :-)
     */
	
	MyListUtil c;
	ArrayList<Integer> list;
	
	@Before
	public void creaClasse()
	{
		c = new MyListUtil();
		list = new ArrayList<Integer>();
		list.add(8);
		list.add(6);
		list.add(7);
		list.add(1);
		
	}
	
	
    @Test
    public void shouldAnswerWithTrue()
    {
    	c.ordinaNumeri(list, true);
    	assertTrue(c.ordinaNumeri(list, true).get(0) < c.ordinaNumeri(list, true).get(list.size()-1) );
    }
    
    @Test
    public void shouldAnswerWithTrue2()
    {
    	c.ordinaNumeri(list, true);
    	assertTrue(c.ordinaNumeri(list, false).get(0) > c.ordinaNumeri(list, false).get(2) );
    }
}



























