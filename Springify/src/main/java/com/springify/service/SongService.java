package com.springify.service;

import com.springify.models.Song;

public interface SongService {

    public Song createSongs(Song song);

    public Iterable<Song> listSongs();
}
