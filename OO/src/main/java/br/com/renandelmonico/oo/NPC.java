package br.com.renandelmonico.oo;

import java.util.Random;

/**
 *
 * @author renandelmonico
 */
public class NPC extends Personagem {

    static private Random r = new Random();

    static private String[] possiveisNomes = {"A", "B", "C", "D", "E"};

    public NPC(Lugar lugar) {
        super(possiveisNomes[r.nextInt(possiveisNomes.length)],
                lugar);
    }

    @Override
    public void chora() {
        System.out.println("mimimimimi");
    }

    @Override
    public void descreve() {
        System.out.println("Este é um NPC");
    }
    
}
