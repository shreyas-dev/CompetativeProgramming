package helpers;

import java.io.*;

public class OutputWriter {
    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
        writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
        this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
        for (int i = 0; i < objects.length; i++) {
            if (i != 0) {
                writer.print(' ');
            }
            writer.print(objects[i]);
        }
        writer.flush();
    }

    public void printLine(Object... objects) {
        print(objects);
        writer.println();
        writer.flush();
    }

    public void close() {
        writer.close();
    }

    public void flush() {
        writer.flush();
    }
}
