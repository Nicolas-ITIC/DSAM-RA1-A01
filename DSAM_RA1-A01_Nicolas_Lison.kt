data class Persona(
    val name: String,
    val age: Int,
    val entreteniments: List<String>
)

fun botDeSeguretat(persona: Persona) {
    if (persona.name != "Nico"){
        println("Error, usuari incorrecte!")
        return
    } else {
        println("Usuari correcte!")
    }

    if (persona.age in 0..13) {
        println("Ets massa petit! Accés denegat")
        return
    } else if (persona.age in 14..17) {
        println("Neccessites accés parental!")
        return
    } else if (persona.age >= 18) {
        println("Edat correcte!")
    } else {
        println("Edat no vàlida...")
        return
    }

    val listaDefinitiva = mutableListOf<String>()

    for (entreteniment in persona.entreteniments) {

        val primeraLletra = entreteniment[0]

        if (primeraLletra >= 'A' && primeraLletra <= 'L') {
            listaDefinitiva.add(entreteniment)
        }
    }
    listaDefinitiva.sort()

    for (entreteniment in listaDefinitiva) {
        println(entreteniment)
    }
}

fun main() {

    val persona = Persona(
        name = "Nico",
        age = 20,
        entreteniments = listOf(
            "Escacs",
            "Gimnàs",
            "Llegir",
            "Videojocs",
            "Menjar",
            "Dibuixar"
        )
    )
    botDeSeguretat(persona)
}