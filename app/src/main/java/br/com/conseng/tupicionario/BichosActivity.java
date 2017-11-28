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

public class BichosActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bichos);

        String[] bichosArray = getResources().getStringArray(R.array.bichos_array);
        final String[] bichosArrayDescricao = getResources().getStringArray(R.array.bichos_array_desc);

        ArrayList<Item> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = bichosArray[i];
            String descricao = bichosArrayDescricao[i];
            Item item = new Item(titulo, descricao, R.drawable.ic_bichos);
            lista.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, lista, R.color.bichos_categoria);
        ListView listView = findViewById(R.id.rootBichos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = bichosArrayDescricao[position];
                Toast.makeText(BichosActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
