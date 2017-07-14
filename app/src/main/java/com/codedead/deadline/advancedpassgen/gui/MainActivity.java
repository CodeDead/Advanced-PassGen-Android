package com.codedead.deadline.advancedpassgen.gui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.codedead.deadline.advancedpassgen.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox chbSmall = (CheckBox) findViewById(R.id.ChbSmall);
        final CheckBox chbCapital = (CheckBox) findViewById(R.id.ChbCapital);
        final CheckBox chbSpecial = (CheckBox) findViewById(R.id.ChbSpecial);
        final CheckBox chbNumber = (CheckBox) findViewById(R.id.ChbNumbers);

        CheckBox chbCustom = (CheckBox) findViewById(R.id.ChbCustom);

        chbCustom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    chbSmall.setEnabled(false);
                    chbCapital.setEnabled(false);
                    chbSpecial.setEnabled(false);
                    chbNumber.setEnabled(false);
                } else {
                    chbSmall.setEnabled(true);
                    chbCapital.setEnabled(true);
                    chbSpecial.setEnabled(true);
                    chbNumber.setEnabled(true);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_settings:
                break;
            case R.id.nav_about:
                break;
            case R.id.nav_exit:
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
