package com.grafica;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {

	qlebra snake;

	private SpriteBatch batch;
	
	@Override
	public void create () {
		snake = new qlebra(0, 0);
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		int pos = 0;
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.0f, 0.5f, 0.0f, 1f);
		batch.begin();
		snake.renderizar(batch);
		snake.moveW(snake);
		snake.moveA(snake);
		snake.moveS(snake);
		snake.moveD(snake);

		/*
		if(Gdx.input.isKeyPressed(Input.Keys.W)) {
			pos = snake.getY();
			pos += 2;
			snake.setY(pos);
		}
		if(Gdx.input.isKeyPressed((Input.Keys.D))) {
			pos = snake.getX();
			pos += 2;
			snake.setX(pos);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)) {
			pos = snake.getY();
			pos -= 2;
			snake.setY(pos);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)) {
			pos = snake.getX();
			pos -= 2;
			snake.setX(pos);
		}*/
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
