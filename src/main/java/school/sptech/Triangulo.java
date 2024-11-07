package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(){

    }

    public Triangulo(Double base, Double altura, String cor, Integer espessura){
        this.altura = altura;
        this.base = base;
        this.setCor(cor);
        this.setEspessura(espessura);
    }

    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
