import static org.junit.Assert.*;

import org.junit.Test;

public class MusicTest {

	@Test
	public void test() {
		Music music = new Music();
		music.getAllSongs();
		Song song = new Song("It Ain't Me Babe", "Another Side of Bob Dylan", "Bob Dylan", "Hit artist in the 1960s", "a good album", "Folk", 1, "Music");
		assertEquals(music.getSong(0).getArtist(), song.getArtist());
		
		assertEquals(music.getSongInfo(1).getArtist(), song.getArtist());
		
		assertEquals(music.getQueueSong(0), null);
		
		assertEquals(music.checkArtistDesc("Bob Dylan"), "Hit artist in the 1960s");
		
		assertEquals(music.checkAlbumDesc("Another Side of Bob Dylan"), "a good album");
		
		//Add song still in progress
		//music.addSong("Song", "artist", "album", "artDesc", "albDesc", "path", "genre");
		
		/*Only works on allens computer, because path to song to play is there
		music.playSong(0);
		assertEquals(music.getQueueSong(0).getArtist(), song.getArtist());
		*/
		
		assertEquals(music.getPlaylist(0).getName(), "Rock");
		assertEquals(music.getPlaylist(1).getName(), "My Playlist");
		
		
		String[] test = {"Rock", "My Playlist"};
		assertArrayEquals(music.getPlaylistNames().toArray(), test); //string
		
		assertEquals(music.viewSongInPlaylist(0,  0).getArtist(), "Bob Dylan");
		
		assertEquals(music.addToQueue(1), true);
		
		Object[] test1 = {1};
		assertArrayEquals(music.makePlaylist("Playlist", 1).getList().toArray(), test1);
		
		assertEquals(music.addToPlaylist(2, 2), true);
		
		assertEquals(music.playlistExists(2), true);
		
		assertEquals(music.deletePlaylist(2), true);
		
	}

}
