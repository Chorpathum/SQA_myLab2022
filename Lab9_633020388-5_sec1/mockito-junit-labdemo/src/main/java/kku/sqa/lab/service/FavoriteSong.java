package kku.sqa.lab.service;

import java.util.ArrayList;
import java.util.List;

import kku.sqa.lab.api.MusicService;
//633020388-5 sec1
public class FavoriteSong {
	
	private MusicService MusicService;

	public FavoriteSong(MusicService musicservice) {
		super();
		this.MusicService = musicservice;
	}
	public List<String> getFavoriteSong(String music){
		List<String> MusicList = new ArrayList<String>();
		List<String> AllMusicList = MusicService.getMusic (music);
		for (String M:AllMusicList) {
			if (music == "running") {
				if (M.contains("Harder")) {
					MusicList.add(M);
				}
			}
			else if (music == "dance") {
				if (M.contains("Deep")) {
					MusicList.add(M);
				}
			}
			else if (music == "rock") {
				if (M.contains("Black")) {
					MusicList.add(M);
				}
			}
		}
			
			
		return MusicList;
	}

}
