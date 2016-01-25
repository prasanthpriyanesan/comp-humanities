package edu.asu.diging.tutorial.spring.service;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

@Service
public class MoodService implements IMoodService {
	
	private List<String> moods;
	private Random random;
	private List<String> explanations;
	
	@PostConstruct
	public void init() {
		moods = new ArrayList<String>();
		moods.add("happy");
		moods.add("sad");
		moods.add("bubbly");
		moods.add("frustrated");
		moods.add("scared");
		moods.add("excited");
		
		explanations = new ArrayList<String>();
		explanations.add("I am hungry.");
		explanations.add("there were no mice.");
		explanations.add("there were mice.");
		explanations.add("I am purring.");
		explanations.add("life is not a pony farm.");
		
		random = new Random(); 
	}

	public Mood getCurrentMood() {
		int randomInt = random.nextInt(moods.size());
		return new Mood(moods.get(randomInt));
    }

	public String getExplanation() {
		int randomInt = random.nextInt(explanations.size());
		return explanations.get(randomInt);
	}
}