package com.epam.rd.autocode.factory.plot;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MarvelPlot implements Plot{
    private Character[] heroes;
    private EpicCrisis epicCrisis;
    private Character villain;
    private String lastCharacter = "";


    public MarvelPlot(Character[] heroes, EpicCrisis epicCrisis, Character villain) {
        this.heroes = heroes;
        this.epicCrisis = epicCrisis;
        this.villain = villain;
        if(heroes.length>1) {
            lastCharacter = " and the brave " + heroes[heroes.length - 1].name();
            this.heroes = Arrays.copyOfRange(heroes, 0, heroes.length - 1);
        }
    }
    private String getBraveCharacters() {

        return Arrays.stream(heroes)
                .map(character -> " the brave " + character.name()).collect(Collectors.joining(","));
    }
    @Override
    public String asText() {
        if(heroes.length == 1)
            return epicCrisis.name() + " threatens the world. But" +
                    getBraveCharacters() + " is on guard. So, no way that intrigues of " +
                    villain.name() + " will bend the willpower of the inflexible hero.";
        return epicCrisis.name() + " threatens the world. But" +
                getBraveCharacters() + lastCharacter + " are on guard. So, no way that intrigues of " +
                villain.name() + " will bend the willpower of inflexible heroes.";
    }
}

