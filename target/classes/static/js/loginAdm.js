let arrayUsers = [];

function cadastro() {
  let nome = document.getElementById("nome").value;
  let password = document.getElementById("password").value;
  let user = {
    nome: nome,
    senha: password,
  };
  for (let i = 0; i < arrayUsers.length; i++) {
    console.log("entrou");
    if (arrayUsers[i].nome == nome) {
      console.log("entrou");
      alert("Usuario ja cadastrado");
    }
  }
  if (nome == "") {
    alert("por favor informe um nome");
  } else if (password == "") {
    alert("por favor informe uma senha");
  } else {
    arrayUsers.push(user);
    localStorage.setItem("login", JSON.stringify(arrayUsers));
    alert("cadastro feito com sucesso");
    window.location.href = "../../index.html";
  }
}

function login() {
  let usuario = document.getElementById("usuario").value;
  let senha = document.getElementById("senha").value;
  let users = JSON.parse(localStorage.getItem("login"));

  for (let i = 0; i < users.length; i++) {
    if (usuario == users[i].nome && senha == users[i].senha) {
      alert("Seja bem vindo: " + users[i].nome);
      window.location.href = "./html/dashBoard.html";
    } else if (usuario != users[i].nome) {
      alert("nome nao cadastrado");
    } else if (senha != users[i].senha) {
      alert("senha incorreta");
    } else {
      alert("Desculpe ocorreu um erro");
    }
  }
}