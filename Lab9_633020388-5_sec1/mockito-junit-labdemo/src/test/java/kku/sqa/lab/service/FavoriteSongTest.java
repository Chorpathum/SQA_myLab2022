package kku.sqa.lab.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import kku.sqa.lab.api.MusicService;
import kku.sqa.lab.data.stub.MusicServiceStub;


class FavoriteSongTest {

	@Test
	void test_getFavoriteSong_withStub() {
		MusicService musicservice = new MusicServiceStub();
		FavoriteSong favoritesong = new FavoriteSong(musicservice);
		
		List<String> musiclist = favoritesong.getFavoriteSong("rock");
		
		assertEquals("Black Summer, Emo Girl, SUPERMODEL, She Knows It", musiclist.get(0));
	}

}
