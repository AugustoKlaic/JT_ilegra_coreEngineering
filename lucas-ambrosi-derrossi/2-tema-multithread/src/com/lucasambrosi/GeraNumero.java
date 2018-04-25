package com.lucasambrosi;

import java.util.Random;

/**
 * @param paridade - define se o numero é par ou ímpar (default: ímpar)
 */
public class GeraNumero implements Runnable {

    boolean paridade;

    public GeraNumero(){}

    public GeraNumero(boolean paridade){
        this.paridade = paridade;
    }

    @Override
    public void run() {

        while(true){
            try{
                System.out.println(gerador(paridade));

                if(paridade)
                    Thread.sleep(500);
                else
                    Thread.sleep(100);
            } catch (Exception e){}
        }
    }

    private int gerador(boolean p){
        int numero = new Random().nextInt(250);

        if((p && (numero % 2 != 0)) || (!p && (numero % 2 == 0)))
            return ++numero;

        return numero;
    }
}
