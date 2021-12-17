package com.grafica;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.badlogic.gdx.Input.Keys.*;

public class qlebra {

    private Texture snake;
    private int x, y;

    public qlebra(int x, int y) {
        this.x = x;
        this.y = y;
        snake = new Texture("head_up.png");
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveW(qlebra entidad) {
        int pos = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.W)) {
            pos = entidad.getY();
            pos += 2;
            entidad.setY(pos);
        }
    }
    public void moveA(qlebra entidad) {
        int pos = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.A)) {
            pos = entidad.getX();
            pos -= 2;
            entidad.setX(pos);
        }
    }
    public void moveS(qlebra entidad) {
        int pos = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.S)) {
            pos = entidad.getY();
            pos -= 2;
            entidad.setY(pos);
        }
    }
    public void moveD(qlebra entidad) {
        int pos = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.D)) {
            pos = entidad.getX();
            pos += 2;
            entidad.setX(pos);
        }
    }

    public void renderizar(final SpriteBatch batch) {
        batch.draw(snake, x, y);
    }

}
