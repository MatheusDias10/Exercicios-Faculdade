function Login() {
    var login = document.getElementById("login").value;
    var senha = document.getElementById("senha").value;

    if (senha != "1234"){
        alert("Senha incorreta")
        document.getElementById("senha").focus();
    } else if (!login){
        alert("O Login está vazio.")
        document.getElementById("login").focus();
    } else {
        alert("A senha está correta, meus parabéns!")
    }
}
