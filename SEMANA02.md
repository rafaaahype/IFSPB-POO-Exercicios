# Resolução
Questão 1:
É considerado uma boa prática usar getters e setters ao invés de tornar os atributos públicos por causa que isso deixa a nossa classe em questão mais segura e os atributos de menos acesso. Por exemplo, quando se usa um getter para retornar algum atributo em específico da classe, podemos antes de dar o retorno do valor, tratar o dado com uma série de procedimentos que a outra classe que chamou o método do getter não sabe exatamente como aquela informação foi tratada, assim deixando a classe com certa privacidade e menos vulnerável, quando chamamos direto no atributo, isso não dá margem pro método se quer tratar o valor. Esta mesma ideia é aplicada ao set, quando setamos direto no atributo, isso não dá chance de tratarmos a modificação de forma mais segura pelo método, quando ele é modificado direto pelo atributo.

Questão 2:

a) Título, Autor, Editora, Gêneros, Data de Publicação, Páginas, Quantidade de Cópias
b) Porque essa classe seria um modelo (uma abstração) que serviria como base para instanciar outros livros a partir desses atributos base.
c) Checar a disponibilidade (conferir se há alguma cópia na biblioteca disponível desse título para aluguel), Alugar e Devolução do livro.
