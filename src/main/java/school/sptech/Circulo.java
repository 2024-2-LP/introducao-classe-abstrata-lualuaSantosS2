package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){

    }
    public Circulo(Double raio, String cor, Integer espessura){
        this.raio = raio;
        this.setCor(cor);
        this.setEspessura(espessura);
    }

    @Override
    public Double calcularArea() {
        return Math.PI*(raio*raio);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
