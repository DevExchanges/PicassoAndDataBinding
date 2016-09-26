package info.devexchanges.picassodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import info.devexchanges.picassodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Cat cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        cat = new Cat("Tom", "");
        binding.setCat(cat);

        OnClickHandler handlers = new OnClickHandler();
        binding.setHandlers(handlers);
    }

    public class OnClickHandler {
        public void onUpdateCat(View view) {
            cat.setName("Super Tom");
            cat.setImageUrl("http://i.imgur.com/6zgawxz.jpg");
            Toast.makeText(MainActivity.this, "Cat name updated, loading image...", Toast.LENGTH_SHORT).show();
        }
    }
}
