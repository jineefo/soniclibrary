package org.vinuxproject.audio.touchsource;

import java.io.IOException;

public interface AudioSink {
    int write(byte[] input, int offSetInBytes, int sizeInBytes) throws IOException;

    void close() throws IOException;
}
