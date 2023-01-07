package kku.sqa.lab.data.stub;

import java.util.Arrays;
import java.util.List;

import kku.sqa.lab.api.MusicService;

public class MusicServiceStub implements MusicService{

	public List<String> getMusic(String Fmusic) {
		// TODO Auto-generated method stub
		return Arrays.asList("Black Summer, Emo Girl, SUPERMODEL, She Knows It");
	}

}
