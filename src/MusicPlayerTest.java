import static org.junit.Assert.*;

import org.junit.Test;

public class MusicPlayerTest {

	@Test
	public void test() {
		MusicPlayer player = new MusicPlayer();
		player.play("/Users/jasminejans/Desktop/01_into_The_Ocean.wav");
		player.restart();
		assertEquals(player.isPlaying(), false);
		player.pause();
		assertEquals(player.isPlaying(), false);
		player.stop();
		assertEquals(player.isPlaying(), false);
		
		//still working to get true to return, no accidental exceptions thrown
		player.play();
		assertEquals(player.isPlaying(), true);
	}
}
