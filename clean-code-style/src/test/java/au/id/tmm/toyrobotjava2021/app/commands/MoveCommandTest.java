package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.Robot;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MoveCommandTest {

    @Test
    void testMoveNoRobot() {
        Board board = Board.create(5, 5, null);

        MoveCommand.INSTANCE.runOn(board);

        assertNull(board.getRobot());
    }

    @Test
    void testNormalRobotMove() {
        Board board = Board.create(5, 5, Robot.create(Position.create(1, 2), CompassDirection.NORTH));

        MoveCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(1, 3), CompassDirection.NORTH), board.getRobot());
    }

    @Test
    void testAvoidsMoveOffNorthEdge() {
        Board board = Board.create(5, 5, Robot.create(Position.create(1, 4), CompassDirection.NORTH));

        MoveCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(1, 4), CompassDirection.NORTH), board.getRobot());
    }

    @Test
    void testAvoidsMoveOffSouthEdge() {
        Board board = Board.create(5, 5, Robot.create(Position.create(1, 0), CompassDirection.SOUTH));

        MoveCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(1, 0), CompassDirection.SOUTH), board.getRobot());
    }

    @Test
    void testAvoidsMoveOffEastEdge() {
        Board board = Board.create(5, 5, Robot.create(Position.create(4, 1), CompassDirection.EAST));

        MoveCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(4, 1), CompassDirection.EAST), board.getRobot());
    }

    @Test
    void testAvoidsMoveOffWestEdge() {
        Board board = Board.create(5, 5, Robot.create(Position.create(0, 1), CompassDirection.WEST));

        MoveCommand.INSTANCE.runOn(board);

        assertEquals(Robot.create(Position.create(0, 1), CompassDirection.WEST), board.getRobot());
    }

}
