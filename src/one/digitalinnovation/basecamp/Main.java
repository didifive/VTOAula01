package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */
public class Main {

    public static void main(String[] args) {

        int i;
        //int i;
        /* A declaração da variável acima gera erro de compilação por estar declarando novamente a mesma variável. */
        int I;
        //int 1a;
        /* A declaração da variável acima gera erro de compilação por estar iniciando com número. */
        int _1a;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas deve-se evitar o uso do caractere _. */
        int $aq;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas deve-se evitar o uso do caractere $. */

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j = 15;
        /* A atribuição de valor acima gera erro de compilação, pois a variável é "final", o que indica ser uma constante, não se muda o valor */
        int asrn24678md;
        //int asrn246 78md;
        /* A declaração da variável acima gera erro de compilação por possuir o caractere de espaço no nome da variável */
        int asrn2$4678_md = 10;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas deve-se evitar o uso dos caracteres $ e _. */
        //int asrn2$46%78_md = 10;
        /* A declaração da variável acima gera erro de compilação por possuir o caractere % no nome da variável */

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas não deve-se iniciar variável com letra maiúscula. */
        final int NUMERO_TENTATIVAS = 5;
        /* A excessão sobre letra maiúscula se dá quando é declarada variável constante, "final", no caso todos os caracteres são maiúsculos e se utiliza o _. */
        //final int numeroTentativas = 5;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas deve-se utilizar letras maiúsculas para variáveis constantes. */
        int QUANTIDADE_OPCOES = 25;
        /* A declaração da variável acima não gera erro de compilação, mas por boas práticas deve-se utilizar camelCase, iniciando por letra minúscula. */
        //int qtdProd;
        /* A declaração da variável acima não gera erro de compilação, mas não segue a boa prática de expressividade no nome da variável. */

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }
}
