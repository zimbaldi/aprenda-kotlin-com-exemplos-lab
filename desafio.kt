// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(
    val nome: String,
    val idade: Int,
    val email: String
)


data class ConteudoEducacional(
    var nome: String,
    val duracao: Int = 0
)


data class Formacao(
    val nome: String,
    val duracaoTotal: Int = 0,
    var conteudos: List<ConteudoEducacional>,
    val nivel: Nivel
) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}


fun main() {

    val user1 = Usuario("Mariana Silva", 18, "mariana.silva@gmail.com")
    val user2 = Usuario("Vinícius Pereira", 30, "vinip@hotmail.com")
    val user3 = Usuario("Aline Prado", 23, "pradoaline@gmail.com")
    val user4 = Usuario("Mateus Leite", 23, "mleitee@yahoo.com.br")

    val conteudosKotlin: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Agilidade e Desenvolvimento de Software", 17),
        ConteudoEducacional("Dominando a Linguagem Kotlin", 11),
        ConteudoEducacional("Desafios de Código", 6),
        ConteudoEducacional("Fortalecendo seu perfil Profissional", 6)
    )

    val conteudosAndroid: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Linguagem de Programação Kotlin", 15),
        ConteudoEducacional("Fundamentos de Desenv. Nativo para Android", 11),
        ConteudoEducacional("Noções do Android com Kotlin", 16),
        ConteudoEducacional("Dominando o Android Jetpack", 25)
    )

    val conteudosFlutter: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Introdução ao Flutter", 5),
        ConteudoEducacional("Linguagem de Programação Dart", 15),
        ConteudoEducacional("Widgets em Flutter", 14),
        ConteudoEducacional("Consumindo APIs com Flutter", 16),
        ConteudoEducacional("Introdução ao Firebase", 15),
        ConteudoEducacional("Publicando seus Apps", 6)
    )

    val conteudosWeb3: List<ConteudoEducacional> = listOf(
        ConteudoEducacional("Intrudução e Visão Geral", 3),
        ConteudoEducacional("Blockchain e Tokens", 8),
        ConteudoEducacional("Web3 e Descentralização", 7),
        ConteudoEducacional("Metaverso e Mercado Web3", 10)
    )

    val formacao1 = Formacao("Kotlin Experience", 40, conteudosKotlin, Nivel.BASICO)
    val formacao2 = Formacao("Formação Android Developer", 67, conteudosAndroid, Nivel.INTERMEDIARIO)
    val formacao3 = Formacao("Formação Flutter Specialist", 71, conteudosFlutter, Nivel.INTERMEDIARIO)
    val formacao4 = Formacao("Formação Web3 Fundamentals", 28, conteudosWeb3, Nivel.AVANCADO)

    formacao1.matricular(user1)
    formacao2.matricular(user2)
    formacao3.matricular(user3)
    formacao4.matricular(user4)

    println("O Usuário ${user1.nome} está inscrito no curso ${formacao1.nome} com duração de ${formacao1.duracaoTotal} horas")
    println("O Usuário ${user2.nome} está inscrito no curso ${formacao2.nome} com duração de ${formacao2.duracaoTotal} horas")
    println("O Usuário ${user3.nome} está inscrito no curso ${formacao3.nome} com duração de ${formacao3.duracaoTotal} horas")
    println("O Usuário ${user4.nome} está inscrito no curso ${formacao4.nome} com duração de ${formacao4.duracaoTotal} horas")

}
