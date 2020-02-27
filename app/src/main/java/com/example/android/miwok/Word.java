package com.example.android.miwok;

public class Word {


    // because it private
   private String mDefaultTranslation;
   private String mMiwokTranslation;
   private int mImageResourceId = NO_IMAGE_PROVIDED;

   private static final int NO_IMAGE_PROVIDED = -1 ;

   // 2 input
    public Word(String defaultTranslation, String miwokTranslation) {
       mDefaultTranslation = defaultTranslation;
       mMiwokTranslation =  miwokTranslation;
    }

    //3 input
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){

        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
