package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.MoveCommand;

public class MoveCommandParser extends SingletonCommandParser {

    public static MoveCommandParser create() {
        return new MoveCommandParser();
    }

    protected MoveCommandParser() {
        super("MOVE", MoveCommand.INSTANCE);
    }
}
