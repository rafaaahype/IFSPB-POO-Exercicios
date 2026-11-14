# RESOLUÇÃO:

Questão 1:

O Java Collections Framework é uma coletânea de estruturas de dados diferentes com propósitos e comportamentos próprios. Ele disponibiliza interfaces e classes prontas para armazenar e manipular grupos de objetos, como listas, conjuntos e mapas.

Em relação aos arrays tradicionais, a vantagem é que essas coleções podem aumentar e diminuir de tamanho conforme precisamos, sem ter que criar outro array manualmente. Além disso, já possuem métodos para adicionar, remover e buscar elementos, facilitando o código. Dependendo da coleção escolhida, também podemos impedir valores repetidos, manter os elementos ordenados ou acessar um valor através de uma chave. Os arrays continuam sendo úteis quando o tamanho é fixo ou quando queremos armazenar tipos primitivos diretamente.

Questão 2:

* List: Mantém a sequência dos elementos, permite repetidos e dá acesso pela posição de cada um. Por exemplo, uma lista de músicas de uma playlist, onde a mesma música pode aparecer mais de uma vez.

* Set: Não permite elementos repetidos. A ordem depende da implementação utilizada. Podemos usar para armazenar os números de um sorteio, por exemplo, onde não queremos o mesmo número duas vezes.

* Map: Armazena pares de chave e valor. As chaves não podem se repetir, mas os valores podem. Por exemplo, um cadastro de usuários onde o e-mail seria a chave e o objeto do usuário seria o valor. Assim podemos encontrar cada usuário pelo e-mail. Diferente de List e Set, Map não herda da interface Collection, mas também faz parte do framework.
