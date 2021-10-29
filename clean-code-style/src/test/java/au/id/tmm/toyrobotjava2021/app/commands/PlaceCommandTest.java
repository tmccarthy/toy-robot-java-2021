package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.Robot;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlaceCommandTest {

    @Test
    void testPlaceRobotOnTable() {
        Board board = Board.create(5, 5, null);

        PlaceCommand command = PlaceCommand.create(Position.create(1, 2), CompassDirection.NORTH);

        command.runOn(board);

        Assertions.assertEquals(Robot.create(Position.create(1, 2), CompassDirection.NORTH), board.getRobot());
    }

    @Test
    void testPlaceRobotOffTable() {
        Board board = Board.create(5, 5, null);

        PlaceCommand command = PlaceCommand.create(Position.create(5, 5), CompassDirection.NORTH);

        command.runOn(board);

        Assertions.assertNull(board.getRobot());
    }

    @Test
    void testRePlaceRobot() {
        Board board = Board.create(5, 5, Robot.create(Position.create(4, 4), CompassDirection.EAST));

        PlaceCommand command = PlaceCommand.create(Position.create(1, 2), CompassDirection.NORTH);

        command.runOn(board);

        Assertions.assertEquals(Robot.create(Position.create(1, 2), CompassDirection.NORTH), board.getRobot());
    }
}
