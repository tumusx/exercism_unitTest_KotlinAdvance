internal fun twofer(name: String?): String {
    var frase = "One for you, one for me."
    when (name){
        "Alice"->{
            frase = "One for Alice, one for me."
            print(frase)
        }
        "Bob"->{
            frase = "One for Bob, one for me."
            print(frase)
        }
        ""->{
            frase = "One for , one for me."
            print(frase)
        }
        null->{
            print(frase)
        }
    }

    return frase
}
