package model;

import enums.Direction;

public class Wall {
    private Direction direction;

    public Wall(Direction direction) {
        this.direction = direction;
    }

    public void create() {
        System.out.println("Wall has been created on: " + direction);
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction=" + direction +
                '}';
    }
}
