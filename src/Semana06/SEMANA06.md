# RESOLUÇÃO:

Questão 1:

O Java Collections Framework é uma coletânea de estruturas de dados diferentes com propósitos e comportamentos próprios. Ele disponibiliza interfaces e classes prontas para armazenar e manipular grupos de objetos, como listas, conjuntos e mapas.

Em relação aos arrays tradicionais, a vantagem é que essas coleções podem aumentar e diminuir de tamanho conforme precisamos, sem ter que criar outro array manualmente. Além disso, já possuem métodos para adicionar, remover e buscar elementos, facilitando o código. Dependendo da coleção escolhida, também podemos impedir valores repetidos, manter os elementos ordenados ou acessar um valor através de uma chave. Os arrays continuam sendo úteis quando o tamanho é fixo ou quando queremos armazenar tipos primitivos diretamente.

Questão 2:

* List: Mantém a sequência dos elementos, permite repetidos e dá acesso pela posição de cada um. Por exemplo, uma lista de músicas de uma playlist, onde a mesma música pode aparecer mais de uma vez.

* Set: Não permite elementos repetidos. A ordem depende da implementação utilizada. Podemos usar para armazenar os números de um sorteio, por exemplo, onde não queremos o mesmo número duas vezes.

* Map: Armazena pares de chave e valor. As chaves não podem se repetir, mas os valores podem. Por exemplo, um cadastro de usuários onde o e-mail seria a chave e o objeto do usuário seria o valor. Assim podemos encontrar cada usuário pelo e-mail. Diferente de List e Set, Map não herda da interface Collection, mas também faz parte do framework.

Questão 3:

* HashSet:
-> Ordem: Não garante a ordem dos elementos.
-> Busca, inserção e remoção: O(1) em média, considerando uma boa distribuição dos hashes. Colisões podem piorar esse desempenho.
-> Memória: Usa uma tabela hash para armazenar os elementos, com espaço para os buckets e entradas.

* LinkedHashSet:
-> Ordem: Mantém a ordem em que os elementos foram inseridos.
-> Busca, inserção e remoção: O(1) em média, com a mesma ressalva sobre os hashes.
-> Memória: Geralmente usa mais memória que o HashSet, pois também mantém os links entre os elementos para preservar a ordem de inserção.

* TreeSet:
-> Ordem: Mantém os elementos ordenados pela ordem natural ou por um Comparator.
-> Busca, inserção e remoção: O(log n), pois usa uma árvore balanceada.
-> Memória: Usa nós com referências para outros nós da árvore e informações de balanceamento. A comparação exata com o HashSet depende da quantidade de elementos e da capacidade da tabela, então não dá para dizer que um sempre ocupa mais que o outro. As três implementações usam O(n) de memória.

----

As questões práticas estão nos arquivos SistemaUsuarios.java, Navegador.java e Questao6.java desta pasta.
