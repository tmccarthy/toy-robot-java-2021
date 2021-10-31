package au.id.tmm.toyrobotjava2021.app.input;

import java.util.Iterator;
import java.util.Scanner;

public class ScannerCommandInput implements RawCommandInput {
    private final Scanner scanner;

    public static ScannerCommandInput readFrom(Scanner scanner) {
        return new ScannerCommandInput(scanner);
    }

    protected ScannerCommandInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return scanner.hasNextLine();
            }

            @Override
            public String next() {
                return scanner.nextLine();
            }
        };
    }
}
