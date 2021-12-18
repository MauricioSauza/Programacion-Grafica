package Controles;


import Entidad.*;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Controls {

    //qlebra entidad;

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
}
