#include <stdio.h>

int main(){
   char nome1[100],nome2[100],nome3[100],nome4[100];
   float preco1,preco2,preco3,preco4;
   int qtd_estoque1,qtd_estoque2,qtd_estoque3,qtd_estoque4;


   printf("\nInforme o preco o nome,  e a qtd. em estoque do produto 1:\n");
   scanf("%s",nome1);
   scanf("%f",&preco1);
   scanf("%d",&qtd_estoque1);

   printf("\nInforme o nome, o preco e a qtd. em estoque do produto 2:\n");
   scanf("%s",nome2);
   scanf("%f",&preco2);
   scanf("%d",&qtd_estoque2);

   printf("\nInforme o nome, o preco e a qtd. em estoque do produto 3:\n");
   scanf("%s",nome3);
   scanf("%f",&preco3);
   scanf("%d",&qtd_estoque3);

   printf("\nInforme o nome, o preco e a qtd. em estoque do produto 4:\n");
   scanf("%s",nome4);
   scanf("%f",&preco4);
   scanf("%d",&qtd_estoque4);


   printf("\nAumentando o preco em 10%% do produto 1 e 3");
   preco1 = preco1*1.1;
   preco3 = preco3*1.1;   


   printf("\nReduzindo o preco em 5%% do produto 2");
   preco2 = preco2*0.95;


   printf("\nProdutos Cadastrados:\n");
   printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome1,preco1,qtd_estoque1);
   printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome2,preco2,qtd_estoque2);
   printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome3,preco3,qtd_estoque3);
   printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome4,preco4,qtd_estoque4);


   return 0;
}