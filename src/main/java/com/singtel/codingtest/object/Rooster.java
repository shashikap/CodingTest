package com.singtel.codingtest.object;

import com.singtel.codingtest.translater.SoundTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rooster extends Chicken {

    @Autowired
    SoundTranslator soundTranslator;

    public String sound() {
        return "Cock-a-doodle-doo";
    }

    public String sound(String language) {
        return soundTranslator.translate("Rooster", language);
    }
}