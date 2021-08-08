$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/feature/login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    },
    {
      "line": 2,
      "value": "#encoding: UTF-8"
    },
    {
      "line": 3,
      "value": "#Author: Paloma Pedro Rodrigues"
    },
    {
      "line": 4,
      "value": "#date:02/08/2021"
    },
    {
      "line": 5,
      "value": "#version: 1.0"
    }
  ],
  "line": 8,
  "name": "Validar se o usuario está logado",
  "description": "Como um usuario do site brilhoso\nQuero fazer login\nPara  que eu possa realizar compras",
  "id": "validar-se-o-usuario-está-logado",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Login com sucesso",
  "description": "",
  "id": "validar-se-o-usuario-está-logado;login-com-sucesso",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "que estou na pagina home do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "clico entrar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "preencho campo e-mail \"\u003cemail\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho campo senha \"\u003csenha\u003e\"",
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "seleciono entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "valido login com sucesso \"\u003cmsgFinal\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "validar-se-o-usuario-está-logado;login-com-sucesso;",
  "rows": [
    {
      "cells": [
        "email",
        "senha",
        "msgFinal"
      ],
      "line": 22,
      "id": "validar-se-o-usuario-está-logado;login-com-sucesso;;1"
    },
    {
      "cells": [
        "paloma.gpedro@hotmail.com",
        "pwd1222",
        "Informações de Contato"
      ],
      "line": 23,
      "id": "validar-se-o-usuario-está-logado;login-com-sucesso;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.before({
  "duration": 302000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Login com sucesso",
  "description": "",
  "id": "validar-se-o-usuario-está-logado;login-com-sucesso;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "line": 14,
  "name": "que estou na pagina home do site",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "clico entrar",
  "keyword": "E "
});
formatter.step({
  "line": 16,
  "name": "preencho campo e-mail \"paloma.gpedro@hotmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "E "
});
formatter.step({
  "line": 17,
  "name": "preencho campo senha \"pwd1222\"",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 18,
  "name": "seleciono entrar",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "valido login com sucesso \"Informações de Contato\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroStep.queEstouNaPaginaHomeDoSite()"
});
formatter.result({
  "duration": 4983494800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clicoEntrar()"
});
formatter.result({
  "duration": 1548792900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "paloma.gpedro@hotmail.com",
      "offset": 23
    }
  ],
  "location": "LoginStep.preenchoCampoEMail(String)"
});
formatter.result({
  "duration": 130987300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pwd1222",
      "offset": 22
    }
  ],
  "location": "LoginStep.preenchoCampoSenha(String)"
});
formatter.result({
  "duration": 111615700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.clicoSubmit()"
});
formatter.result({
  "duration": 1577019700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Informações de Contato",
      "offset": 26
    }
  ],
  "location": "LoginStep.validoLoginComSucesso(String)"
});
formatter.result({
  "duration": 5109863500,
  "status": "passed"
});
formatter.after({
  "duration": 927414300,
  "status": "passed"
});
});