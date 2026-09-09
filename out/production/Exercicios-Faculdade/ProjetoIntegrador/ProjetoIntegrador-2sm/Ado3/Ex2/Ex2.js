function calcular(){
var valor = Number(document.getElementById("valor-compra").value);

    if(valor < 20){
        var acrescimo = valor * 0.45
        var valor = valor + acrescimo
        alert("O valor de venda é de R$" + valor)
    } else {
        var acrescimo = valor * 0.30
        var valor = valor + acrescimo
        alert("O valor de venda é de R$" + valor)
    }
}