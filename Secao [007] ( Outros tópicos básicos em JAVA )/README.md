### Seção 7

- Oque foi visto?
  - Neste tópico foram vistas funções as quais não exemplifiquei necessariamente em código, como:
    - Operadores BITWISE, Comentários em JAVA, Funções interessantes em JAVA e a sintaxe de uma função JAVA.
  - Como foram aulas de cunho mais teorico estarei documentando tudo neste readme mesmo.

- `Funções para STRING`
  - `Formatar: ` toLowwerCase(),toUpperCase(),trim();
  - `Recortar: ` substring(inicio),substring(inicio,fim);
  - `Substituir: ` Replace(char,char), Replace(String,String);
  - `Buscar: ` indexOf,lastIndexOf;
  - `str.Split("")`


- `Funções em JAVA`
```java
    public static int calculo(int x,int y,int z){
        int aux;
        if( x > y && x > z) {
            aux = x;
        } else if ( y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }
```