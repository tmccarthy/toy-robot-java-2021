package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;

import java.io.PrintStream;

public class ReportCommand implements Command {

    private final PrintStream printStream;

    public static ReportCommand writingTo(PrintStream printStream) {
        return new ReportCommand(printStream);
    }

    protected ReportCommand(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void runOn(Board board) {
        if (board.getRobot() != null) {
            Position position = board.getRobot().getPosition();
            CompassDirection direction = board.getRobot().getDirection();

            printStream.println(position.getX() + "," + position.getY() + "," + direction.toString());
        }
    }
}
