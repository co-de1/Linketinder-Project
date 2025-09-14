package domain

class Empresa {
    String nome
    String emailCorporativo
    String cnpj
    String pais
    String estado
    String cep
    String descricao
    List<String> competencias = []

    String toString() {
        return """\
        Nome: $nome
        Email Corporativo: $emailCorporativo
        CNPJ: $cnpj
        País: $pais
        Estado: $estado
        CEP: $cep
        Descrição: $descricao
        Competências esperadas: ${competencias.join(", ")}
        """
    }
}
