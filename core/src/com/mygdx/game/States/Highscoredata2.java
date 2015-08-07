package com.mygdx.game.states;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonValue;

/**
 * Created by welser on 06.08.2015.
 */
public class Highscoredata2 implements Json.Serializable {

    public String points;
    public String name;

    @Override
    public void write(Json json) {
        //test

    }

    @Override
    public void read(Json json, JsonValue jsonData) {

    }
}
