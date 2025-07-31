package com.demo.labs.lab3;

public class SpecialMovie extends Movie {
    private String soundEffectsTechnology;
    private String visualEffectsTechnology;

    public SpecialMovie(String movieName, String producedBy, String soundEffectsTechnology, String visualEffectsTechnology) {
        super(movieName, producedBy);
        this.soundEffectsTechnology = soundEffectsTechnology;
        this.visualEffectsTechnology = visualEffectsTechnology;
    }

    public String showSpecialDetails() {
        return showDetails() +
                "Sound Effects: " + soundEffectsTechnology + "\n" +
                "Visual Effects: " + visualEffectsTechnology + "\n";
    }
}
