package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.Command;

abstract class SingletonCommandParser implements CommandParser {

    private final String rawCommand;
    private final Command commandSingleton;

    protected SingletonCommandParser(String rawCommand, Command commandSingleton) {
        this.rawCommand = rawCommand;
        this.commandSingleton = commandSingleton;
    }

    @Override
    public Command parse(String string) throws BadCommandException {
        if (rawCommand.equals(string)) {
            return commandSingleton;
        } else {
            throw new BadCommandException();
        }
    }
}
