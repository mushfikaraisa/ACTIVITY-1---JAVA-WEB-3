package com.example.h2zoo;

import com.example.h2zoo.model.Bird;
import com.example.h2zoo.model.Fish;
import com.example.h2zoo.model.Reptile;
import com.example.h2zoo.repository.BirdRepository;
import com.example.h2zoo.repository.FishRepository;
import com.example.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(H2ZooApplication.class, args);

		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);
		Reptile kingCobra = new Reptile("Slither", "Snake", "Black and Yellow","Carnivore");
		Reptile komodoDragon = new Reptile("Dennis", "Lizard", "Brown","Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));

		FishRepository fishRepository =
				configurableApplicationContext.getBean(FishRepository.class);
		Fish tigerShark = new Fish("Tony", "Shark");
		Fish swordFish = new Fish("Ashley", "Marlin");
		fishRepository.saveAll(List.of(tigerShark, swordFish));

		BirdRepository birdRepository =
				configurableApplicationContext.getBean(BirdRepository.class);
		Bird hummingBird = new Bird("Buzz", "Bird");
		Bird Penguin = new Bird("Happyfeet", "Penguin");
		birdRepository.saveAll(List.of(hummingBird, Penguin));

	}

}
