enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)