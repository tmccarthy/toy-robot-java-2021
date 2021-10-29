package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.Command;
import au.id.tmm.toyrobotjava2021.app.commands.ReportCommand;

public class ReportCommandParser implements CommandParser {
    @Override
    public Command parse(String string) throws BadCommandException {
        if ("REPORT".equals(string)) {
            return ReportCommand.INSTANCE;
        } else {
            throw new BadCommandException();
        }
    }
}
