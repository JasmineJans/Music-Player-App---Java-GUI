import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class PlaylistTest {

	@Test
	public void test() {
		Song newSong = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 1, "Path");
		Song newSong2 = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 2, "Path");
		Playlist playlist = new Playlist("New Playlist", 1, 1);
		
		playlist.addSong(newSong2.getID());
		
		Object[] check = {1, 2};
		assertArrayEquals(playlist.getList().toArray(), check);
		
		assertEquals(playlist.getName(), "New Playlist");
		assertEquals(playlist.getID(), 1);
		
		playlist.removeSong(newSong.getID());
		
		Object[] check1 = {2};
		assertArrayEquals(playlist.getList().toArray(), check1);
		
		playlist.removeAt(0);
		
		Object[] check2 = {};
		assertArrayEquals(playlist.getList().toArray(), check2);
		
	}

}
