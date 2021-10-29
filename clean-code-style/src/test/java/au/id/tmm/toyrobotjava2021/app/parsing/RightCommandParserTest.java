package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.RightCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RightCommandParserTest {

    private final RightCommandParser parserUnderTest = RightCommandParser.create();

    @Test
    void parseRight() throws Exception {
        assertEquals(RightCommand.INSTANCE, parserUnderTest.parse("RIGHT"));
    }

    @Test
    void parseFailure() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("REPORT"));
    }

}