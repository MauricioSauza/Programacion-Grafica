package Entidad;


import com.badlogic.gdx.graphics.Texture;

public class Cookie {
    private Texture cookie;
    private int x, y;

    public Cookie(int x, int y) {
        this.x = this.x;
        this.y = this.y;
        cookie = new Texture("apple.png");
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
