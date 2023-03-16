package com.example.traderbot;

import com.example.traderbot.bougie.Bougie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TraderBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraderBotApplication.class, args);
        Bougie bougie1 = new Bougie(9, 1, 9, 0).CalculType();
        Bougie bougie2 = new Bougie(3, 2, 9, 2).CalculType();
        Bougie bougie3 = new Bougie(5, 4, 5, 3).CalculType();
        Bougie bougie4 = new Bougie(7, 6, 7, 6).CalculType();
        Bougie bougie5 = new Bougie(4, 8, 6, 4).CalculType();
        Bougie bougie6 = new Bougie(6, 8, 9, 1).CalculType();
        Bougie bougie7 = new Bougie(5, 7, 8, 2).CalculType();
        Bougie bougie8 = new Bougie(8, 1, 9, 1).CalculType();
        System.out.print("Bougie 1: "); System.out.println(bougie1.getClass().getSimpleName()); System.out.println(bougie1.getSignal());
        System.out.print("Bougie 2: "); System.out.println(bougie2.getClass().getSimpleName()); System.out.println(bougie2.getSignal());
        System.out.print("Bougie 3: "); System.out.println(bougie3.getClass().getSimpleName()); System.out.println(bougie3.getSignal());
        System.out.print("Bougie 4: "); System.out.println(bougie4.getClass().getSimpleName()); System.out.println(bougie4.getSignal());
        System.out.print("Bougie 5: "); System.out.println(bougie5.getClass().getSimpleName()); System.out.println(bougie5.getSignal());
        System.out.print("Bougie 6: "); System.out.println(bougie6.getClass().getSimpleName()); System.out.println(bougie6.getSignal());
        System.out.print("Bougie 7: "); System.out.println(bougie7.getClass().getSimpleName()); System.out.println(bougie7.getSignal());
        System.out.print("Bougie 8: "); System.out.println(bougie8.getClass().getSimpleName()); System.out.println(bougie8.getSignal());
    }

}
