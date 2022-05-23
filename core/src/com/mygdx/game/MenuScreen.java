package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.MyGdxGame;

public class MenuScreen implements Screen {

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(0, 1, 0, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //BeispielMain MenüSchrift Bitte verbessern
        BitmapFont font = new BitmapFont();
        font.setColor(Color.RED);
        font.getData().setScale(5, 5);
        SpriteBatch batch = new SpriteBatch();
        batch.begin();
        font.draw(batch, "Press to Start", 650, 530);
        batch.end();


        //Hier wird das Spiel aufgerufen
        if(Gdx.input.isTouched()){
            ((Game)Gdx.app.getApplicationListener()).setScreen(new com.mygdx.game.GameScreen());
        }


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }


}