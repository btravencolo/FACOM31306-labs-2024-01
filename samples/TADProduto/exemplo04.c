#include <stdio.h>



// Função altera_preco
// Desc: modifica o preço de um *produto*
// Entrada:
//    preco: preço do produto
//    porcentagem: valor percentual a ser alterado, podendo 
//    ser negativo para diminuir valores
// Retorno:
//    0 - sucesso
//    -1 - erro
int altera_preco(float *preco, float porcentagem){
    float temp;

    if (porcentagem > -100) {
        temp = 1 + porcentagem/100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95 
        *preco = (*preco)*temp;  // preço modificado
        return 0;
    } else {
        return -1;
    }
}

int main()
{
    char nome[4][100];
    float preco[4];
    int qtd_estoque[4];

    for (int i = 0; i < 4; i++)
    {
        printf("\nInforme o nome, o preco e a qtd. em estoque do produto 1:\n");
        scanf("%s", nome[i]);
        scanf("%f", &preco[i]);
        scanf("%d", &qtd_estoque[i]);
    }


   printf("\nAumentando o preco em 10%% do produto 1 e 3");
   altera_preco(&preco[0],-110);
   altera_preco(&preco[2],10);

    preco[0] = preco[0]*-110;
   printf("\nReduzindo o preco em 5%% do produto 2");
   if (altera_preco(&preco[1],-5)==-1) 
     printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
   else printf("\n\n Preco alterado com sucesso");

   printf("\nAlterando o preco do prod. 3");
   if (altera_preco(&preco[3],-110) == -1)
      printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");

   printf("\nProdutos Cadastrados:\n");
   for (int i = 0; i < 4; i++){
     printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome[i],preco[i],qtd_estoque[i]);
   }

}
