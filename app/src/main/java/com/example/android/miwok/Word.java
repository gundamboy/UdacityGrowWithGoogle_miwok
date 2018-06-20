package com.example.android.miwok;


public class Word {
    // member variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;
    private int mAudioResourceId;

    // Word constructor
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    // Word constructor for words with an image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // Get the default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    // check if an image was provided
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE;
    }

    int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
