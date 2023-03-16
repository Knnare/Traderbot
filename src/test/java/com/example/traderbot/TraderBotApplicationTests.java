package com.example.traderbot;

import com.example.traderbot.bougie.Bougie;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TraderBotApplicationTests {

    @Test
    void contextLoads() {
        testadd();
    }


    public void testadd() {
        Bougie bougie1 = new Bougie (20,0,20,0) .CalculType();
        Bougie bougie2 = new Bougie(17 ,15 ,25 ,15).CalculType();
        Bougie bougie3 = new Bougie(29 ,21 ,30 ,20).CalculType();
        Bougie bougie4 = new Bougie(40 ,35 ,40 ,30).CalculType();
        Bougie bougie5 = new Bougie(7 ,0.5 ,10 ,0).CalculType();
        Bougie bougie6 = new Bougie(10 ,9 ,10 ,0).CalculType();
        Bougie bougie7 = new Bougie(0 ,10 ,10 ,0).CalculType();
        Bougie bougie8 = new Bougie(12, 18 , 20, 10).CalculType();
        Bougie bougie9 = new Bougie(10 ,12 ,12 ,0).CalculType();
        Bougie bougie10 = new Bougie(6, 9, 10 ,0).CalculType();
        Bougie bougie11 = new Bougie(11, 15, 20, 10).CalculType();
        Bougie bougie12 = new Bougie(1.9,7,10,0).CalculType();
        Bougie bougie13 = new Bougie(0,2,10,0).CalculType();
        Assertions.assertThat(bougie1.getSignal()).isEqualTo("Vente forte");
        Assertions.assertThat(bougie2.getSignal()).isEqualTo("Vente");
        Assertions.assertThat(bougie3.getSignal()).isEqualTo("Vente");
        Assertions.assertThat(bougie4.getSignal()).isEqualTo("Vente neutre");
        Assertions.assertThat(bougie5.getSignal()).isEqualTo("Vente neutre");
        Assertions.assertThat(bougie6.getSignal()).isEqualTo("Vente risque");
        Assertions.assertThat(bougie7.getSignal()).isEqualTo("Achat fort");
        Assertions.assertThat(bougie8.getSignal()).isEqualTo("Achat");
        Assertions.assertThat(bougie9.getSignal()).isEqualTo("Achat");
        Assertions.assertThat(bougie10.getSignal()).isEqualTo("Achat neutre");
        Assertions.assertThat(bougie11.getSignal()).isEqualTo("Achat neutre");
        Assertions.assertThat(bougie12.getSignal()).isEqualTo("Achat neutre");
        Assertions.assertThat(bougie13.getSignal()).isEqualTo("Achat risque");
    }
}
