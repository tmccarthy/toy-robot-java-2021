package au.id.tmm.toyrobotjava2021.app;

public enum CompassDirection {
    NORTH {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX(), position.getY() + 1);
        }

        @Override
        public CompassDirection left() {
            return CompassDirection.WEST;
        }

        @Override
        public CompassDirection right() {
            return CompassDirection.EAST;
        }
    },
    SOUTH {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX(), position.getY() - 1);
        }

        @Override
        public CompassDirection left() {
            return CompassDirection.EAST;
        }

        @Override
        public CompassDirection right() {
            return CompassDirection.WEST;
        }
    },
    EAST {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX() + 1, position.getY());
        }

        @Override
        public CompassDirection left() {
            return CompassDirection.NORTH;
        }

        @Override
        public CompassDirection right() {
            return CompassDirection.SOUTH;
        }
    },
    WEST {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX() - 1, position.getY());
        }

        @Override
        public CompassDirection left() {
            return CompassDirection.SOUTH;
        }

        @Override
        public CompassDirection right() {
            return CompassDirection.NORTH;
        }
    },
    ;

    public abstract Position translate(Position position);
    public abstract CompassDirection left();
    public abstract CompassDirection right();

}
