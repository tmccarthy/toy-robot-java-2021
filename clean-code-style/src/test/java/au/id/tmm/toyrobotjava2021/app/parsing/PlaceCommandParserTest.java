package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.PlaceCommand;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaceCommandParserTest {

    private PlaceCommandParser parserUnderTest = PlaceCommandParser.create();

    @Test
    void failNotPlaceCommand() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("RIGHT"));
    }

    @Test
    void failBadDirection() {
        assertThrows(BadCommandException.class, () -> parserUnderTest.parse("PLACE 1,1,ASDF"));
    }

    @Test
    void successParse() throws Exception {
        assertEquals(
            PlaceCommand.create(Position.create(1, 2), CompassDirection.NORTH),
            parserUnderTest.parse("PLACE 1,2,NORTH")
        );
    }
}