package com.example.interacktiv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] cities={"Париж", "Лондон", "Берлин", "Рим", "Венеция"};
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView imageView=findViewById(R.id.imageView);
                String selected = spinner.getSelectedItem().toString();
                switch (selected) {
                    case "Париж":
                        imageView.setImageResource(R.drawable.paris);
                        break;
                    case "Лондон":
                        imageView.setImageResource(R.drawable.london);
                        break;
                    case "Берлин":
                        imageView.setImageResource(R.drawable.berlin);
                        break;
                    case "Рим":
                        imageView.setImageResource(R.drawable.rim);
                        break;
                    case "Венеция":
                        imageView.setImageResource(R.drawable.venecia);
                        break;
                    case "Дубай":
                        imageView.setImageResource(R.drawable.dubai);
                        break;
                    case "Гонконг":
                        imageView.setImageResource(R.drawable.gonkong);
                        break;
                    case "Шанхай":
                        imageView.setImageResource(R.drawable.shanhai);
                        break;
                    case "Сингапур":
                        imageView.setImageResource(R.drawable.singapur);
                        break;
                    case "Стамбул":
                        imageView.setImageResource(R.drawable.stambul);
                        break;
                    case "Аккра":
                        imageView.setImageResource(R.drawable.akkra);
                        break;
                    case "Алжир":
                        imageView.setImageResource(R.drawable.aljir);
                        break;
                    case "Кигали":
                        imageView.setImageResource(R.drawable.kigali);
                        break;
                    case "Найроби":
                        imageView.setImageResource(R.drawable.nairobi);
                        break;
                    case "Тунис":
                        imageView.setImageResource(R.drawable.tunis);
                        break;
                    case "Чикаго":
                        imageView.setImageResource(R.drawable.chikago);
                        break;
                    case "Лас Вегас":
                        imageView.setImageResource(R.drawable.lasvegas);
                        break;
                    case "Монреаль":
                        imageView.setImageResource(R.drawable.monreal);
                        break;
                    case "Орландо":
                        imageView.setImageResource(R.drawable.orlando);
                        break;
                    case "Торонто":
                        imageView.setImageResource(R.drawable.toronto);
                        break;
                    case "Богота":
                        imageView.setImageResource(R.drawable.bogota);
                        break;
                    case "Каракас":
                        imageView.setImageResource(R.drawable.karakas);
                        break;
                    case "Лима":
                        imageView.setImageResource(R.drawable.lima);
                        break;
                    case "Сальвадор":
                        imageView.setImageResource(R.drawable.salvador);
                        break;
                    case "Сан Паулу":
                        imageView.setImageResource(R.drawable.sanpaulu);
                        break;
                    case "Аделаида":
                        imageView.setImageResource(R.drawable.adelaida);
                        break;
                    case "Брисбен":
                        imageView.setImageResource(R.drawable.brisben);
                        break;
                    case "Мельбурн":
                        imageView.setImageResource(R.drawable.melburn);
                        break;
                    case "Сентрал Тилба":
                        imageView.setImageResource(R.drawable.sentraltilba);
                        break;
                    case "Сидней":
                        imageView.setImageResource(R.drawable.sidnei);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    String[] cities={"Париж", "Лондон", "Берлин", "Рим", "Венеция"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    String[] cities={"Дубай", "Гонконг", "Шанхай", "Сингапур", "Стамбул"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            case R.id.radioButton3:
                if (checked) {
                    String[] cities={"Аккра", "Алжир", "Кигали", "Найроби", "Тунис"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            case R.id.radioButton4:
                if (checked) {
                    String[] cities={"Чикаго", "Лас Вегас", "Монреаль", "Орландо", "Торонто"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            case R.id.radioButton5:
                if (checked) {
                    String[] cities={"Богота", "Каракас", "Лима", "Сальвадор", "Сан Паулу"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            case R.id.radioButton6:
                if (checked) {
                    String[] cities={"Аделаида", "Брисбен", "Мельбурн", "Сентрал Тилба", "Сидней"};
                    Spinner spinner = (Spinner) findViewById(R.id.spinner);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cities);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinner.setAdapter(adapter);
                }
                break;
            default:
                break;
        }
    }
}