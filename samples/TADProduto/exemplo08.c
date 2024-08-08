#include <stdlib.h>
#include <stdio.h>
#include "produto_e08.h"

int main()
{
  
  char nome[100];
  float preco_ant, preco_at;
  int qtd;
  printf("\nInforme o nome, o preco e a qtd. em estoque do produto");
  scanf("%s", nome);
  scanf("%f", &preco_ant);
  scanf("%d", &qtd);
  
 
  produto *p;

  p = cria_produto(nome,preco_ant,qtd);

  altera_preco(p, 10); 

  get_prod_info(p,nome, &preco_at, &qtd);

  imprime_produto(p);
  printf("\n\npreco antes: %f, preco depois: %f", preco_ant, preco_at);
  destroi_produto(p);

  //   (*p).nome
  //    printf("\nProduto: %s\nPreco: %f\nEstoque: %d", p->nome,p->preco,p->qtd_estoque);

  /*
    printf("\nInforme o nome, o preco e a qtd. em estoque do produto:\n");
    scanf("%s", p->nome);
    scanf("%f", &p->preco);
    scanf("%d", &p->qtd_estoque);
*/

  /*
    produto p[4];

    produto *prod
    
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
  
  p[3].preco = -10;


   printf("\nProdutos Cadastrados:\n");
   for (int i = 0; i < 4; i++){
     printf("\nProduto: %s\nPreco: %f\nEstoque: %d", p[i].nome,p[i].preco,p[i].qtd_estoque);
   }
*/
}
