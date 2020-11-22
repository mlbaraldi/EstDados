PARTE1
Nesta etapa, você deve implementar uma representação dinâmica de  lista simplesmente encadeada com descritor, chamada ListaArquivos. As  seguintes atividades deverão ser desenvolvidas:
 1)     Adaptação de representação dos nós de uma lista simplesmente encadeada com descritor.
 Em geral, os nós de uma lista simplesmente encadeada contêm a seguinte estrutura:
 Tipo NoLista{
     inteiro dado;  // dado armazenado
     NoLista ref proximo;   // referência do próximo nó da lista
}
A estrutura de dados implementada nesta etapa deve ter a seguinte representação:
 Tipo NoLista{
     string dado;   // este campo será usado para armazenar o nome de um arquivo
     inteiro frequencia   // este campo será usado para armazenar um  número inteiro que corresponda à quantidade de vezes que um termo  aparece dentro do arquivo
     NoLista ref proximo;
}
Exemplo:
Considere a lista:
“Arquivo 55.txt“ (23) -> “Arquivo 12.txt” (14) -> “Arquivo 78.txt” (5)
Ela contém três nós, que estão ordenados por frequência (valores 23, 14 e 5).
2) Adaptação do método de busca sequencial na estrutura implementada.
2.1) Desenvolver um método que insira ordenadamente um arquivo na  lista com a sua frequência, utilizando a frequência como critério de  ordenação.
Exemplo:
Ao inserir o arquivo “Arquivo 65.txt” com frequência 8, a lista anterior se altera para o seguinte estado:
“Arquivo 55.txt“ (23) -> “Arquivo 12.txt” (14) -> “Arquivo 65.txt” (8)  ->  Arquivo 78.txt” (5)
2.2) Desenvolver um método que retorne a quantidade de vezes que um  termo aparece em um arquivo especificado. Deverá retornar 0 (zero) se o  arquivo não fizer parte da lista.
Exemplo:
Para a lista do item 2.1, o valor retornado para “Arquivo 12.txt” é 14.
Espera-se que você se familiarize com as representações e algoritmos baseados em listas lineares.



PARTE2

Nesta etapa, você deve implementar uma representação dinâmica de  árvore binária de busca (balanceada ou não, à sua escolha). As seguintes  atividades deverão ser desenvolvidas:
 1)     Adaptação de representação dos nós de árvore binária de busca.
Em geral, os nós de uma árvore binária contêm a seguinte estrutura: 
Tipo NoArvore{
     inteiro dado;  // dado armazenado
     NoArvore ref esquerda;     // referência da raiz da subárvore esquerda
     NoArvore ref direita;          // referência da raiz da subárvore direita 
}
A estrutura de dados implementada nesta etapa deve ter a seguinte representação:
Tipo NoArvore{
     String dado;   // este campo será usado para armazenar um termo que poderá ser utilizado em buscas
               ListaArquivos ref listaArquivos; // esta é uma lista  simplesmente encadeada implementada conforme especificação da etapa 1
                     NoArvore ref esquerda;
     NoArvore ref direita;
}
2)     Implementação da classe árvore binária com a seguinte  representação mínima (pode conter outras informações, se você achar  necessário): 
Tipo ArvoreBinariaBusca{
       NoArvore ref raiz;
}
3)     Implementação de um método de inserção na árvore que receba como entrada termo e nome_de_arquivo.
O termo deve ser usado como chave para inserção do nó na árvore. O  nome do arquivo será utilizado para incrementar a frequência daquele  termo para o arquivo especificado na lista de arquivos.
 Exemplo:
Considere uma árvore inicialmente vazia e a sequência de operações: 
Insere(“bola”, “arq1.txt”);
Insere(“casa”, “arq1.txt”);
Insere(“dado”, “arq1.txt”);
Insere(“bola”, “arq1.txt”);
Insere(“casa”, “arq1.txt”);
Insere(“dado”, “arq2.txt”);
Insere(“bola”, “arq2.txt”);
Insere(“arvore”, “arq2.txt”);
Ela produzirá a árvore binária de busca a seguir:
 

Figura 1 – Representação de árvore binária de busca para o buscador de arquivos.
 
Espera-se que você se familiarize com as representações e algoritmos  baseados em árvores, sendo capaz de estendê-los e adaptá-los.



PARTE 3
Nesta etapa, você deve implementar uma classe chamada Buscador com  métodos iniciais, que permitam identificar os arquivos que possuem  determinados termos. Os itens a ser implementados são os seguintes:
1) A classe Buscador deve ter a seguinte estrutura mínima (pode ter informações adicionais, se achar necessário):
Tipo Buscador{
        ArvoreBinariaBusca ref arvoreArquivos;
}
2) Implementação de um método de busca na árvore que receba  como entrada um termo e retorne a referência da lista de arquivos que  contém aquele termo. O método principal a ser desenvolvido nessa classe deve ser o seguinte:
ListaArquivos busca(String termo)
Considerando a árvore representada na Figura 1, a busca pelo termo “bola” deve retornar a lista: 
“arq1“ (2) -> “arq2” (1)
Espera-se que você se familiarize com técnicas de busca em árvores.



PARTE4
Nesta etapa, você deve utilizar o método de busca da etapa 3 para  desenvolver um método que trabalhe com vários termos. Além disso, uma  interface mínima de interação com o usuário deve permitir entrada e  saída de dados, de forma a mostrar o resultado final da atividade de  forma ordenada. Os itens a ser implementados são os seguintes:
1)     Método que receba um conjunto de termos representados  em vetor e realize a busca por arquivos na estrutura desenvolvida na  etapa 3. O método deve ter a seguinte assinatura:
ListaArquivos buscaTermos(String[] termos)
Como resultado, cada arquivo deve aparecer uma única vez na saída,  correspondendo a sua relevância à soma de ocorrências dos termos usados  na busca. Um algoritmo de ordenação de complexidade não quadrática  deverá ser implementado, de forma a apresentar os arquivos mais  relevantes primeiro. Como exemplo, considere a Figura 1 da etapa 2. A  busca pelos termos “bola” e “casa” deve retornar a seguinte lista  (ordenada por relevância): 
“arq1” (4)
“arq2” (1)
2)     Interface com o usuário (sugere-se modo caractere, por facilidade) que permita realizar buscas. Como exemplo de interação, sugere-se o seguinte modelo:
"Entre com os termos a ser pesquisados (separados por espaço):"
árvore dado
 "Os arquivos encontrados foram:"
Arquivo: “arq2”      Relevância:2
Arquivo: “arq1”      Relevância:1
Espera-se que você se familiarize com aplicações que necessitam integrar técnicas de busca e ordenação.
