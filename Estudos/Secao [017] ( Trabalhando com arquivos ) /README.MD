## Seção [017]

### Trabalhando com arquivos em JAVA

- Links utéis 
  - Aula [001] --> Lendo arquivos em JAVA
    - `File` - Representação abstrata de um arquivo e seu caminho
      - https://docs.oracle.com/javase/10/docs/api/java/io/File.html
    - `Scanner` - Leitor de texto
      - https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html
    - `IOException` - (Exception)
      - https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html
  - Aula [002] --> FileReader & BufferedReader
    - `FileReader` - ( Stream de leitura de caracteres a partir de arquivos)
      - https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
    - `BufferedReader` - ( Mais rápido )
      - https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
      - https://stackoverflow.com/questions/9648811/specific-difference-between-bufferedreader-and-filereader
  - Aula [003] --> Bloco try-with-resources
    - É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados no final do bloco.
    - Disponivel do JAVA 7 em diante
    - https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
  - Aula [004] --> FileWriter & BufferedWriter
    - `FileWriter` - ( Stream de escrita de caracteres em arquivos )
      - https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
      - Cria/Recria o arquivo: `new fileWriter(path);`
      - Acrescenta ao arquivo existente: new FileWriter(path, true);
    - `BufferedWriter` - ( Mais rápido )
      - https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html


