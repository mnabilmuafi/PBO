import greenfoot.*;

public class Mobil2 extends Actor {
    public void act() {
        move(2); // Gerakkan mobil

        // Cek apakah mobil bertabrakan dengan mobil lain
        if (isTouching(Mobil1.class)) {
            // Jika bertabrakan, berbalik arah 180 derajat
            setRotation(getRotation() + 360);
        }

        // Cek apakah mobil mencapai tepi layar
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1 || getY() <= 0 || getY() >= getWorld().getHeight() - 1) {
            // Jika mencapai tepi, berbalik arah
            turn(360);
        }
    }
}
