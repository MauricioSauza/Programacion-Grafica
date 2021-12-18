package Entidad;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

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

    public void renderizar(final SpriteBatch batch) {
        batch.draw(snake, x, y);
    }

}
