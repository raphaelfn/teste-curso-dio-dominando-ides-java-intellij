package curso.java;

public class main {

    public static void main(string[] args) {

        // calculadora
        System.out.println("Exercício Calculadora");
        calculadora.soma(3, 6);
        calculadora.subtracao(5, 2.5);
        calculadora.multiplicacao(7, 8);
        calculadora.divisao(10, 5);

        // Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
