package org.vinuxproject.audio.touchsource;

public interface OnProgressChangedListener {
    void onProgressChanged(int track, double currentPercentage, long position);

    void onTrackEnd(int track);

    void onExceptionThrown(String string);
}