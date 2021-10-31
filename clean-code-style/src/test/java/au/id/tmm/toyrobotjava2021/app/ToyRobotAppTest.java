package au.id.tmm.toyrobotjava2021.app;

import au.id.tmm.toyrobotjava2021.app.input.RawCommandInput;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToyRobotAppTest extends TestablePrintStreamTest {

    private ToyRobotApp appUnderTestForIntput(RawCommandInput input) {
        return ToyRobotApp.create(5, 5, printStream, input);
    }

    @Test
    void exampleA() {
        RawCommandInput input = StaticRawInput.provides(
                "PLACE 0,0,NORTH",
                "MOVE",
                "REPORT"
        );

        ToyRobotApp toyRobotApp = appUnderTestForIntput(input);

        toyRobotApp.run();

        String expectedOutput = "0,1,NORTH" + System.lineSeparator();

        assertEquals(expectedOutput, super.readPrintStream());
    }

    @Test
    void exampleB() {
        RawCommandInput input = StaticRawInput.provides(
                "PLACE 0,0,NORTH",
                "LEFT",
                "REPORT"
        );

        ToyRobotApp toyRobotApp = appUnderTestForIntput(input);

        toyRobotApp.run();

        String expectedOutput = "0,0,WEST" + System.lineSeparator();

        assertEquals(expectedOutput, super.readPrintStream());
    }

    @Test
    void exampleC() {
        RawCommandInput input = StaticRawInput.provides(
                "PLACE 1,2,EAST",
                "MOVE",
                "MOVE",
                "LEFT",
                "MOVE",
                "REPORT"
        );

        ToyRobotApp toyRobotApp = appUnderTestForIntput(input);

        toyRobotApp.run();

        String expectedOutput = "3,3,NORTH" + System.lineSeparator();

        assertEquals(expectedOutput, super.readPrintStream());
    }

    private static class StaticRawInput implements RawCommandInput {
        private final List<String> inputs;

        public static StaticRawInput provides(String... inputs) {
            return new StaticRawInput(Arrays.asList(inputs));
        }

        public StaticRawInput(List<String> inputs) {
            this.inputs = inputs;
        }

        @Override
        public Iterator<String> iterator() {
            return inputs.iterator();
        }
    }

}