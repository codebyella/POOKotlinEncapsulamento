package br.com.academytechmaster.pookotlinencapsulamento

class Livro(

    private var _titulo: String,
    private var _autor: String,
    private var _editora: String,
    private var _localizacao: String,
    private var _paginas: Int

){
    var titulo: String
        get() = _titulo
        set(valor) {
            _titulo = valor
        }

    var autor: String
        get() = _autor
        set(valor) {
            _autor = valor
        }

    var editora: String
        get() = _autor
        set(valor) {
            _editora = valor
        }

    var localizacao: String
        get() = _localizacao
        set(valor) {
            _localizacao = valor
        }

    var paginas: Int
        get() = _paginas
        set(valor) {
            _paginas = valor
        }

}