package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        // throw new UnsupportedOperationException("Not implemented yet");

        File file = new File(filename);
        byte[] data = new byte[(int) file.length()];

        try (FileInputStream fis = new FileInputStream(filename)) {
            int nbByteRead = fis.read(data);
            System.out.println("nb bytes read: " + nbByteRead);
        } catch (IOException e) {
            System.out.println("Exception in binary read: " + e);
        }
    }
}
