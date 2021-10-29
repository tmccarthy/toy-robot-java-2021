package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.ReportCommand;

public class ReportCommandParser extends SingletonCommandParser {

    public static ReportCommandParser create() {
        return new ReportCommandParser();
    }

    private ReportCommandParser() {
        super("REPORT", ReportCommand.INSTANCE);
    }
}
