# TESTE PRÁTICO PROGRAMAÇÃO JAVA

Aplicação criada com as seguintes instruções:

> Considerando que uma indústria possui as pessoas/funcionários abaixo:

```csv
Nome,Data Nascimento, Salário, Função,
Maria,18/10/2000,2009.44,Operador,
João,12/05/1990,2284.38,Operador,
Caio,02/05/1961,9836.14,Coordenador,
Miguel,14/10/1988,19119.88,Diretor,
Alice,05/01/1995,2234.68,Recepcionista,
Heitor,19/11/1999,1582.72,Operador,
Arthur,31/03/1993,4071.84,Contador,
Laura,08/07/1994,3017.45,Gerente,
Heloísa,24/05/2003,1606.85,Eletricista,
Helena,02/09/1996,2799.93,Gerente

```

## Diante disso, você deve desenvolver um projeto java, com os seguintes requisitos

- [x] 1– Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

- [x] 2 – Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

- [x] 3 – Deve conter uma classe Principal para executar as seguintes ações:
  - [x] 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
  - [x] 3.2 – Remover o funcionário “João” da lista.
  - [x] 3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:

      • informação de data deve ser exibido no formato dd/mm/aaaa;

      • informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.

  - [x] 3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
  - [x] 3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
  - [x] 3.6 – Imprimir os funcionários, agrupados por função.
  - [x] 3.7 – Este ponto foi omitido nas instruções recebidas.
  - [x] 3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
  - [x] 3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
  - [x] 3.10 – Imprimir a lista de funcionários por ordem alfabética.
  - [x] 3.11 – Imprimir o total dos salários dos funcionários.
  - [x] 3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

## Para rodar o projeto

É necessário ter o jdk-11 instalado.

---
