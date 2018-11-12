package br.com.senaijandira.tratamentoimagens_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    //Link da Imagem via internet;
    //String urlImagem = "https://www.torcedores.com/content/uploads/2017/09/supermarioworld.jpeg";


    //Link da Imagem via Xamp;
    //Criar uma pasta no HTDOCS e colocar a imagem ;

    String urlImagem = "http://10.0.2.2/imagens/mario.jpeg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Resgatando a imagem do Layout via ID
        imageView = findViewById(R.id.imageView);

        //Carregar a imagem na tela;
        Picasso.get().load(urlImagem).into(imageView);

    }
}
