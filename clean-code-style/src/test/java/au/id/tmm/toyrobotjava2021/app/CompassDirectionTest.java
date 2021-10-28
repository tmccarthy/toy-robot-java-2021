package au.id.tmm.toyrobotjava2021.app;

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


}