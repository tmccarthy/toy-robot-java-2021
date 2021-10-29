package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.ReportCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReportCommandParserTest {

    private final ReportCommandParser parserUnderTest = new ReportCommandParser();

    @Test
    void parseReport() throws Exception {
        assertEquals(ReportCommand.INSTANCE, parserUnderTest.parse("REPORT"));
    }

    @Test
    void parseFailure() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("LEFT"));
    }
}