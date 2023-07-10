package com.epam.rd.autocode.factory.plot;

public class DisneyFactory implements PlotFactory{
    private Character hero;
    private Character beloved;
    private Character villain;

    public DisneyFactory(Character hero, Character beloved, Character villain) {
        this.hero = hero;
        this.beloved = beloved;
        this.villain = villain;
    }
    @Override
    public Plot plot() {
        return new Disneyplot(this.hero, this.beloved, this.villain);
    }
    public Character getHero() {
        return hero;
    }

    public Character getBeloved() {
        return beloved;
    }

    public Character getVillain() {
        return villain;
    }
}
