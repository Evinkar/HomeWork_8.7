public class TrucksContainersAndBoxes {
    public static final int BOXES_IN_CONTAINER = 27;
    public static final int CONTAINERS_IN_TRUCKS = 12;


    public int boxes;
    public int containers;
    public int trucks;
    public int boxesLeft;
    public int containersLeft;

    public TrucksContainersAndBoxes(int boxes) {
        this.boxes = boxes;
    }

    public void boxesInContainer(int boxes) {

        if (boxes >= BOXES_IN_CONTAINER) {
            containers = boxes / BOXES_IN_CONTAINER;
            boxesLeft = boxes % BOXES_IN_CONTAINER;
        } else {
            containers = 1;

        }
        if (boxesLeft != 0) {
            containers++;
        }

    }

    public void containersInTruck(int containers) {
        if (containers >= CONTAINERS_IN_TRUCKS) {
            trucks = containers / CONTAINERS_IN_TRUCKS;
            containersLeft = containers % CONTAINERS_IN_TRUCKS;
        } else {
            trucks = 1;

        }
        if (containersLeft != 0) {
            trucks++;
        }

    }

    public void printAll() {
        System.out.println("Необходимо: ");
        System.out.println("\t" + "Грузовиков: " + trucks);
        System.out.println("\t" + "Контейнеров: " + containers);
        System.out.println("Всего ящиков: " + boxes);

    }

    public void numbering() {
        int i;
        System.out.println("Грузовик 1");
        System.out.println("\t" + "контейнер 1");
        for (i = 1; i <= boxes; i++) {

            if (i % (CONTAINERS_IN_TRUCKS * BOXES_IN_CONTAINER) == 0) {
                System.out.println("\t" + "\t" + "ящик " + i);
                System.out.println("Грузовик " + ((i / (CONTAINERS_IN_TRUCKS * BOXES_IN_CONTAINER))+1));
                System.out.println("\t" + "контейнер " + ((i / BOXES_IN_CONTAINER)+1));
            } else {
                if (i % BOXES_IN_CONTAINER == 0) {
                    System.out.println("\t" + "\t" + "ящик " + i);
                    System.out.println("\t" + "контейнер " + ((i / BOXES_IN_CONTAINER)+1));
                } else {
                    System.out.println("\t" + "\t" + "ящик " + i);
                }
            }
        }
    }
}

