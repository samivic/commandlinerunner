package com.danvega.commandlinerunner.repository;

import com.danvega.commandlinerunner.entities.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ImageRepository extends CrudRepository<Image, Integer> {
}
