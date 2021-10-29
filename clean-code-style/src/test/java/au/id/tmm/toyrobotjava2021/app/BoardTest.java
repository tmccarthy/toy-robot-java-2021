package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void testIsOnBoard() {
        assertTrue(Board.create(5, 5, null).isOnBoard(Position.create(1, 1)));
    }

    @Test
    void testIsOffNorthEdge() {
        assertFalse(Board.create(5, 5, null).isOnBoard(Position.create(1, 5)));
    }

    @Test
    void testIsOffEastEdge() {
        assertFalse(Board.create(5, 5, null).isOnBoard(Position.create(5, 1)));
    }

    @Test
    void testIsOffWestEdge() {
        assertFalse(Board.create(5, 5, null).isOnBoard(Position.create(-1, 1)));
    }


}