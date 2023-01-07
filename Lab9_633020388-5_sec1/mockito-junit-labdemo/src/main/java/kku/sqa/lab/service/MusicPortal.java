package kku.sqa.lab.service;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MusicService;
//633020388-5 sec1
public class MusicPortal implements MusicService {

	public List<String> getMusic(String Fmusic) {
		
		return Arrays.asList("Harder Better Faster Stronger, Don't Stop Believin', Shut Up and Dance, The Pretender, Sandstorm"
							,"Deep Down, Where are you Now, One Kiss, Living Without You"
							,"Black Summer, Emo Girl, SUPERMODEL, She Knows It");
	}

}
