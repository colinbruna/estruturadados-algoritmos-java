# Material do curso estrutura de dados com Java - loiane.training

## Código, exercícios e meus comentários de aula

### Vetores, Arrays e Listas

Aula 1 - Introdução a Estrutura de Dados e Algoritmos

Aula 2 - Vetores e Arrays: Introdução
* Definição de vetor(array) é a estrutura de dados mais simples que existe. 
* Um vetor armazena uma sequência de valores onde todos são do mesmo tipo.

Aula 3 - Adicionar elemento no final do vetor

Aula 4 - Verificar tamanho e imprimir elementos

Aula 5 - Obter elemento de uma posição

Aula 6 - Busca sequencial

Aula 7 - Adicionar elemento em qualquer posição

Aula 8 - Adicionar capacidade ao vetor

Aula 9 - Remover elemento do vetor

Aula 10 - Generalizando o tipo do vetor

Aula 11 - Generics

Aula 12 - API Java ArrayList
* A classe ArrayList é a classe nativa do Java que pertence ao pacote java.util, e essa classe é similar a estrutura de dados implementada em aula.

Exercício 1 - Melhorar a classe Lista e implementar o método contém, semelhante ao método contains da classe ArrayList.

Exercício 2 - Melhorar a classe Lista e implementar o método ultimoIndice, semelhante ao método lastInfexOf da classe ArrayList.

Exercício 3 - Melhorar a classe Lista e implementar o método remove(T elemento), onde será possível remover um elemento da lista passando o mesmo como parâmetro.

Exercício 4 - Melhorar a classe Lista e implementar o método obtem(int posicao), onde será possível obter o elemento dada uma posição do vetor. Esse método é semelhante ao método get(int posicao) da classe ArrayList.

Exercício 5 - Melhorar a classe Lista e implementar o método limpar, onde todos os elementos da lista são removidos. Esse método é semelhante ao método clear da classe ArrayList.

Exercício 6 - Utilize a classe Lista ou Vetor e a classe Contato (criada durante as aulas) e desenvolva os seguintes itens: 1. Crie um vetor com capaciadade para 20 contatos; 2. Insira 30 contatos no vetor (isso é possível ser feito através de um loop); 3. Crie um exemplo para utilizar cada método da classe Lista.

Exercício 7 - Utilize a classe ArrayList e desenvolva os seguintes itens: 1. Crie uma lista utilizando a classe ArrayList da API do Java; 2. Passe todos os contatos do vetor para o ArrayList; 3. Crie um exemplo para utilizar cada método da classe ArrayList (somente métodos que implementamos de forma similar na classe Lista).

### Pilhas
Aula 13 - Introdução

* LIFO - Last In First Out

Aula 14 - Empilhar elementos - push

Aula 15 - Verificar pilha vázia

Aula 16 - Espiar/Verificar elemento do topo - peek

Aula 17 - Desempilhar elemento - pop

Aula 18 - API Java Stack

Exercício 1 - Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir: 1. Se o número for par, empilhe na pilha; 2. Se o número for ímpar, desempilhe um número da pilha, caso a pilha esteja vázia, mostre uma mensagem; 3. Se ao final do programa a pilha não estiver vázia, desempilhe todos os elementos e imprima-os na tela.

Exercício 2 - Escreva um programa que leia 10 números. Para cada número lido, verifique e codifique de acordo com as regras a seguir: 1. Se o número for par, empilhe na pilha chamada par; 2. Se o número for ímpar, empilhe na pilha chamada ímpar; 3. Se o número for zero, desempilhe um elemento de cada pilha; 4. Caso alguma pilha esteja vázia, mostre uma mensagem de erro na tela; 5. Ao final do programa desempilhe todos os elementos das duas pilhas e imprima-os na tela.

Exercício 3 - Utilize a pilha (criada durante as aulas) e desenvolva os seguintes itens: 1. Crie uma pilha com capacidade para 20 livros; 2. Insira 6 livros na pilha, cada livro contém: nome, isbn, ano de lançamento e autor; 3. Crie um exemplo para utilizar cada método da classe pilha.

Exercício 4 - Repita o mesmo processo do exercício anterior, porém usando a classe stack da API Java. 1. Crie uma pilha com capacidade para 20 livros; 2. Insira 6 livros na pilha, cada livro contém: nome, isbn, ano de lançamento e autor;   3. Crie um exemplo para usar cada método da classe stack 

Exercício 5 - Escreva um programa que testa se uma sequencia de caracteres fornecida é um palíndromo, ou seja, é uma palavra cuja primeira metade é simétrica com a segunda metade. Ex.: 1. AABCCBAA SIM; 2. ADDFDDA SIM; 3. ABFFBB NÃO;

Exercício 6 - Escreva um programa para verificar se uma expressão matemática tem os parenteses agrupados de forma correta, isto é: 1. Se o numero de parenteses a direita e a esquerda são iguais e; 2. se todo parentese aberto é seguido posteriormente por um fechamento de parentese.

Exercício 7 - Usando a classe pilha ou stack, desenvolva um algoritmo que faça a conversão de números decimais para binário.

Exercício 8 - Usando a classe pilha ou stack, desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi.

### Filas
Aula 19 - Introdução

* FIFO - First In First Out

Aula 20 - Adicionando um novo elemento na fila - enqueue

Aula 21 - Verificando o elemento que está no ínicio da fila - peek

Aula 22 - Retirando um elemento da fila - dequeue

Aula 23 - Classe fila da API Java Collections

* Podemos instanciar qualquer classe que implemente uma interface, e oe métodos que estarão disponíveis para utilizar naquela classe, serão os métodos que foram declarados naquela interfce.

Aula 24 - Filas com prioridade

Aula 25 - API Java - Priority Queue

Exercício 1 - Usando a estrutura de dados fila, crie uma fila de documentos que precisam ser impressos. Cada documento é composto de um nome e quantidade de folhas a serem impressas. O programa deve: 1- Enfileirar os documentos; 2- E seguindo a ordem, o programa deve imprimir cada documento, desenfileirando da fila. Se desejar pode usar Threads para esperar a impressão de acordo com o numero de folhas a serem impressas.

Exercício 2 - Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas. Cada pessoa pode receber uma senha prioritária ou uma senha normal. O programa deve obedecer os seguintes critérios: 1- Existe apenas um atendente; 2- 1 pessoa com senha normal deve ser atendidida a cada 3 pessoas com senha prioritária; 3- Não havendo prioridades, as pessoas com senha normal podem ser atendidas.

Exercício 3 - Utilize a classe fila para simular um sistema de senhas de um pronto-socorro. Cada pessoa pode ser classificada em três códigos: vermelho: de prioridade maior, amarelo: de prioridade média e verde: quando a situação não é grave e a pessoa pode esperar mais tempo. O programa deve obedecer as seguintes condições: 1- Enfileire 6 pessoas na fila inicial; 2- Pessoas com prioridade vermelha devem ser atendidas primeiro; 3- Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado; 4- A cada 4 segundos, uma pessoa chega no pronto-socorro com prioridade aleatória (crie um código para criar a aleatoriedade).

Exercício 4 - Escreva um programa usando Filas que simule a brincadeira da "Batata Quente". A brincadeira consiste de um grupo de crianças que fica em círculo, sentados ou em pé. Uma criança fica fora da roda, de costas ou com os olhos vendados, dizendo a frase: "Batata quente, quente, quente... queimou!" Enquanto isso, os demais vão passando a bola de mão em mão até ouvir a palavra "queimou". Quem estiver com a bola nesse momento sai da roda. Ganha o último que sobrar.