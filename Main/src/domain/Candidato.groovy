package domain

class Candidato {
    String nome
    String email
    String cpf
    int idade
    String estado
    String cep
    String descricao
    List<String> competencias = []

    String toString() {
        return """\
        Nome: $nome
        Email: $email
        CPF: $cpf
        Idade: $idade
        Estado: $estado
        CEP: $cep
        Descrição: $descricao
        Competências: ${competencias.join(", ")}
        """
    }
}
