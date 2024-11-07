package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras = new ArrayList<>();

    public void adicionar(Figura figura){
        this.figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;

        for (Figura figuraDaVez: figuras) {

            soma += figuraDaVez.calcularArea();
        }

        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> areaMaior20 = new ArrayList<>();

        for (Figura figuraDaVez: figuras) {

            if (figuraDaVez.calcularArea() > 20){
                areaMaior20.add(figuraDaVez);
            }
        }

        return areaMaior20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();

        for (Figura figuraDaVez: figuras) {

            if (figuraDaVez instanceof Quadrado){
                quadrados.add(figuraDaVez);
            }
        }

        return quadrados;
    }
}

