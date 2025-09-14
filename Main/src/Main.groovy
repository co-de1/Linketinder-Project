import domain.Candidato
import domain.Empresa

static void main(String[] args) {
    def candidatos = [
            new Candidato(nome:"José Antonio", email:"jose@gmail.com", cpf:"12345678900",
                    idade:30, estado:"CE", cep:"62785-000", descricao:"Eng. de Software",
                    competencias:["Java", "Spring"]),
            new Candidato(nome:"Maria Silva", email:"maria@gmail.com", cpf:"98765432100",
                    idade:25, estado:"SP", cep:"01000-000", descricao:"Front-end Dev",
                    competencias:["Angular", "JavaScript"]),
            new Candidato(nome:"Carlos Souza", email:"carlos@gmail.com", cpf:"45678912300",
                    idade:28, estado:"RJ", cep:"20000-000", descricao:"DevOps",
                    competencias:["Python", "AWS"]),
            new Candidato(nome:"Ana Costa", email:"ana@gmail.com", cpf:"32165498700",
                    idade:32, estado:"MG", cep:"30000-000", descricao:"QA",
                    competencias:["Selenium", "JUnit"]),
            new Candidato(nome:"Pedro Oliveira", email:"pedro@gmail.com", cpf:"74185296300",
                    idade:29, estado:"RS", cep:"90000-000", descricao:"Mobile Dev",
                    competencias:["Kotlin", "Flutter"])
    ]

    def empresas = [
            new Empresa(nome:"Tech Solutions", emailCorporativo:"contato@techsolutions.com",
                    cnpj:"11222333444455", pais:"Brasil", estado:"SP", cep:"01001-000",
                    descricao:"Empresa de tecnologia focada em soluções web",
                    competencias:["Java", "Spring"]),
            new Empresa(nome:"InovaWeb", emailCorporativo:"rh@inovaweb.com",
                    cnpj:"22333444555666", pais:"Brasil", estado:"RJ", cep:"20001-000",
                    descricao:"Consultoria em desenvolvimento front-end",
                    competencias:["Angular", "React"]),
            new Empresa(nome:"CloudMasters", emailCorporativo:"jobs@cloudmasters.com",
                    cnpj:"33444555666777", pais:"Brasil", estado:"MG", cep:"30001-000",
                    descricao:"Especializada em soluções na nuvem",
                    competencias:["AWS", "Python"]),
            new Empresa(nome:"QA Experts", emailCorporativo:"vagas@qaexperts.com",
                    cnpj:"44555666777888", pais:"Brasil", estado:"RS", cep:"90001-000",
                    descricao:"Consultoria em qualidade de software",
                    competencias:["Selenium", "JUnit"]),
            new Empresa(nome:"MobileX", emailCorporativo:"hr@mobilex.com",
                    cnpj:"55666777888999", pais:"Brasil", estado:"CE", cep:"62785-100",
                    descricao:"Desenvolvedora de aplicativos móveis",
                    competencias:["Kotlin", "Flutter"])
    ]

    def scanner = new Scanner(System.in)

    while(true) {
        println "\n===== MENU ====="
        println "1 - Listar candidatos"
        println "2 - Listar empresas"
        println "3 - Cadastrar candidato"
        println "4 - Cadastrar empresa"
        println "0 - Sair"
        print "Escolha uma opção: "
        def opcao = scanner.nextLine()

        switch(opcao) {
            case "1":
                println "\n--- Lista de Candidatos ---"
                candidatos.each { println it; println "-"*40 }
                break
            case "2":
                println "\n--- Lista de Empresas ---"
                empresas.each { println it; println "-"*40 }
                break
            case "3":
                //
                break
            case "4":
                //
                break
            case "0":
                println "Saindo..."
                return
            default:
                println "Opção inválida!"
        }
    }
}
