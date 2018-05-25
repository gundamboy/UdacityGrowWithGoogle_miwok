package com.example.android.miwok;


public class Word {
    // member variables
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    // Word constructor
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Word constructor for words with an image
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
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
}
