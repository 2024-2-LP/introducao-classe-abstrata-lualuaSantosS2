package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    public Quadrado(){

    }

    public Quadrado(Double lado, String cor, Integer espessura){
        this.lado = lado;
        this.setCor(cor);
        this.setEspessura(espessura);
    }

    @Override
    public Double calcularArea() {
        return lado*lado;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
