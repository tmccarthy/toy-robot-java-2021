package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.geometry.Position;

public class Board {

    private final int xSize;
    private final int ySize;

    private Robot robot;

    public static Board create(int xSize, int ySize, Robot robot) {
        return new Board(xSize, ySize, robot);
    }

    protected Board(int xSize, int ySize, Robot robot) {
        this.xSize = xSize;
        this.ySize = ySize;
        this.robot = robot;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public boolean isOnBoard(Position position) {
        return position.getX() >= 0 && position.getX() < xSize && position.getY() >= 0 && position.getY() < ySize;
    }
}
