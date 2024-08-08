#include <stdio.h>

int main(){
   char nome[100];
   float preco;
   int qtd_estoque;

   printf("\nInforme o nome, o preco e a qtd. em estoque do produto:\n");
   scanf("%s",nome);
   scanf("%f",&preco);
   scanf("%d",&qtd_estoque);
   
   printf("\nAumentando o preco em 10%%");
   preco = preco*1.1;

   printf("\nReduzindo o preco em 5%%");
   preco = preco*0.95;

   printf("\nProdutos Cadastrados:\n");
   printf("%s\nPreco: %f\nEstoque: %d", nome,preco,qtd_estoque);

   return 0;
}