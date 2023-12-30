enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel, var finalizado: Boolean = false) {
    fun finalizar(usuario: Usuario, formacao: Formacao) {
        usuario.formacoes.forEach { it.conteudos.remove(this) }
        finalizado = true
        println("Parabéns você finalizou o curso ${this.nome}!")
    }
}