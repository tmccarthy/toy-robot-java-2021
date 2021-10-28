package au.id.tmm.toyrobotjava2021.app;

public enum CompassDirection {
    NORTH {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX(), position.getY() + 1);
        }
    },
    SOUTH {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX(), position.getY() - 1);
        }
    },
    EAST {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX() + 1, position.getY());
        }
    },
    WEST {
        @Override
        public Position translate(Position position) {
            return Position.create(position.getX() - 1, position.getY());
        }
    },
    ;

    public abstract Position translate(Position position);
}
