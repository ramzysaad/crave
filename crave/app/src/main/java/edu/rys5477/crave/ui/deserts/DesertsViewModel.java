package edu.rys5477.crave.ui.deserts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DesertsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DesertsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is deserts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}