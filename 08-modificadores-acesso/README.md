# Modificadores de Acesso em Java

Os modificadores de acesso definem onde atributos, métodos e classes podem ser acessados. Eles ajudam a controlar o acesso aos componentes de uma classe e contribuem para o encapsulamento.

## 1. Tipos de modificadores

| Modificador | Mesma classe | Mesmo pacote | Subclasse em outro pacote | Qualquer pacote |
|---|---|---|---|---|
| `public` | Sim | Sim | Sim | Sim |
| `protected` | Sim | Sim | Sim, com regras | Não diretamente |
| `default` (sem modificador) | Sim | Sim | Não | Não |
| `private` | Sim | Não | Não | Não |

**Observação:** `default` não é uma palavra-chave usada para declarar esse acesso. Basta não escrever nenhum modificador. O acesso `protected` em subclasses de outros pacotes possui regras específicas.

## 2. `public`

Permite o acesso de qualquer classe, desde que ela consiga acessar o tipo e o membro em questão.

```java
public class Produto {
    public String nome;
}
```

Nesse exemplo, o atributo `nome` pode ser acessado diretamente por outras classes que tenham acesso à classe `Produto`.

## 3. `private`

Permite o acesso somente dentro da própria classe. É muito utilizado para proteger os atributos de um objeto.

```java
public class Produto {
    private String nome;
    private double preco;
}
```

Para acessar esses atributos de fora da classe, normalmente utilizamos métodos públicos, como getters e setters.

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

## 4. `protected`

Permite o acesso dentro do mesmo pacote e também por subclasses, inclusive em outros pacotes, respeitadas as regras da linguagem.

```java
public class Animal {
    protected String nome;
}
```

É útil quando uma classe precisa disponibilizar determinados membros para suas classes derivadas, sem torná-los públicos para todo o código.

## 5. Acesso padrão (*default*)

Quando nenhum modificador é declarado, o membro pode ser acessado pelas classes do mesmo pacote.

```java
class Produto {
    String nome;
}
```

Nesse exemplo, a classe `Produto` e o atributo `nome` possuem acesso padrão.

## 6. Por que usar modificadores de acesso?

- **Segurança:** controlam quem pode acessar os dados.
- **Encapsulamento:** ajudam a proteger o estado interno dos objetos.
- **Organização:** definem quais partes da classe podem ser utilizadas externamente.
- **Manutenção:** permitem alterar a implementação interna sem expor todos os detalhes.

## 7. Resumo para revisão

- `public`: acesso amplo.
- `private`: acesso somente dentro da própria classe.
- `protected`: acesso no mesmo pacote e por subclasses, respeitadas as regras.
- Sem modificador (`default`): acesso dentro do mesmo pacote.

**Boa prática:** geralmente, mantenha os atributos como `private` e disponibilize métodos públicos somente quando necessário.

## 8. Exercício de fixação

Crie uma classe `Pessoa` com os atributos `nome` e `idade` privados. Depois, crie métodos públicos para consultar e alterar esses valores.

**Objetivo:** praticar o encapsulamento e entender como os modificadores de acesso controlam a utilização de uma classe.