import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 4;

    public Ball(int xPosition, int yPosition, int dim) {
        super(xPosition, yPosition,dim, dim);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if (randomXDirection == 0) randomXDirection--;
        setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2);
        if (randomYDirection == 0) randomYDirection--;
        setYDirection(randomYDirection * initialSpeed);
    }

    public void setXDirection(int xRandom) {
        xVelocity = xRandom;
    }

    public void setYDirection(int yRandom) {
        yVelocity = yRandom;
    }

    public void move() {
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}
