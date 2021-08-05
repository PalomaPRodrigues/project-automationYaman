#language: pt
#encoding: UTF-8
#Author: Paloma Pedro Rodrigues
#date:02/08/2021
#version: 1.0

Funcionalidade:
Como um usuario do site brilhoso
Quero fazer login
Para  que eu possa realizar compras

Esquema do Cenario: Login com sucesso
Dado que estou na pagina home do site
E clico entrar
E preencho campo e-mail "<email>"
E preencho campo senha "<senha>"
Quando seleciono entrar
Entao valido se estou logado com sucesso

Exemplos:
|email                     |senha  |
|paloma.gpedro@hotmail.com |pwd1222|


