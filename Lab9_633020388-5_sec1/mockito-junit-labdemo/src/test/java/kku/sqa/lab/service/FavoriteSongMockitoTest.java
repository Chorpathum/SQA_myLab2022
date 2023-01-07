package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MusicService;

class FavoriteSongMockitoTest {

	@Test
	void testUsingMockito() {
		MusicService musicservice = mock(MusicService.class);
		List<String> musiclist = Arrays.asList("Black Summer, Emo Girl, SUPERMODEL, She Knows It");
		when(musicservice.getMusic("rock")).thenReturn(musiclist);
		FavoriteSong favoritesong = new FavoriteSong (musicservice);
		List<String> favoriteList = favoritesong.getFavoriteSong("rock");
		assertEquals("Black Summer, Emo Girl, SUPERMODEL, She Knows It",favoriteList.get(0));		
	}
}