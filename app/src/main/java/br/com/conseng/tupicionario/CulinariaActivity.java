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

public class CulinariaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culinaria);

        String[] culinariaArray = getResources().getStringArray(R.array.culinaria_array);
        final String[] culinariaArrayDescricao = getResources().getStringArray(R.array.culinaria_array_desc);

        ArrayList<Item> lista = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String titulo = culinariaArray[i];
            String descricao = culinariaArrayDescricao[i];
            Item item = new Item(titulo, descricao, R.drawable.ic_culinaria);
            lista.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, lista, R.color.culinaria_categoria);
        ListView listView = findViewById(R.id.rootCulinaria);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = culinariaArrayDescricao[position];
                Toast.makeText(CulinariaActivity.this, desc, Toast.LENGTH_LONG).show();
            }
        });
        listView.setAdapter(adapter);
    }
}
