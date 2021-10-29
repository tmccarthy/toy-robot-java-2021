package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.LeftCommand;

public class LeftCommandParser extends SingletonCommandParser {

    public static LeftCommandParser create() {
        return new LeftCommandParser();
    }

    protected LeftCommandParser() {
        super("LEFT", LeftCommand.INSTANCE);
    }
}
