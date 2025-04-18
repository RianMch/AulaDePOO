package atividades17_04;

public class main {
    public static void main(String[] args) {
        Funcionario dev=new Desenvolvedor("Rian",2000);
        Funcionario esta=new Estagiario("Gabriel",2000);
        Funcionario gerente=new Gerente("G1",2000,200);

        dev.calcularSalario();
        esta.calcularSalario();
        gerente.calcularSalario();
        System.out.println(gerente.calcularSalario()); ;
        esta.exibirDados();
        gerente.exibirDados();
    }
}
