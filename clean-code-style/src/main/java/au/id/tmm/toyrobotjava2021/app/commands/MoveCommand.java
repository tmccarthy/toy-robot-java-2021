package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;
import au.id.tmm.toyrobotjava2021.app.geometry.Position;

public enum MoveCommand implements Command {
    INSTANCE;

    @Override
    public void runOn(Board board) {
        if (board.getRobot() != null) {
            Position nextPosition = board.getRobot().getDirection().translate(board.getRobot().getPosition());
            if (board.isOnBoard(nextPosition)) {
                board.getRobot().setPosition(nextPosition);
            }
        }
    }
}
