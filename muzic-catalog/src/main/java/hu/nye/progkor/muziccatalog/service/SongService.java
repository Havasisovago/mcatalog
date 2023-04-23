package hu.nye.progkor.muziccatalog.service;

import java.util.List;

import hu.nye.progkor.muziccatalog.data.model.Song;

public interface SongService {
    /**
     *
     * @param song
     * @return
     */
        Song createSong(Song song);
    Song retrieveSongById(Long id);
        List<Song> retrieveAllSong();
    Song updateSong(Song song);
        void deleteSongById(Long id);

}
