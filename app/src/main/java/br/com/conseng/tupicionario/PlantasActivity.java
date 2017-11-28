package br.com.conseng.tupicionario;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Qin on 13/11/2017.
 */

public class PlantasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plantas);

        String[] plantasArray = getResources().getStringArray(R.array.plantas_array);
        final String[] plantasArrayDescricao = getResources().getStringArray(R.array.plantas_array_desc);

        ArrayList<Item> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = plantasArray[i];
            String descricao = plantasArrayDescricao[i];
            Item item = new Item(titulo, descricao, R.drawable.ic_plantas);
            lista.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, lista, R.color.plantas_categoria);
        ListView listView = findViewById(R.id.rootPlantas);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = plantasArrayDescricao[position];
                Toast.makeText(PlantasActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
