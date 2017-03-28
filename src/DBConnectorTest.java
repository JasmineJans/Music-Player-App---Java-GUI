import static org.junit.Assert.*;

import org.junit.Test;

public class DBConnectorTest {

	@Test
	public void test() {
		DBConnector db = new DBConnector();
		
		db.removeSong(10);
		assertEquals(db.addSong("Song", "artist", "album", "artDesc", "albDesc", "path", "genre"), 10);
		
		assertEquals(db.getAlbumDesc("Sail"), "popular song from album");
		assertEquals(db.getArtistDesc("AWOLNATION"), "Electronic group");
		
		assertEquals(db.addPlaylist("name", 1), 3);
		
		assertEquals(db.addToPlaylist(3, 4), true);
		
		//removes and allows to run over and over with same values, so remove works
		db.removeFromPlaylist(3, 4);
		db.removePlaylist(3);
		
		db.getAllSongs();

	}

}
