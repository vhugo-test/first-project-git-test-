fun authentification(name: String){ 
    if(name != "Victor Hugo Soria Torres"){ 
        println(thow authentificationException)
    }else{ 
        println("Bem vindo")
        println("Você foi logado com sucesso")
    }
}

fun criandoOutraFun(name: String){ 
    for(letter in name){ 
        println(letter)
    }
}