# unilins-compiladores
Exercicio utilizando o video do professor daniel passado pelo professor moraes para estudo e construção de compiladores para nota da materia de compiladores.

# como testar o exemplo
- Primeiramente voce deve ter instalado em seu computador o ambiente de desenvolvimento JAVA.
- É necessario ter uma ide para facilitar o uso dos arquivos java  no exemplo foi utilizando "Apache NetBeans IDE 11.3"
- Alguns Exemplos utilizam o Antlr ou seja é necessario utilizar algum  sistema de automação de compilação nos exercicios foi utilizado o Maven

# Para criar um projeto maven no java:
1. criar um projeto java com maven deve-se clicar em criar novo projeto.
- ![Criar0](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/criar0.png)
2. selecionar a opção java with maven e selecionar java application.
- ![Criar1](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/criar1.png)
3. preencher as informações como nome do seu projeto, local que será salvo e o nome do seu pacote.
- ![Criar2](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/criar2.png)
4. Ao criar o projeto voce deve ir  project file e abrir o arquivo pom.xml
- ![Criar3](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/criar3.png)
5. Adicionar a referencia do antlr no arquivo pom.xml abaixo de ```<packaging>jar</packaging>``` e acima de ```<properties>```
```<build>
        <plugins>
            <plugin>
                <groupId>org.antlr</groupId>
                <artifactId>antlr4-maven-plugin</artifactId>
                <version>4.8</version>
                <configuration>
                    <visitor>true</visitor>
                </configuration>
                <executions>
                    <execution>
                        <id>antlr</id>
                        <goals>
                            <goal>antlr4</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
            <plugin>
                <artifactId>maven-assembly-plugin</artifactId>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>nome.do.seu.pacotete.classe.Principal</mainClass>
                        </manifest>
                    </archive>
                    <descriptorRefs>
                        <descriptorRef>jar-with-dependencies</descriptorRef>
                    </descriptorRefs>
                </configuration>
                <executions>
                    <execution>
                        <id>make-assembly</id>
                        <phase>package</phase>
                        <goals>
                            <goal>single</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```
- 6 Os projetos com antlr obrigatoriamente devem ter uma pasta paralela no sistema de arquivos do projeto chamada antlr4 com o mesmo caminho q a classe principal ps:pegue o arquivo g4 do repositorio ou crie o seu proprio
- ![Diretorio](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/diretorios.png)
- 7 para deixar o sistema de arquivo no netbeans igual ao da imagem voce deve trocar no canto superior de Projects para Files
- ![Uteis](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/uteis1.png)
- Caso seu Netbeans nao possua o plugin do antlr basta ir em tools-> Plugins
- ![Uteis2](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/uteis2.png)
- Clicar em Available Plugins e na Caixa de Pesquisar "search" digitar antlr. Checar o plugin e clicar em instalar
- ![Uteis3](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/uteis3.png)
  Com tudo pronto copie os arquivs e ALTERE o nome do pacote de cada arquivo para o seu nome de pacotece do seu projeto
  
# Resultado do analisador lexico
### Análise léxica é o processo de analisar a entrada de linhas de caracteres e produzir uma sequência de símbolos chamado "símbolos léxicos ou lexemas", ou somente "símbolos", que podem ser manipulados mais facilmente por um parser.
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "D:\Java\JavaApplication4\alguma-lexico\target\alguma-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma**
- ![Exemplo1](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo1.png)

# Resultado do analisador sintático
### segunda fase da compilação onde se analisa uma sequência que foi dada entrada para verificar sua estrutura gramatical segundo uma determinada gramática formal.
- Após compilar o programa ira gerar uma pasta chamada "target" nela terá o arquivo JAR que é o programa compilado
### para executar o programa voce deve executar o seguinte comando
- java -jar "D:\Java\AlgumaParserSin\dist\AlgumaParserSin.jar" "C:\Users\guilh\OneDrive\Área de Trabalho\programa.txt"
- **voce deve substituir o primeiro parametro pelo caminho do seu jar e o segundo parametro pelo arquivo escrito na linguagem alguma**
- ![Exemplo2](https://github.com/GuiCoimbraDeveloper/unilins-compiladores/blob/master/imagens/exemplo2.png)

# Resultado do analisador semântico
### A análise semântica engloba duas tarefas principais: análise de contexto com geração de código e, verificação de erros em frases sintaticamente corretas.
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
