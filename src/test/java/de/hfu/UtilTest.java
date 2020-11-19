package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilTest {

	@Test
	public void testUtil() {
	    assertEquals(true, Util.istErstesHalbjahr(1));
	    assertEquals(true, Util.istErstesHalbjahr(6));
	    
	    assertEquals(false, Util.istErstesHalbjahr(7));
	    assertEquals(false, Util.istErstesHalbjahr(12));
	}
	
	@Test
	 public void testUngültigerMonat() {
		try {
			Util.istErstesHalbjahr(-1); //optional
			Util.istErstesHalbjahr(0); //Unterstreitung der unteren Grenze
			Util.istErstesHalbjahr(13); //Überschreitung der oberen Grenze
			
			fail("Ausnahme für ungültige Monatsangabe nicht geworfen");
	    } catch(IllegalArgumentException e) {
	    	
	    }
	}

}