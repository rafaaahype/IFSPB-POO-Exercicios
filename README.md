# IFSPB-POO-Exercicios
Repositório da disciplina de Programação Orientada a Objetos
----
# Resolução 
Questão 5:
O Scanner é utilizado na entrada de dados em Java instanciando ele com a seguinte linha de 
comando: Scanner scanner = new Scanner(System.in);

Ele pode ser utilizado para ler diversos tipos de arquivo, bastando apenas o programador
chamar um  método dentro da instância do objeto correspondente ao tipo de dado que deseja que 
o usuário insira. Nesse sentido, eis aqui um exemplo caso o programador queira 
receber um inteiro: scanner.nextInt();

O System.out.printf é uma excelente opção para retornar ao usuário algumas informações 
processadas pelo programa de uma forma computacionalmente mais leve do que comparada com a 
concatenação, além do programador ter um escopo maior de controle, como especificar a 
quantidade de casas decimais que será retornada pela formatação.

Implementação prática do Scanner e System.out.printf() : 

```java
import java.util.Scanner;

public class Teste{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();
        System.out.printf("%.2f \n", numero);
    }
}
```

Questão 6:

Análise do Código Errado:

```java
import java.util.Scanner;

public class Contador {
    public static void main(String args) { // <-- Erro 1 (Declaração Errada)
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while (contador <= 5) { // <-- Erro 2 (Lógica Errada)
            System.out.println("Contador: " + contador) // <-- Erro 3 (Sintaxe Errada)
        }
    }
}
```

Explicação do Erros:
* Erro 1: A declaração do método principal está errada, especificamente nos parâmetros do 
método, os parâmetros certos a serem inseridos são: String[] args

* Erro 2: A lógica do loop while está errado, tornando-o infinito, pois a variável de controle
não é atualizada.

* Erro 3: O código não coloca um : sinalizando o fim dessa instrução para que a compilação 
possa passar para a próxima, causando um erro de sintaxe.

Código Corrigido:

```java
import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        while(contador <= 5){
            System.out.println("Contador: " + contador);
            contador++;
        }
    }
}
```
