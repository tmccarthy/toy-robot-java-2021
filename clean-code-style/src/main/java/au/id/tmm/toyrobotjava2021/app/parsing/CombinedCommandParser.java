package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.Command;

import java.util.Arrays;
import java.util.List;

public class CombinedCommandParser implements CommandParser {

    private final List<CommandParser> stack;

    public static CombinedCommandParser composedOf(CommandParser... parsers) {
        return new CombinedCommandParser(Arrays.asList(parsers));
    }

    protected CombinedCommandParser(List<CommandParser> stack) {
        this.stack = stack;
    }

    @Override
    public Command parse(String string) throws BadCommandException {
        for (CommandParser commandParser : stack) {
            try {
                return commandParser.parse(string);
            } catch (BadCommandException ignored) {}
        }

        throw new BadCommandException();
    }
}
