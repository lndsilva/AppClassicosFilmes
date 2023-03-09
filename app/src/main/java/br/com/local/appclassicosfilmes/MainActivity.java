package br.com.local.appclassicosfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView idRecyclerView;
    List<Filmes> listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = new ArrayList<>();

        listaFilmes.add(new Filmes("Gato de Botas 2", "O Gato de Botas descobre que sua paixão pela aventura cobrou seu preço", "Animaçãp", R.drawable.gatobotas));
        listaFilmes.add(new Filmes("Wakanda para Sempre", "A rainha Ramonda, Shuri, M'Baku, Okoye e as poderosas Dora Milaje lutam para proteger sua nação após a morte do rei T'Challa", "Aventura", R.drawable.wakanda));
        listaFilmes.add(new Filmes("Creed III", "Depois de dominar o mundo do boxe, Adonis Creed tem prosperado em sua carreira e vida familiar", "Ação", R.drawable.creed));
        listaFilmes.add(new Filmes("Adão Negro", "Quase 5.000 anos depois de ter sido concedido com os poderes onipotentes dos deuses egípcios - e de ter sido preso, - Adão Negro se ergue de seu túmulo, pronto para trazer sua justiça ao mundo moderno.", "Ação", R.drawable.adao_negro));
        listaFilmes.add(new Filmes("Casamento Armado", "Durante a cerimônia de casamento, Darcy e Tom estão reunidos com seus familiares para celebrar o grande momento, quando são surpreendidos por sequestradores.", "Romance", R.drawable.casamento));
        listaFilmes.add(new Filmes("Quantumania", "Scott Lang e Hope van Dyne em suas jornadas como super-heróis. Scott e sua família são puxados para o Reino Quântico, onde eles precisarão enfrentar um novo e terrível vilão: Kang, o Conquistador e M.O.D.O.K..", "Aventura", R.drawable.quantumania));
        listaFilmes.add(new Filmes("Avatar", "12 anos depois de explorar Pandora e se juntar aos Na'vi, Jake Sully formou uma família com Neytiri e se estabeleceu entre os clãs do novo mundo. Porém, a paz não durará para sempre.", "Aventura", R.drawable.avatar));
        listaFilmes.add(new Filmes("Alerta Máximo", "O piloto Brodie Torrance salva seus passageiros de um raio pousando em uma ilha. Os moradores rebeldes e perigosos do local fazem a tripulação refém e Torrance procura ajuda de um passageiro acusado de assassinato.", "Ação", R.drawable.alerta_maximo));
        listaFilmes.add(new Filmes("O Pior Vizinho do Mundo", "A história de Otto Anderson, um viúvo mal-humorado que está muito preso aos seus hábitos. Quando uma jovem família animada se muda ao lado, ele conhece sua igual em Marisol, esperta e grávida, o que leva a uma amizade improvável que vai deixar o mundo de Otto de cabeça para baixo.", "Comédia", R.drawable.vizinho));
        listaFilmes.add(new Filmes("Shark Side of the Moon", "Décadas atrás, a URSS desenvolveu tubarões impossíveis de matar e os lançou à lua. Hoje, uma equipe de astronautas americanos enfrentará a luta de suas vidas.", "Ficção Científica", R.drawable.shark));
        listaFilmes.add(new Filmes("Batem à Porta", "Durante as férias em uma cabana remota, uma jovem e seus pais são feitos reféns por quatro estranhos armados que exigem que a família faça uma escolha impensável para evitar o apocalipse. Com acesso limitado ao mundo exterior, a família deve decidir no que acredita antes que tudo esteja perdido.", "Terror", R.drawable.porta));
        listaFilmes.add(new Filmes("A Queda", "Becky e Hunter são duas amigas que buscam aventura e enfrentam grande alturas em suas escaladas.", "Aventura", R.drawable.queda));

        idRecyclerView = findViewById(R.id.idRecyclerView);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);


    }
}