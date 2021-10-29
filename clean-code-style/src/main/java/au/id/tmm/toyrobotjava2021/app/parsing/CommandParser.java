package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.Command;

public interface CommandParser {
    public Command parse(String string) throws BadCommandException;
}
