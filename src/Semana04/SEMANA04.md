# RESOLUÇÃO

Questão 1:

a) Verdadeira
b) Falsa. O relacionamento "tem um" é implementado via composição ou agregação. A herança é utilizada para implementar o relacionamento "é um"
c) Falsa. Isso se chama sobrescrita. A sobrecarga (overload) ocorre quando dois métodos possuem o mesmo nome, mas assinaturas (parâmetros) diferentes.

Questão 2:

* Acesso Protected
-> Vantagem : Dá acesso direto aos membros da super classe para as subclasses, eliminando a necessidade de métodos intermediários(getters/setters) e 
simplificando o código
-> Desvantagem: Cria um acoplamento forte. Se a implementação ou o tipo do campo protected mudar na superclasse, o código de todas as subclasses diretamente dependentes podem quebrar.

* Acesso Private:
-> Vantagem: Mantém o encapsulamento rígido. A superclasse detém o controle absoluto sobre suas variáveis e regras de validação. Alterações internas na superclasse não quebram as subclasses, desde que a interface dos métodos públicos/protegidos continue a mesma.
-> Desvantagem: Exige que as subclasses utilizem métodos de acesso (getters/setters) para manipular o estado.

Questão 3:
Chamada de Construtores em Hierarquias de Herança

Como funciona: A execução dos construtores ocorre de cima para baixo na hierarquia (da superclasse mais genérica até a subclasse mais específica).

Por que é obrigatório: A subclasse depende do estado e das variáveis definidas pela superclasse. Chamá-lo garante que a parte ancestral do objeto seja completamente inicializada e válida antes que a subclasse execute suas próprias inicializações.
