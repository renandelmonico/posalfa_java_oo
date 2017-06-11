package br.com.renandelmonico.oo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author renandelmonico
 */
public class Mapa {

    static private Random r = new Random();
    
    private static Mapa instancia=new Mapa();
    
    public static Mapa getInstancia(){
        return instancia;
    }
    
    private Lugar lugarInicialJogador;
    private Lugar lugarInicialNPC;
    private Lugar lugarInicialLiquidificador;
    
    private Mapa() {
        criaLugares();
    }

    private void criaLugares() {
        Lugar sala = new Lugar("sala");
        Lugar copa = new Lugar("copa");
        Lugar corredor = new Lugar("corredor");
        Lugar cozinha = new Lugar("cozina");
        Lugar quarto = new Lugar("quarto");
        Lugar banheiro = new Lugar("banheiro");
        sala.setSul(copa);
        copa.setNorte(sala);
        copa.setSul(cozinha);
        cozinha.setNorte(copa);
        sala.setOeste(corredor);
        copa.setOeste(corredor);
        cozinha.setOeste(corredor);
        corredor.setLeste(copa);
        corredor.setNorte(quarto);
        quarto.setSul(corredor);
        corredor.setSul(banheiro);
        banheiro.setNorte(corredor);
        lugarInicialJogador = sala;
        lugarInicialNPC = cozinha;
        
        ArrayList<Lugar> lugares = new ArrayList();
        lugares.add(copa);
        lugares.add(corredor);
        lugares.add(cozinha);
        lugares.add(quarto);
        lugares.add(banheiro);

        lugarInicialLiquidificador = lugares.get(r.nextInt(lugares.size()));
    }

    public Lugar getLugarInicialJogador() {
        return lugarInicialJogador;
    }

    public Lugar getLugarInicialNPC() {
        return lugarInicialNPC;
    }
    
    public Lugar getLugarInicialLiquidificador() {
        return lugarInicialLiquidificador;
    }

}
