package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.commands.Command;
import au.id.tmm.toyrobotjava2021.app.input.RawCommandInput;
import au.id.tmm.toyrobotjava2021.app.parsing.BadCommandException;
import au.id.tmm.toyrobotjava2021.app.parsing.CombinedCommandParser;
import au.id.tmm.toyrobotjava2021.app.parsing.LeftCommandParser;
import au.id.tmm.toyrobotjava2021.app.parsing.MoveCommandParser;
import au.id.tmm.toyrobotjava2021.app.parsing.PlaceCommandParser;
import au.id.tmm.toyrobotjava2021.app.parsing.ReportCommandParser;
import au.id.tmm.toyrobotjava2021.app.parsing.RightCommandParser;

import java.io.PrintStream;

public class ToyRobotApp implements Runnable {

    private final int xSize;
    private final int ySize;
    private final PrintStream output;
    private final RawCommandInput input;

    private final CombinedCommandParser parser;

    public static ToyRobotApp create(int xSize, int ySize, PrintStream output, RawCommandInput input) {
        return new ToyRobotApp(xSize, ySize, output, input);
    }

    protected ToyRobotApp(int xSize, int ySize, PrintStream output, RawCommandInput input) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.output = output;
        this.input = input;

        this.parser = CombinedCommandParser.composedOf(
                LeftCommandParser.create(),
                RightCommandParser.create(),
                MoveCommandParser.create(),
                PlaceCommandParser.create(),
                ReportCommandParser.create(this.output)
        );
    }

    @Override
    public void run() {
        Board board = Board.create(xSize, ySize, null);

        for (String rawCommand : input) {
            try {
                Command command = parser.parse(rawCommand);

                command.runOn(board);
            } catch (BadCommandException ignored) {}
        }
    }
}
