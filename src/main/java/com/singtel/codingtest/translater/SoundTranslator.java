package com.singtel.codingtest.translater;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class SoundTranslator {

    //This is the Grammer definition it will comes as Animal, Language as query parameter
    //Based on the animal and the language sound can be translated
    private static Map<String, Map<String, String>> soundGrammer = new HashMap<>();

    /**
     * This API will add language and its respective sound in the MAP
     */
    @PostConstruct
    private void addLanguages() {

        Map<String, String> rousterLaunageSound = new HashMap<String, String>();

        rousterLaunageSound.put("Danish", "kykyliky");
        rousterLaunageSound.put("Dutch", "kukeleku");
        rousterLaunageSound.put("Finnish", "kukko kiekuu");
        rousterLaunageSound.put("French", "cocorico");
        rousterLaunageSound.put("German", "kikeriki");
        rousterLaunageSound.put("Greek", "kikiriki");
        rousterLaunageSound.put("Hebrew", "coo-koo-ri-koo");
        rousterLaunageSound.put("Hungarian", "kukuriku");
        rousterLaunageSound.put("Italian", "chicchirichi");
        rousterLaunageSound.put("Japanese", "ko-ke-kok-ko-o");
        rousterLaunageSound.put("Portuguese", "cucurucu");
        rousterLaunageSound.put("Russian", "kukareku");
        rousterLaunageSound.put("Swedish", "kuckeliku");
        rousterLaunageSound.put("Turkish", "kuk-kurri-kuuu");
        rousterLaunageSound.put("Urdu", "kuklooku");

        soundGrammer.put("Rooster", rousterLaunageSound);
    }

    public String translate(String animal, String language) {

        String sound = getLanguagesForAnimal(animal).get(language);
        return ((sound == null) ? ("No Sound Available for " + language) : sound);

    }

    /**
     * This API will query the main grammer map and will return the animal's language grammer
     *
     * @param animal
     * @return
     */
    private Map<String, String> getLanguagesForAnimal(String animal) {

        return soundGrammer.get(animal);
    }
}