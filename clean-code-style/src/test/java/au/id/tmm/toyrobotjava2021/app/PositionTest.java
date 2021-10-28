package au.id.tmm.toyrobotjava2021.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void createPosition() {
        Position position = Position.create(1, 2);

        assertEquals(1, position.getX());
        assertEquals(2, position.getY());
    }

}