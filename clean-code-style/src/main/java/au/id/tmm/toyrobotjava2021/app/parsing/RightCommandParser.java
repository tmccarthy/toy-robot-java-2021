package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.RightCommand;

public class RightCommandParser extends SingletonCommandParser {

    public static RightCommandParser create() {
        return new RightCommandParser();
    }

    protected RightCommandParser() {
        super("RIGHT", RightCommand.INSTANCE);
    }
}
