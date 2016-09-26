package info.devexchanges.picassodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class Cat extends BaseObservable {

    private String name;
    private String imageUrl;

    public Cat(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(info.devexchanges.picassodatabinding.BR.name);
    }

    @Bindable
    public String getImageUrl() {
        return imageUrl;
    }

    @Bindable
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        notifyPropertyChanged(info.devexchanges.picassodatabinding.BR.imageUrl);
    }
}
