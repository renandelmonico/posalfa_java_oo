package br.com.renandelmonico.oo;

/**
 *
 * @author renandelmonico
 */
public class Jogador extends Personagem {

    public Jogador(String nome, Lugar lugar) {
        super(nome, lugar);
    }

    @Override
    public void chora() {
        System.out.println("buabuabua");
    }
    
    @Override
    public void descreve() {
        System.out.println("Este é um jogador");
    }
    
    public String getNome() {
        return "JOGADOR: "+super.getNome();
    }

}
