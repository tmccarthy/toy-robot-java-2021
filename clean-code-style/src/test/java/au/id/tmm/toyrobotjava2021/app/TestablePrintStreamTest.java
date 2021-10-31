package au.id.tmm.toyrobotjava2021.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

abstract public class TestablePrintStreamTest {

    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();
    protected final PrintStream printStream = new PrintStream(baos);

    protected String readPrintStream() {
        return new String(baos.toByteArray(), StandardCharsets.UTF_8);
    }

}
