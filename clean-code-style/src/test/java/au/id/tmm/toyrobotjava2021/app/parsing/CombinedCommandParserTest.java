package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.LeftCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinedCommandParserTest {

    private final CombinedCommandParser parserUnderTest = CombinedCommandParser.composedOf(new LeftCommandParser(), new RightCommandParser());

    @Test
    void testCoveredCommandType() throws Exception {
        assertEquals(LeftCommand.INSTANCE, parserUnderTest.parse("LEFT"));
    }

    @Test
    void testNotCovereredCommandType() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("MOVE"));
    }
}