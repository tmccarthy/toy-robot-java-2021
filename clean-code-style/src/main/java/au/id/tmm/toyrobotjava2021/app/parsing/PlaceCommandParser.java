package au.id.tmm.toyrobotjava2021.app.parsing;

import au.id.tmm.toyrobotjava2021.app.commands.Command;
import au.id.tmm.toyrobotjava2021.app.commands.PlaceCommand;
import au.id.tmm.toyrobotjava2021.app.geometry.CompassDirection;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlaceCommandParser implements CommandParser {

    private static final Pattern PATTERN = Pattern.compile("^PLACE (\\d+),(\\d+),([A-Z]+)$");

    public static PlaceCommandParser create() {
        return new PlaceCommandParser();
    }

    protected PlaceCommandParser() {
    }

    @Override
    public Command parse(String string) throws BadCommandException {
        Matcher matcher = PATTERN.matcher(string);

        if (!matcher.matches()) {
            throw new BadCommandException();
        }

        int x = Integer.parseInt(matcher.group(1));
        int y = Integer.parseInt(matcher.group(2));
        String rawDirection = matcher.group(3);

        try {
            CompassDirection direction = CompassDirection.valueOf(rawDirection);

            return PlaceCommand.create(Position.create(x, y), direction);
        } catch (IllegalArgumentException e) {
            throw new BadCommandException(e);
        }
    }
}
