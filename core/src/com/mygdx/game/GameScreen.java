package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.Timer;
import com.mygdx.game.MyGdxGame;

public class GameScreen implements Screen {
    SpriteBatch batch;
    Texture img;
    int frame = 0;
    int skip = 0;
    int tempzeile;
    Sprite sprite;
    TextureRegion[][] regions;
    int animationState = 0; //animation = 0 --> IDLE animation = 1 -->RUN

    @Override
    public void show() {
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch = new SpriteBatch();
        //img = new Texture("run.png");

        if(animationState == 0) {
            img = new Texture("Idle Sprite.png");
            regions = TextureRegion.split(img, 614, 564);
            //regions = TextureRegion.split(img, 620, 570);
            sprite = new Sprite(regions[0][0]);
            sprite.scale(-0.25f);
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {

                    frame++;//Zeilen
                    if (frame == 3) {
                        frame = 0;
                        tempzeile++;

                        if (tempzeile == 5) {

                            tempzeile = 0;

                        }
                    }
                    sprite.setRegion(regions[tempzeile][frame]);
                }
            }, 0, 1 / 15f);
        }
        /*if(animationState == 1){
            img = new Texture("run.png");
            regions = TextureRegion.split(img, 614, 564);
            //regions = TextureRegion.split(img, 620, 570);
            sprite = new Sprite(regions[0][0]);
            sprite.scale(-0.25f);
            Timer.schedule(new Timer.Task() {
                @Override
                public void run() {

                    frame++;//Zeilen
                    if (frame == 1) {
                        frame = 0;
                        tempzeile++;

                        if (tempzeile == 1) {

                            tempzeile = 0;

                        }
                    }
                    sprite.setRegion(regions[tempzeile][frame]);
                }
            }, 0, 1 / 15f);
        }
*/

    }

    @Override
    public void render(float delta) {
        animationState = 1;
        float xPos = Gdx.input.getX();
        if (Gdx.input.isTouched()&&xPos<850) {

            show();

            sprite.translateX(-10f);
            if (!sprite.isFlipX()){
                sprite.flip(true, false);
            }
        }
        if (Gdx.input.isTouched()&&xPos>850) {

            sprite.translateX(10f);
        }

        batch.begin();
        sprite.draw(batch);
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.end();

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
        //batch.dispose();
        //img.dispose();
    }
}