package au.id.tmm.toyrobotjava2021.app.geometry;

import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassDirectionTest {

    @Test
    void translateNorth() {
        Position position = Position.create(1, 2);

        Position translated = CompassDirection.NORTH.translate(position);

        Position expected = Position.create(1, 3);

        assertEquals(expected, translated);
    }

    @Test
    void translateSouth() {
        Position position = Position.create(1, 2);

        Position translated = CompassDirection.SOUTH.translate(position);

        Position expected = Position.create(1, 1);

        assertEquals(expected, translated);
    }

    @Test
    void translateEast() {
        Position position = Position.create(1, 2);

        Position translated = CompassDirection.EAST.translate(position);

        Position expected = Position.create(2, 2);

        assertEquals(expected, translated);
    }

    @Test
    void translateWest() {
        Position position = Position.create(1, 2);

        Position translated = CompassDirection.WEST.translate(position);

        Position expected = Position.create(0, 2);

        assertEquals(expected, translated);
    }

    @Test
    void rotateNorthLeft() {
        assertEquals(CompassDirection.WEST, CompassDirection.NORTH.left());
    }

    @Test
    void rotateSouthLeft() {
        assertEquals(CompassDirection.EAST, CompassDirection.SOUTH.left());
    }

    @Test
    void rotateEastLeft() {
        assertEquals(CompassDirection.NORTH, CompassDirection.EAST.left());
    }

    @Test
    void rotateWestLeft() {
        assertEquals(CompassDirection.SOUTH, CompassDirection.WEST.left());
    }

    @Test
    void rotateNorthRight() {
        assertEquals(CompassDirection.EAST, CompassDirection.NORTH.right());
    }

    @Test
    void rotateSouthRight() {
        assertEquals(CompassDirection.WEST, CompassDirection.SOUTH.right());
    }

    @Test
    void rotateEastRight() {
        assertEquals(CompassDirection.SOUTH, CompassDirection.EAST.right());
    }

    @Test
    void rotateWestRight() {
        assertEquals(CompassDirection.NORTH, CompassDirection.WEST.right());
    }



}