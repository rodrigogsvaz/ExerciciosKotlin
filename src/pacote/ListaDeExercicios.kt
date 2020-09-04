package pacote

// -> Lista de exercícios

// 1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
// 2) Escrever o código que deve analisar duas cadeias det exto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
// 3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
// 4) Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
// 5) Eserever um código que deve analisar qutro números inteiros e, caso n1 seja maior que n3 ou n4 ou caso n2 seja maior que n3 e n4, retornar true, caso contrário, retornar false.
// 6) Escrever um programa que exiba os primeiros 100 números positivos

fun main () {
    println("hello world")
    println(meuNome("Rodrigo", "Vaz"))
    println(ex1(1, 2, 3))
    println(ex2("oi", "ola"))
    println(ex3(3))
    println(ex4())
    println(ex5(1, 2, 3, 4))
    println(ex6())
}

fun meuNome(nome: String, sobrenome: String) : String {
    return nome + sobrenome
}

fun ex1 (n1: Int, n2: Int, n3: Int) : Int {
    if (n1 >= n2 && n1 >= n3) {
        return n1
    } else if (n2 >= n1 && n2 >= n3) {
        return n2
    } else {
        return n3
    }
}

fun ex2 (str1: String, str2: String) : Boolean {
    return str1 != str2
}

fun ex3 (num: Int) : Boolean {
    return num % 2 == 0
}

//fun ex4 (n: Int) {
//    var x = 1
//    while (x <= n) {
//        if (n % 2 == 1 || n == 1) {
//            println(x)
//        }
//        x = x + 1
//    }
//}

fun ex4 () {
    for (x in 1..200 step 2) {
        println(x)
    }
}


fun ex5 (n1: Int, n2: Int, n3: Int, n4: Int): Boolean {
    return (n1 > n3 && n1 > n4) || (n2 > n3 && n2 > n4);
}


fun ex6() {
    for (x in 1..100) {
        println(x)
    }
}