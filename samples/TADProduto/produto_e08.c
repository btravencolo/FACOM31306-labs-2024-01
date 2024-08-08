#include "produto_e08.h"
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

struct produto
{
    char nome[100];
    float preco;
    int qtd_estoque;
};

// Retorno
// Ponteiro para o produto criado
// ou NULL em caso de erro

produto *cria_produto(char *nome, float preco, int qtd)
{
    produto *p;
    p = (produto *) malloc(1 * sizeof(produto));
    if (p != NULL)
    {
        strcpy(p->nome, nome);
        p->preco = preco;
        p->qtd_estoque = qtd;
    }
    return p;
};

// retorno
// -1 em caso de erro
// 0 em caso de sucesso
int get_prod_info(produto *p, char *nome, float *preco, int *qtd)
{
    if (p != NULL)
    {
        *preco = p->preco;
        strcpy(nome, p->nome);
        *qtd = p->qtd_estoque;
        return 0;
    }
    else
    {
        return -1;
    }
}

int destroi_produto(produto *p)
{
    if (p == NULL)
        return -1;
    else
    {
        free(p);
        return 0;
    }
}

void imprime_produto(produto *p)
{
    printf("\nProduto: %s\nPreco: %f\nEstoque: %d", p->nome, p->preco, p->qtd_estoque);
}

// Função altera_preco
// Desc: modifica o preço de um *produto*
// Entrada:
//    preco: preço do produto
//    porcentagem: valor percentual a ser alterado, podendo
//    ser negativo para diminuir valores
// Retorno:
//    0 - sucesso
//    -1 - erro
int altera_preco(produto *prod, float porcentagem)
{
    float temp;

    if (porcentagem > -100)
    {
        temp = 1 + porcentagem / 100; // 10 >>> 1 + 10/100 = 1.1  ;; -5  =>> 1 + (-5/100) 0.95
        // (*prod).preco = (*prod).preco *temp;  // preço modificado
        //ou
        prod->preco = prod->preco * temp;
        return 0;
    }
    else
    {
        return -1;
    }
}
