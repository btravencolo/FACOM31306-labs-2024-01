#include <stdio.h>

int main()
{
    char nome[4][100]; // >>> String nome[] = new String[4];
    float preco[4];
    int qtd_estoque[4]; // <<<>>>> int qtd_estoque[] = new int[4] 

    for (int i = 0; i < 4; i++)
    {
        printf("\nInforme o nome, o preco e a qtd. em estoque do produto 1:\n");
        scanf("%s", nome[i]); // >>>> nome[i] = entrada.nextLine();
        scanf("%f", &preco[i]); // >>> preco[i] = entrada.nextFloat()
        scanf("%d", &qtd_estoque[i]); >>>
    }
   printf("\nAumentando o preco em 10%% do produto 1 e 3");
   preco[0] = preco[0]*-1.1;
   preco[2] = preco[2]*1.1;   

   printf("\nReduzindo o preco em 5%% do produto 2");
   preco[1] = preco[1]*0.95;

   printf("\nProdutos Cadastrados:\n");
   for (int i = 0; i < 4; i++){
     printf("\nProduto: %s\nPreco: %f\nEstoque: %d", nome[i],preco[i],qtd_estoque[i]);
   }

}
