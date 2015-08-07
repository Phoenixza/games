package com.mygdx.game.states;

/**
 * Created by welser on 05.08.2015.
 */
public class PlayerScore {

    String name;
    double points;

    public PlayerScore(double v, String user) {
        this.name = user;

        this.points = v;
    }


    public void PlayScore( double points, String name){
        this.name = name;
        this.points = points;
    }
}
