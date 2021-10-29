package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.ReportCommand;

import java.io.PrintStream;

public class ReportCommandParser extends SingletonCommandParser {

    public static ReportCommandParser create(PrintStream reportPrintStream) {
        return new ReportCommandParser(reportPrintStream);
    }

    private ReportCommandParser(PrintStream reportPrintStream) {
        super("REPORT", ReportCommand.writingTo(reportPrintStream));
    }
}
