# 🛒 Kalunga E2E Automation Framework

![Java](https://img.shields.io/badge/Java-23-orange?style=for-the-badge&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.28.0-green?style=for-the-badge&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-brightgreen?style=for-the-badge&logo=cucumber)

Desenvolvi este framework de testes automatizados End-to-End (E2E) para validar o fluxo principal de navegação, busca e seleção de produtos no e-commerce da **Kalunga**.

O meu objetivo principal foi criar uma suíte de testes limpa (*clean code*), estável e de fácil manutenção. Como diferencial, projetei a execução dos testes com uma cadência visual humanizada, o que torna as demonstrações em vídeo muito mais fluidas e agradáveis de acompanhar.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 23
* **Automação Web:** Selenium WebDriver 4.28.0
* **Framework BDD:** Cucumber (JUnit)
* **Gerenciador de Dependências:** Maven
* **Padrão de Arquitetura:** Page Object Model (POM) + Camada de Interações

---

## 🏗️ Arquitetura do Projeto

Organizei o código dividindo as responsabilidades em camadas bem claras para garantir alta manutenibilidade e reutilização:

```text
src/test/java/
├── interactions/   # Regras de negócio, ações de UI e lógica de digitação humanizada
├── pages/          # Page Object Model (mapeamento de WebElements e seletores)
├── runner/         # Configurações do JUnit Test Runner e tags Cucumber
├── setup/          # Inicialização do Driver, opções do navegador e padrões de sessão
└── steps/          # Step Definitions do Cucumber e Hooks de ciclo de vida (@After)

src/test/resources/
└── features/       # Especificações BDD em formato Gherkin (.feature)
```

## ✨ Destaques Técnicos

* **Digitação Humanizada:** Em vez de inserir textos instantaneamente nos campos, implementei uma simulação que digita caractere por caractere (`toCharArray()`) com micro-pausas estratégicas. Isso reproduz o comportamento real de um utilizador e melhora bastante a qualidade visual nas gravações de demonstração.
* **Gestão do Ciclo de Vida do Browser:** O encerramento das sessões é gerido de forma limpa através de Hooks `@After` que executam o `driver.quit()`. Isso previne a permanência de processos fantasma (*zombie drivers*) e evita vazamentos de memória na máquina.
* **Isolamento de Testes:** Configurei o `ChromeOptions` para que cada teste inicie em modo anónimo, janela maximizada e com bloqueio de pop-ups e notificações, garantindo um ambiente limpo e predefinido a cada execução.

---

## 📋 Cenários de Teste

O projeto valida o caminho feliz da experiência de compra utilizando sintaxe **Gherkin / BDD**:

```gherkin
@regressivo @ordenacao
Cenário: Buscar produto e ordenar por menor preço
  Dado que estou na página inicial da Kalunga
  E pesquiso pelo produto "Caderno"
  Quando aplico a ordenação por "3"
  E compro
  Então volto para o início
```
🚀 Como Executar o Projeto
Pré-requisitos
Java JDK 23 (ou superior) instalado e configurado nas variáveis de ambiente.

Apache Maven instalado.

Navegador Google Chrome instalado.

---

Execução via Terminal (CLI)
Para rodar a suíte completa diretamente pela linha de comando:

```Bash
mvn clean test
```
Execução via IDE (IntelliJ IDEA)
Abre o projeto no IntelliJ.

Navega até ao ficheiro src/test/java/runner/RunKalungaTest.java.

Clica com o botão direito na classe e seleciona Run 'RunKalungaTest'.

---

📊 Relatórios de Teste
Ao finalizar a execução, o Cucumber gera automaticamente um relatório HTML interativo no seguinte caminho:

```Plaintext
target/cucumber-reports.html
```
📝 Autor
Desenvolvido por Gabriel Ferreira como projeto de portfólio focado em Automação de Testes e Engenharia de QA.

GitHub: @GabrielFerre13
