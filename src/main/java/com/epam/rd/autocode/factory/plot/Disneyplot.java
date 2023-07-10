package com.epam.rd.autocode.factory.plot;

public class Disneyplot implements Plot{

    private  Character hero;
    private  Character beloved;
    private  Character villain;
    private  String plot = "";

    public Disneyplot(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
    }

    @Override
    public String asText() {
        return hero.name()+" is young and adorable. "
                + hero.name()+" and "+beloved.name()+" love each other. "
                + villain.name()+" interferes with their happiness, but loses in the end.";
    }
}
