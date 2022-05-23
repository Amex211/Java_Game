package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Timer;
import com.mygdx.game.MenuScreen;


public class MyGdxGame extends Game implements InputProcessor {
	static SpriteBatch batch;
	static Texture img,img2;
	static int frame = 0;
	static int skip = 0;
	static int tempzeile;
	static Sprite sprite;
	static TextureRegion[][] regions;


	@Override
	public void create () {
		setScreen(new MenuScreen());


	}

   /*@Override
   public void render () {
      Gdx.gl.glClearColor(1,1,1,1);
      Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
      float xPos = Gdx.input.getX();
      if (Gdx.input.isTouched()&&xPos<850) {
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
      batch.end();

   }
*/

	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
	}

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
      /*Gdx.app.log("Touchpoint", String.valueOf(screenX) +" "+ String.valueOf(screenY));
      if(screenX<850){

   sprite.translateX(-20f);
   if (!sprite.isFlipX())
      sprite.flip(true, false);
}

      if(screenX>850){
         sprite.translateX(20f);

      }
*/
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}


}