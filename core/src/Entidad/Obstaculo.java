package Entidad;

import com.badlogic.gdx.graphics.Texture;

public class Obstaculo {

    private Texture obstaculo;
    private int x, y;

    public Obstaculo(int x, int y) {
        this.x = this.x;
        this.y = this.y;
        obstaculo = new Texture("Metal1.png");
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
}
