package entities;

public class PessoaEX2 {

    private String name;
    private double av1;
    private double av2;

    public PessoaEX2(String name, double av1, double av2) {
        this.name = name;
        this.av1 = validarNum(av1);
        this.av2 = validarNum(av2);
    }
    public double validarNum(double valor) {
        return (valor < 0)? 0 : valor;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAv1() {
        return av1;
    }

    public void setAv1(double av1) {
        this.av1 = av1;
    }

    public double getAv2() {
        return av2;
    }

    public void setAv2(double av2) {
        this.av2 = av2;
    }
}
