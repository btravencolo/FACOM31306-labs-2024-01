#include <stdio.h>
#include "produto_e07.h"

int main()
{
    produto p[4];
    
    for (int i = 0; i < 4; i++)
    {
        printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n",i+1);
        scanf("%s", p[i].nome);
        scanf("%f", &p[i].preco);
        scanf("%d", &p[i].qtd_estoque);
    }


   printf("\nAumentando o preco em 10%% do produto 1 e 3");
   altera_preco(&p[0],10);
   altera_preco(&p[2],10);
   

   printf("\nReduzindo o preco em 5%% do produto 2");
   if (altera_preco(&p[1],-5)==-1) 
     printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
   else printf("\n\n Preco alterado com sucesso");

   printf("\nAlterando o preco do prod. 3");
   if (altera_preco(&p[3],-110) == -1)
      printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");

   printf("\nProdutos Cadastrados:\n");
   for (int i = 0; i < 4; i++){
     printf("\nProduto: %s\nPreco: %f\nEstoque: %d", p[i].nome,p[i].preco,p[i].qtd_estoque);
   }

}

