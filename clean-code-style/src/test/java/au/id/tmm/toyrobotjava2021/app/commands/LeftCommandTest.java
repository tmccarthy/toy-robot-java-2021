package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.Robot;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LeftCommandTest {

    @Test
    void testLeftNoRobot() {
        Board board = Board.create(5, 5, null);

        LeftCommand.INSTANCE.runOn(board);

        assertNull(board.getRobot());
    }

    @Test
    void testLeftWithRobot() {
        Board board = Board.create(5, 5, Robot.create(Position.create(1, 2), CompassDirection.NORTH));

        LeftCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(1, 2), CompassDirection.WEST), board.getRobot());
    }
}
