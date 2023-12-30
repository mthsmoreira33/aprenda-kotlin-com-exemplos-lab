data class Formacao(val nome: String, val conteudos: MutableList<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        usuario.formacoes.add(this)
    }

    fun finalizar(usuario: Usuario) {
        inscritos.remove(usuario)
        usuario.formacoes.remove(this)
        println("Parabéns, você finalizou a formação ${this.nome}!")
    }
}