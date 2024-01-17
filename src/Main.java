import enums.Direction;
import enums.LampType;
import enums.PaintColor;
import model.*;

public class Main {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp(LampType.NEON, true, 100);
        lamp1.turnOn();

        Ceiling ceiling = new Ceiling(3, PaintColor.RED);
        ceiling.create();

        Bed bed = new Bed("Double", 2, 2, 2, 2);
        System.out.println(bed.toString());

        Wall northWall = new Wall(Direction.NORTH);
        Wall eastWall = new Wall(Direction.EAST);
        Wall westWall = new Wall(Direction.WEST);
        Wall southWall = new Wall(Direction.SOUTH);

        Wall[] walls = {northWall, eastWall, westWall, southWall};

        BedRoom bedRoom = new BedRoom(northWall, eastWall, westWall,
                southWall, ceiling, new Lamp(LampType.LAVA, true, 120),
                new Carpet(1, 3, PaintColor.BLUE),
                new Bed("DOUBLE", 2, 2, 2, 2),
                new Wardrobe(1, 3, 20),
                "Ebeveyn"
        );
        System.out.println(bedRoom);
        bedRoom.createBedroom();
    }
}