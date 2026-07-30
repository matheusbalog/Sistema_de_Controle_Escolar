# Sistema de Matrícula Escolar
Projeto de Estágio em Tecnologia. Este é um exemplo de sistema de matrícula Escolar escrito em Java e utilizando conceitos de POO.

### Tema
SRP (Single Responsiblity Principle), Encapsulamento e Object Calisthenics (Regras 2, 3 e 4).

## Funcionalidades

- Matricular aluno em um curso;
- Remover Aluno de um curso;
- Buscar aluno por CPF;
- Buscar aluno por nome;
- Listar alunos por curso;
- Alterar o nome de um aluno
- Adicionar nota;
- Alterar nota;
- Verficar situação do aluno (Para efeito de demonstração, considerei média igual a 7);



## Estrutura do projeto

```
src/
├── after/
│   ├── Aluno
│   ├── Cpf
│   ├── Curso
│   ├── CursoTeste.java/
│   │   └── CursoTeste
│   ├── Main
│   └── Nota
└── before/
    ├── Aluno
    ├── Curso
    └── Main
```

## Problemas encontrados no package `before`
1. Método `addAluno()` adiciona aluno em um curso e imprime o aluno ao mesmo tempo - **SRP** 

2. Método `removerAluno()` remove aluno em um curso e imprime o aluno ao mesmo tempo - **SRP**

3. Há duplicação de código na impressão das informações do aluno (`nome`, `CPF` e `idade`) em diferentes métodos, dificultando a manutenção.

4. A classe `Curso` está acoplada à saída do console (`System.out.println`), dificultando a reutilização da lógica em outros tipos de interface, como uma aplicação web ou gráfica.

5. Os métodos realizam validações e exibem mensagens diretamente ao usuário, misturando regras de negócio com a camada de apresentação.

6. O método `removerAluno()` depende do objeto `Aluno` completo para realizar a remoção, em vez de utilizar um identificador único, como o CPF.

7. Uso de else no método `verificarSituacao()` - **Regra 2 Object Calisthenics**

8. No package `before` existia obsessão por primitivos (`int Cpf` e `int Nota`). No package `after` isto foi resolvido criando as classes `Nota` e `Cpf` - **Regra 3 Object Calisthenics**

9. Encapsulamento básico dos atributos da classe - **Encapsulamento**

## Refatoração no package `after`

No package `after`, estes 9 problemas foram resolvidos desta maneira:

1. `addAluno()` não imprime mais nada — apenas verifica duplicidade de CPF e retorna `boolean` (`true` se adicionou, `false` se já existia). Quem decide o que exibir é a `Main`.

2. `removerAluno()` segue o mesmo princípio: usa `alunos.removeIf(...)` e retorna `boolean`, sem nenhum `System.out.println` dentro da classe `Curso`.

3. A duplicação de `println` de nome/CPF/idade foi eliminada porque a impressão não existe mais dentro de `Curso` — ficou concentrada em um único lugar, na `Main`, então não há mais o que duplicar.

4. `Curso` (e `Aluno`) não dependem mais de `System.out`. Toda a lógica de negócio pode ser reaproveitada em outra interface (web, API, GUI) sem alterar essas classes.

5. Validação e exibição foram separadas: os métodos de `Curso` e `Aluno` só retornam o resultado da validação (`boolean`, `Optional`, exceção); a `Main` que decide a mensagem mostrada ao usuário.

6. `removerAluno()` e `buscarPorCpf()` agora recebem um `Cpf` (identificador), não o objeto `Aluno` inteiro — a remoção não depende mais de ter a referência completa do aluno em mãos.

7. O `else` de `verificarSituacao()` foi eliminado — a lógica virou `Nota.isAprovado()`, um método sem nenhum `if/else`, e `Aluno.isAprovado()` delega pra ele (guard clauses aplicadas também em `addAluno`/`removerAluno`).

8. Criadas as classes `Cpf` e `Nota` como objetos de valor, cada uma validando sua própria regra no construtor (CPF com 11 dígitos, nota entre 0 e 10) — elimina a obsessão por primitivos.

9. O encapsulamento foi fortalecido: além de campos `private`, `Cpf` e `Nota` agora garantem que é **impossível** existir um objeto em estado inválido, porque a validação acontece na criação, não depende de quem chama lembrar de validar.


## Testes
Abra o arquivo `CursoTeste.java` e execute.

**Dependência**: Não usa Maven/Gradle. O JUnit 5 foi adicionado via `junit-platform-console-standalone`



## Tecnologias

- Java
- IntelliJ IDEA
- JUnit 5

## Autor

Matheus Balog
