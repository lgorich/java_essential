package homework4.task2;

import java.util.Random;

public class Main {
    private AbstractHandler instance;

    public static void main(String[] args) {
        Main main = new Main();
        // Pseudo identification of a document type
        main.identifyDocType();

        main.instance.open();
        main.instance.create();
        main.instance.change();
        main.instance.save();
    }

    private void identifyDocType() {
        final Random random = new Random();
        switch (random.nextInt(3)) {
            case 0: {
                instance = new XMLHandler();
                break;
            }
            case 1: {
                instance = new TXTHandler();
                break;
            }
            case 2: {
                instance = new DOCHandler();
                break;
            }
            default: {
                instance = new XMLHandler();
                break;
            }
        }
    }
}
