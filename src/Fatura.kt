class Fatura(var numeroItem : Int,
             var descricaoItem : String,
             var quantidade : Int = 0,
             var preco: Double = 0.0) {


    fun valorTotal()  {
        var precoTotal = preco * quantidade
        println("Numero do produto: $numeroItem \n " +
                "Produto: $descricaoItem \n " +
                "Quantidade: $quantidade \n " +
                "Preço: $preco \n" +
                "Valor total: $precoTotal")
    }

}