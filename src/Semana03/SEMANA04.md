# Resolução

Questão 4:
a) A alocação de memória do array de tipos primitivos (int[] e double[] por ex)
o espaço de memória alocado armazena diretamente os valores reais de forma contínua. 
Enquanto no array de objetods (Aluno[] e Produto[] por ex) armazena apenas as referências
(os endereços de memória) que apontam para os objetos reais localizados na memória (heap).
Por defeito, todas as posições começam no valor 

b) Deve-se verificar que o elemento não é null antes de invocar métodos ou aceder atributos para
evitar erros e inicializar o array (ex Aluno[5]) apenas cria o contentor de referências, cada
objeto individual precisa ser instanciado separamente (ex array[0] new Aluno()) antes de poder
ser utilizado.
