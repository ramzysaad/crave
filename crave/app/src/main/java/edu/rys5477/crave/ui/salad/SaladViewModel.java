package edu.rys5477.crave.ui.salad;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaladViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public SaladViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is salad fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
