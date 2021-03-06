package com.springify.repositories;

import com.springify.models.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends CrudRepository <Song, String> {

    List<Object> findById(int songId);
}
