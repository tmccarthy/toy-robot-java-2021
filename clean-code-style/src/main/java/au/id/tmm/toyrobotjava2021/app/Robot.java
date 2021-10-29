package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;

import java.util.Objects;

public class Robot {

    private Position position;
    private CompassDirection direction;

    public static Robot create(Position position, CompassDirection direction) {
        return new Robot(position, direction);
    }

    protected Robot(Position position, CompassDirection direction) {
        this.position = position;
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public CompassDirection getDirection() {
        return direction;
    }

    public void setDirection(CompassDirection direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return getPosition().equals(robot.getPosition()) && getDirection() == robot.getDirection();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPosition(), getDirection());
    }

    @Override
    public String toString() {
        return "Robot{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
