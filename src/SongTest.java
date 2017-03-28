import static org.junit.Assert.*;

import org.junit.Test;

public class SongTest {

	@Test
	public void test() {

		Song newSong = new Song("Name", "Album", "Artist","Art Desc", "Alb Desc", "Genre", 0, "Path");
		assertEquals("Name", newSong.getName());
		assertEquals("Album", newSong.getAlbum());
		assertEquals("Artist", newSong.getArtist());
		assertEquals("Art Desc", newSong.getArtDesc());
		assertEquals("Alb Desc", newSong.getAlDesc());
		assertEquals("Genre", newSong.getGenre());
		assertEquals(0, newSong.getID());
		assertEquals("Path", newSong.getPath());

	}

}

