package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.Robot;
import au.id.tmm.toyrobotjava2021.app.TestablePrintStreamTest;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReportCommandTest extends TestablePrintStreamTest {

    private final ReportCommand commandUnderTest = new ReportCommand(printStream);

    @Test
    void testReportNoRobot() {
        Board board = Board.create(5, 5, null);

        commandUnderTest.runOn(board);

        assertEquals("", readPrintStream());
    }

    @Test
    void testReportWithRobot() {
        Board board = Board.create(5, 5, Robot.create(Position.create(1, 2), CompassDirection.NORTH));

        commandUnderTest.runOn(board);

        assertEquals("1,2,NORTH" + System.lineSeparator(), readPrintStream());
    }
}
