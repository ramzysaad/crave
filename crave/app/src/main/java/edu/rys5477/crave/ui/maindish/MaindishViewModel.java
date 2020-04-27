package edu.rys5477.crave.ui.maindish;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class MaindishViewModel extends ViewModel {
  private MutableLiveData<String> mText;

    public MaindishViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Main Dish fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}