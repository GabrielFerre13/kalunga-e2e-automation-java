# language: pt
Funcionalidade: Jornada de Compra e Validação do Carrinho na Kalunga

  Contexto:
    Dado que estou na página inicial da Kalunga

  @regressivo @ordenacao
  Cenário: Buscar produto e ordenar por menor preço
    E pesquiso pelo produto "Caderno"
    Quando aplico a ordenação por "3"
    E compro
    Entao volto para o inicio

