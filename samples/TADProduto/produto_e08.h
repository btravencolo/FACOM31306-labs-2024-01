typedef struct produto produto;

produto* cria_produto(char *nome, float preco, int qtd);
int destroi_produto(produto *p);

void imprime_produto(produto *p);
int altera_preco(produto *prod, float porcentagem);
int get_prod_info(produto *p, char *nome, float *preco, int *qtd);