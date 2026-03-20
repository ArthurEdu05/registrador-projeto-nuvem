package br.mackenzie.registrador.config;

import br.mackenzie.registrador.entities.Camisa;
import br.mackenzie.registrador.repository.CamisaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(CamisaRepository camisaRepository) {
        return args -> {
            if (camisaRepository.count() > 0) {
                return;
            }

            var camisa = new Camisa();
            camisa.setNacao("Brasil");
            camisa.setAno("2022");
            camisa.setCor("Amarela");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Neymar");
            camisa.setNumeroJogador(10);
            camisa.setPreco(399.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Argentina");
            camisa.setAno("2022");
            camisa.setCor("Branca");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Messi");
            camisa.setNumeroJogador(10);
            camisa.setPreco(379.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("França");
            camisa.setAno("2018");
            camisa.setCor("Azul");
            camisa.setTamanho("G");
            camisa.setNomeJogador("Mbappé");
            camisa.setNumeroJogador(7);
            camisa.setPreco(349.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Portugal");
            camisa.setAno("2016");
            camisa.setCor("Vermelha");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Ronaldo");
            camisa.setNumeroJogador(7);
            camisa.setPreco(599.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Polônia");
            camisa.setAno("2018");
            camisa.setCor("Branca");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Lewandowski");
            camisa.setNumeroJogador(9);
            camisa.setPreco(319.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Bélgica");
            camisa.setAno("2018");
            camisa.setCor("Vermelha");
            camisa.setTamanho("G");
            camisa.setNomeJogador("Hazard");
            camisa.setNumeroJogador(10);
            camisa.setPreco(329.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Inglaterra");
            camisa.setAno("2022");
            camisa.setCor("Branca");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Kane");
            camisa.setNumeroJogador(9);
            camisa.setPreco(305.00);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("França");
            camisa.setAno("2018");
            camisa.setCor("Azul");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Griezmann");
            camisa.setNumeroJogador(7);
            camisa.setPreco(299.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Brasil");
            camisa.setAno("2002");
            camisa.setCor("Amarela");
            camisa.setTamanho("G");
            camisa.setNomeJogador("Ronaldo Fenômeno");
            camisa.setNumeroJogador(9);
            camisa.setPreco(999.99);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Argentina");
            camisa.setAno("1986");
            camisa.setCor("Branca");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Maradona");
            camisa.setNumeroJogador(10);
            camisa.setPreco(1190.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Holanda");
            camisa.setAno("1974");
            camisa.setCor("Laranja");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Cruyff");
            camisa.setNumeroJogador(14);
            camisa.setPreco(1399.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Brasil");
            camisa.setAno("1994");
            camisa.setCor("Amarela");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Romário");
            camisa.setNumeroJogador(11);
            camisa.setPreco(799.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("França");
            camisa.setAno("2018");
            camisa.setCor("Azul");
            camisa.setTamanho("G");
            camisa.setNomeJogador("Pogba");
            camisa.setNumeroJogador(6);
            camisa.setPreco(299.00);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Portugal");
            camisa.setAno("2020");
            camisa.setCor("Vermelha");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Bruno Fernandes");
            camisa.setNumeroJogador(18);
            camisa.setPreco(239.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Espanha");
            camisa.setAno("2010");
            camisa.setCor("Vermelha");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Iniesta");
            camisa.setNumeroJogador(8);
            camisa.setPreco(699.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Itália");
            camisa.setAno("2006");
            camisa.setCor("Azul");
            camisa.setTamanho("G");
            camisa.setNomeJogador("Pirlo");
            camisa.setNumeroJogador(21);
            camisa.setPreco(719.90);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Alemanha");
            camisa.setAno("2014");
            camisa.setCor("Branca");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Müller");
            camisa.setNumeroJogador(13);
            camisa.setPreco(499.00);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Uruguai");
            camisa.setAno("2010");
            camisa.setCor("Celeste");
            camisa.setTamanho("P");
            camisa.setNomeJogador("Suárez");
            camisa.setNumeroJogador(9);
            camisa.setPreco(390.00);
            camisaRepository.save(camisa);

            camisa = new Camisa();
            camisa.setNacao("Croácia");
            camisa.setAno("2018");
            camisa.setCor("Vermelha");
            camisa.setTamanho("M");
            camisa.setNomeJogador("Modrić");
            camisa.setNumeroJogador(10);
            camisa.setPreco(199.99);
            camisaRepository.save(camisa);
        };
    }
}
