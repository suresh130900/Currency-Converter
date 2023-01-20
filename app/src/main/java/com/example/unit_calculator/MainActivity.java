package com.example.unit_calculator;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.unit_calculator.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

      List<String> currency = new ArrayList<>();


      //Spinner (dropdown list) from activity main
        Spinner base_currency = findViewById(R.id.base_currency);
        Spinner convert_currency = findViewById(R.id.convert_currency);

        //creating a textview object
        EditText currency1 = findViewById(R.id.currency1);
        TextView currency2 = findViewById(R.id.currency2);

        Button cal = findViewById(R.id.calculate);
        TextView result = findViewById(R.id.currency2);

        currency.add("INR");
        currency.add("USD");
        currency.add("EUR");


        ArrayAdapter currAdapter = new ArrayAdapter(this, R.layout.spinner_layout, currency);

        base_currency.setAdapter(currAdapter);
        convert_currency.setAdapter(currAdapter);


        //creating a function
        cal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       // Toast.makeText(MainActivity.this,base_currency.getSelectedItem().toString(),Toast.LENGTH_LONG).show();
                        //Toast.makeText(MainActivity.this,convert_currency.getSelectedItem().toString(),Toast.LENGTH_LONG).show();

                        if(base_currency.getSelectedItem() == "USD" && convert_currency.getSelectedItem() == "INR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*82;
                            currency2.setText(String.valueOf(ans));

                        }

                        else if(base_currency.getSelectedItem() == "INR" && convert_currency.getSelectedItem() == "INR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            //double ans = a*82;
                            currency2.setText(String.valueOf(a));

                        }

                        else if(base_currency.getSelectedItem() == "EUR" && convert_currency.getSelectedItem() == "INR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*88;
                            currency2.setText(String.valueOf(ans));

                        }

                        else if(base_currency.getSelectedItem() == "USD" && convert_currency.getSelectedItem() == "USD")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            //double ans = a*88;
                            currency2.setText(String.valueOf(a));

                        }

                        else if(base_currency.getSelectedItem() == "USD" && convert_currency.getSelectedItem() == "EUR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*0.92;
                            currency2.setText(String.valueOf(ans));

                        }

                        else if(base_currency.getSelectedItem() == "INR" && convert_currency.getSelectedItem() == "EUR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*0.011;
                            currency2.setText(String.valueOf(ans));

                        }

                        else if(base_currency.getSelectedItem() == "INR" && convert_currency.getSelectedItem() == "USD")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*0.012;
                            currency2.setText(String.valueOf(ans));

                        }

                        else if(base_currency.getSelectedItem() == "EUR" && convert_currency.getSelectedItem() == "EUR")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            //double ans = a*0.012;
                            currency2.setText(String.valueOf(a));

                        }

                        else if(base_currency.getSelectedItem() == "EUR" && convert_currency.getSelectedItem() == "USD")
                        {
                            //Toast.makeText(MainActivity.this,currency1.getText().toString(),Toast.LENGTH_LONG).show();
                            double a = Double.parseDouble(currency1.getText().toString());
                            Log.d("TAG", "onClick: "+ a );

                            double ans = a*1.08;
                            currency2.setText(String.valueOf(a));

                        }
                    }
                }
        );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}