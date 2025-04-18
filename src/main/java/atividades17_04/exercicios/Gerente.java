package atividades17_04;

public class Gerente extends Funcionario{
    private double adicional;

    public Gerente(String nome, double salario,double adicional) {
        super(nome, salario);
        this.adicional=adicional;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    @Override
    public double calcularSalario() {
        return adicional+getSalario();
    }
}
