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

public class PovosNativosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_povos_nativos);

        String[] povosNativosArray = getResources().getStringArray(R.array.povos_nativos_array);
        final String[] povosNativosArrayDescricao = getResources().getStringArray(R.array.povos_nativos_array_desc);

        ArrayList<Item> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = povosNativosArray[i];
            String descricao = povosNativosArrayDescricao[i];
            Item item = new Item(titulo, descricao, R.drawable.ic_povos_nativos);
            lista.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, lista, R.color.povos_nativos_categoria);
        ListView listView = findViewById(R.id.rootPovosNativos);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = povosNativosArrayDescricao[position];
                Toast.makeText(PovosNativosActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
