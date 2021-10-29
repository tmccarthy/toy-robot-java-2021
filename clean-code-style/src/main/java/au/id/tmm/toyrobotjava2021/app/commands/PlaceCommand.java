package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;

import java.util.Objects;

public class PlaceCommand implements Command {

    private final Position position;
    private final CompassDirection direction;

    public static PlaceCommand create(Position position, CompassDirection direction) {
        return new PlaceCommand(position, direction);
    }

    protected PlaceCommand(Position position, CompassDirection direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public void runOn(Board board) {
        // TODO unimplemented
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceCommand that = (PlaceCommand) o;
        return position.equals(that.position) && direction == that.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, direction);
    }

    @Override
    public String toString() {
        return "PlaceCommand{" +
                "position=" + position +
                ", direction=" + direction +
                '}';
    }
}
