// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    val conteudo1: ConteudoEducacional = ConteudoEducacional("Python", 60, Nivel.BASICO)
    val formacao1: Formacao = Formacao("Data Science", mutableListOf(conteudo1))
    val usuario1: Usuario = Usuario("Matheus")

    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    formacao1.matricular(usuario1)
    println(usuario1.formacoes)
    conteudo1.finalizar(usuario1, formacao1)
}
