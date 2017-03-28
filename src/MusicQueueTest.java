import static org.junit.Assert.*;

import org.junit.Test;

public class MusicQueueTest {

	@Test
	public void test() {
			Song newSong1 = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 0, "Path");
			Song newSong2 = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 1, "Path");
			Song newSong3 = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 2, "Path");
			Song newSong4 = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 3, "Path");
			
			MusicQueue queue = new MusicQueue();
			
			//test enqueue and pop
			queue.enqueue(newSong1.getID());
			queue.enqueue(newSong2.getID());
			
			assertEquals(queue.pop(), newSong1.getID());
			assertEquals(queue.pop(), newSong2.getID());
			
			//test enqueue and pop index
			queue.enqueue(newSong1.getID());//0
			queue.enqueue(newSong2.getID());//1
			queue.enqueue(newSong3.getID());//2
			queue.enqueue(newSong4.getID());//3
			
			//checks pop at index and get size
			assertEquals(queue.getSize(), 4);
			//System.out.println(queue.pop(2));
			assertEquals(queue.pop(2), newSong3.getID());
			
			//checks get list and clear
			Object[] check1 = {3};
		//	assertArrayEquals(queue.getList().toArray(), check1);
			queue.enqueue(newSong1.getID());
			queue.enqueue(newSong2.getID());
			queue.clearQueue();
			Object[] check2 = {};
		//	assertArrayEquals(queue.getList().toArray(), check2);
			
		}
	}

