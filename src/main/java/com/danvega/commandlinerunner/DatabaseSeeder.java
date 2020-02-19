package com.danvega.commandlinerunner;

import com.danvega.commandlinerunner.entities.Image;
import com.danvega.commandlinerunner.repository.ImageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseSeeder implements CommandLineRunner {

    private static final Logger LOGGER= LoggerFactory.getLogger(DatabaseSeeder.class);

    public ImageRepository imageRepository;

    public DatabaseSeeder(ImageRepository imageRepository){
        this.imageRepository=imageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Seeding DataBase... ");
        imageRepository.save(new Image("Image 1"));
        imageRepository.save(new Image("Image 2"));
        imageRepository.save(new Image("Image 3"));
        imageRepository.save(new Image("Image 4"));
        imageRepository.save(new Image("Image 5"));
        imageRepository.save(new Image("Image 6"));
        imageRepository.save(new Image("Image 7"));

    }
}
