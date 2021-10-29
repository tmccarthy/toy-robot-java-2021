package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.ReportCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ReportCommandParserTest {

    @SuppressWarnings("UseOfSystemOutOrSystemErr")
    private final ReportCommandParser parserUnderTest = ReportCommandParser.create(System.out);

    @Test
    void parseReport() throws Exception {
        assertEquals(ReportCommand.class, parserUnderTest.parse("REPORT").getClass());
    }

    @Test
    void parseFailure() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("LEFT"));
    }
}