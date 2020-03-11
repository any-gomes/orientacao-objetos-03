package exercicios;

public class Circulo {
    private Double raio;

    public Circulo(Double raio) {
        this.setRaio(raio);
    }

    public void setRaio(Double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("Raio deve ser positivo");
        }
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public Double calcularArea(){
        return (raio * raio) * 3.0;
    }
    public Double calcularPerimetro(){
        return (2.0 * raio) * 3.0;
    }
}
