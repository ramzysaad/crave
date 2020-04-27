package edu.rys5477.crave.ui.contact;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactViewModel extends ViewModel {

    private MutableLiveData <String> mText;

    public ContactViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("\n\n\nCrave Family Restaurant\n" +
                "4010 Jonestown Rd, Harrisburg, PA 17109\n"+
                "Tel: 717_000_000\n\n"
                );
    }

    public LiveData<String> getText() {
        return mText;
    }
}