# sistema-de-cadastro
próximos passos:

Para o TIPO e SEXO do pet, você deverá usar ENUM.
Na pergunta sobre o endereço, você deverá perguntar:
Número da casa
Cidade
Rua
Na idade e peso aproximados do pet, o usuário poderá digitar números com vírgulas ou ponto, mas somente números.
Caso o usuário digite um peso maior que 60kg ou um peso menor que 0.5kg, lance uma exceção.  # OK
Caso o usuário digite uma idade maior que 20 anos, lance uma exceção.
Caso o usuário digite uma idade menor que 1 ano (idade em meses), transforme em 0.x anos.
No campo raça o usuário não poderá usar números nem caracteres especiais.
Nas perguntas sobre NOME, RAÇA, PESO, IDADE e ENDEREÇO (somente o campo número), caso o usuário NÃO INFORME ou deixe em branco, você deverá preencher com NÃO INFORMADO (deve ser uma constante)!