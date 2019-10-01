package com.springify.service;

import com.springify.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import com.springify.repositories.SongRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public Song createSongs (Song song){
        return songRepository.save(song);
    }


    @Override
    public Iterable<Song> listSongs(){
        return songRepository.findAll();
    }

}

