package com.grafica;

import Controles.Controls;
import Entidad.qlebra;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MainGame extends ApplicationAdapter {

	qlebra snake;
	Controls controller;

	private SpriteBatch batch;
	
	@Override
	public void create () {
		snake = new qlebra(0, 0);
		controller = new Controls();
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		int pos = 0;
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		Gdx.gl.glClearColor(0.0f, 0.5f, 0.0f, 1f);
		batch.begin();
		snake.renderizar(batch);
		controller.moveW(snake);
		controller.moveA(snake);
		controller.moveS(snake);
		controller.moveD(snake);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
