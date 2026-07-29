# Sistema de Matrícula Escolar
Este é um projeto técnico de Estágio em Tecnologia. É um sistema de matrícula Escolar escrito em Java e utilizando conceitos de POO.

### Problemas encontrados
1. Método `addAluno()` adiciona aluno em um curso e imprime o aluno ao mesmo tempo - VIOLA SRP

2. Método `removerAluno()` remove aluno em um curso e imprime o aluno ao mesmo tempo - VIOLA SRP

3. Há duplicação de código na impressão das informações do aluno (`nome`, `CPF` e `idade`) em diferentes métodos, dificultando a manutenção.

4. A classe `Curso` está acoplada à saída do console (`System.out.println`), dificultando a reutilização da lógica em outros tipos de interface, como uma aplicação web ou gráfica.

5. Os métodos realizam validações e exibem mensagens diretamente ao usuário, misturando regras de negócio com a camada de apresentação.

6. O método `removerAluno()` depende do objeto `Aluno` completo para realizar a remoção, em vez de utilizar um identificador único, como o CPF.

Funcionalidades
✓ matricular aluno
✓ remover aluno
✓ buscar por CPF
✓ buscar por nome
✓ listar alunos
✓ alterar aluno
