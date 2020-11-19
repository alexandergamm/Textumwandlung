package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

	@Test
	public void testQueue() {
		Queue schlange = new Queue(3);
		schlange.enqueue(1);
		schlange.enqueue(2);
		schlange.enqueue(3);
		schlange.enqueue(4);
		
		assertEquals(1, schlange.dequeue());
		assertEquals(2, schlange.dequeue());
		assertEquals(4, schlange.dequeue());
	}
	
	@Test
	public void testUngültgeGrößenangabe() {
		try {
			Queue schlangeNegativ = new Queue(-1);
			Queue schlangeLeer = new Queue(0);
			
			fail("Ausnahme für Initialisierung mit ungültiger Größenangabe nicht geworfen!");
		} catch(IllegalArgumentException e) {
		
		}
	}
	
	@Test
	public void testEntnahmeLeereSchlange() {
		Queue schlange = new Queue(2);
		try {
			schlange.dequeue();
			fail("Ausnahme für Entnahme eines Elements aus einer leeren Schlange nicht geworfen!");
		} catch(IllegalStateException e) {
		
		}
	}
	
	
}