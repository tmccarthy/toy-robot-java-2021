package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.LeftCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LeftCommandParserTest {

    private final LeftCommandParser parserUnderTest = LeftCommandParser.create();

    @Test
    void parseLeft() throws Exception {
        assertEquals(LeftCommand.INSTANCE, parserUnderTest.parse("LEFT"));
    }

    @Test
    void parseFailure() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("REPORT"));
    }

}