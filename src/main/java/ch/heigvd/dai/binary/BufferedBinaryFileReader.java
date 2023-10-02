package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        //throw new UnsupportedOperationException("Not implemented yet");

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))){
            int b;
            while((b = bis.read()) != -1) {
                // Do nothing
            }
        } catch (IOException e) {
            System.out.println("Exception in buffered binary read: " + e);
        }
    }
}
