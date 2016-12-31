package th.co.bsupits.testProductFlavors;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import th.co.bsupits.testProductFlavors.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.tvServiceUrl.setText(getApplicationContext().getPackageName());
        binding.button.setOnClickListener(this);
        Log.d("package : ", getApplicationContext().getPackageName());
    }

    @Override
    public void onClick(View view) {
        if (view == binding.button) {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}
