
typedef struct produto produto;

struct produto {
    char nome[100];
    float preco;
    int qtd_estoque;
};

int altera_preco(produto *prod, float porcentagem);