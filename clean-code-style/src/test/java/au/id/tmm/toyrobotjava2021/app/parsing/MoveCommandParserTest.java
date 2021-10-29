package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.MoveCommand;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MoveCommandParserTest {

    private final MoveCommandParser parserUnderTest = MoveCommandParser.create();

    @Test
    void parseMove() throws Exception {
        assertEquals(MoveCommand.INSTANCE, parserUnderTest.parse("MOVE"));
    }

    @Test
    void parseFailure() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("LEFT"));
    }
}