// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (var nome: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val aluno1 = Usuario("Josefina", 1)
    val aluno2 = Usuario("Durquesa", 2)
    val aluno3 = Usuario("Girondino", 3)
    val aluno4 = Usuario("Gusmao", 4)

    val c1 = ConteudoEducacional("Kotlin", 60)
    val c2 = ConteudoEducacional("C++", 50)

    val f1 = Formacao("Kotlin", mutableListOf(c1, c2))
    val f2 = Formacao("C++", mutableListOf(c1, c2))
    val f3 = Formacao("C++", mutableListOf(c1, c2))
    val f4 = Formacao("Kotlin", mutableListOf(c1, c2))
    
    f1.matricular(aluno1)
    f2.matricular(aluno2)
    f3.matricular(aluno3)
    f4.matricular(aluno4)

    println("Alunos matriculados")
    f1.inscritos.forEach { aluno ->
        println("Nome: ${aluno.nome}, ID: ${aluno.id}")
    }

}
