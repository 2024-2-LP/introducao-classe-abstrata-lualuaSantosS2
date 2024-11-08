package school.sptech;

public abstract class Figura {

    private String cor;
    private Integer espessura;

    public abstract Double calcularArea();

    @Override
    public String toString() {
        return super.toString();
    }

    public String getCor() {
        return cor;
    }

    public Integer getEspessura() {
        return espessura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setEspessura(Integer espessura) {
        this.espessura = espessura;
    }
}
