# unilins-compiladores
Exercicio utilizando o video do professor daniel passado pelo professor moraes para estudo e construção de compiladores para nota da materia de compiladores.

# como testar o exemplo
- Primeiramente voce deve ter instalado em seu computador o ambiente de desenvolvimento JAVA.
- É necessario ter uma ide para facilitar o uso dos arquivos java  no exemplo foi utilizando "Apache NetBeans IDE 11.3"
- Alguns Exemplos utilizam o Antlr ou seja é necessario utilizar algum  sistema de automação de compilação nos exercicios foi utilizado o Maven
- Os projetos com antlr obrigatoriamente devem ter uma pasta paralela no sistem de arquivos do projeto chamada antlr4 com o mesmo caminho q a classe principal
- ![Diretorio](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/diretorios.png)

# Resultado do analisador lexico
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "D:\Java\JavaApplication4\alguma-lexico\target\alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma**
- ![Exemplo1](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo1.png)

# Resultado do analisador sintático
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "D:\Java\AlgumaParserSin\dist\AlgumaParserSin.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma**
- ![Exemplo2](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo2.png)

# Resultado do analisador semântico
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "D:\Java\alguma-semantico\target\alguma-semantico-1.0-SNAPSHOT-jar-with-dependencies.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma**
- **na analise semantica o console apenas avisará se o programa conter erros semanticos como na imagem abaixo**
- ![Exemplo3](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo3.png)

# Resultado do gerador de código
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "C:\Users\guilh\.m2\repository\com\gui\compiladores\alguma-gerador\1.0-SNAPSHOT\alguma-gerador-1.0-SNAPSHOT-jar-with-dependencies.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt" "C:\Users\guilh\OneDrive\Área de Trabalho\saida.c" "C:\Users\guilh\OneDrive\Área de Trabalho\saidaP.p"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma o terceiro parametro é a saida do arquivo na linguagem C e o quarto o arquivo em P linguagem (linguagem de maquina)**
- **No gerador de código ele irá avisar se houver erro lexico, sintatico e semantico pelo console**
- ![Exemplo4](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo4.png)

### Exemplo de codigo C gerado pelo gerador de codigo
- ![Exemplo5](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo5.png)

### Exemplo de P codigo  gerado pelo gerador de codigo
- ![Exemplo6](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo6.png)
