package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.input.ScannerCommandInput;

import java.io.PrintStream;
import java.util.Scanner;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        ScannerCommandInput input = ScannerCommandInput.readFrom(new Scanner(System.in));
        @SuppressWarnings("UseOfSystemOutOrSystemErr") PrintStream output = System.out;

        ToyRobotApp toyRobotApp = ToyRobotApp.create(5, 5, output, input);

        toyRobotApp.run();
    }
}
