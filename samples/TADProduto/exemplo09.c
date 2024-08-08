#include <stdlib.h>
#include <stdio.h>
#include "produto_e08.h"

int main()
{

  char nome[100];
  float preco_ant, preco_at;
  int qtd;
  produto *p[4];
  

  produto *prod_especial;
  prod_especial = cria_produto("especial",100000,1);
  destroi_produto(prod_especial);


  for (int i = 0; i < 4; i++)
  {
    printf("\nInforme o nome, o preco e a qtd. em estoque do produto %d:\n", i + 1);
    scanf("%s", nome);
    scanf("%f", &preco_ant);
    scanf("%d", &qtd);
    p[i] = cria_produto(nome, preco_ant, qtd);
  }

  printf("\nAumentando o preco em 10%% do produto 1 e 3");
  altera_preco(p[0], 10);
  altera_preco(p[2], 10);

  printf("\nReduzindo o preco em 5%% do produto 2");
  if (altera_preco(p[1], -5) == -1)
    printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");
  else
    printf("\n\n Preco alterado com sucesso");

  printf("\nAlterando o preco do prod. 3");
  if (altera_preco(p[3], -110) == -1)
    printf("\n\nErro: preco nao alterado. Porcentagem invalida\n");

  printf("\nProdutos Cadastrados:\n");
  for (int i = 0; i < 4; i++)
  {
    get_prod_info(p[i], nome, &preco_at, &qtd);
    printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome, preco_at, qtd);
  }

  for (int i = 0; i < 4; i++)
  {
    destroi_produto(p[i]);
  }

}
