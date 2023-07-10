package com.epam.rd.autocode.factory.plot;

public class DisneyMultFactory implements PlotFactory{
    private Character hero;
    private EpicCrisis epicCrisis;
    private Character funnyFriend;

    public DisneyMultFactory(Character hero, EpicCrisis epicCrisis, Character funnyFriend) {
        this.hero = hero;
        this.epicCrisis = epicCrisis;
        this.funnyFriend = funnyFriend;
    }

    @Override
    public Plot plot() {
        return new DisneyMultPlot(this.hero, this.epicCrisis, this.funnyFriend);
    }
}
