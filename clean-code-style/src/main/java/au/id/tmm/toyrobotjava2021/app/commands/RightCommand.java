package au.id.tmm.toyrobotjava2021.app.commands;

import au.id.tmm.toyrobotjava2021.app.Board;

public enum RightCommand implements Command {
    INSTANCE;

    @Override
    public void runOn(Board board) {
        if (board.getRobot() != null) {
            board.getRobot().setDirection(board.getRobot().getDirection().right());
        }
    }

}
