import characterIerarchy.QuickCharacter

fun main(args: Array<String>) {
    var Char1: QuickCharacter = QuickCharacter("Dave0", 15, 21, 2)
    var Char2: QuickCharacter = QuickCharacter("Dave1", 1, 3, -1)
    var Char3: QuickCharacter = QuickCharacter("Dave2", 2, 14, 0)
    var Char4: QuickCharacter = QuickCharacter("Dave3", 3, 25, 1)
    var Char5: QuickCharacter = QuickCharacter("Dave4", 4, 25, 0)
    var Char6: QuickCharacter = QuickCharacter("Dave5", 5, 14, 1)
    var Char7: QuickCharacter = QuickCharacter("Dave6", 5, 12, 2)

    val currEncounter = CurrentEncounter()
    currEncounter.addCharacterToList(Char1)
    currEncounter.addCharacterToList(Char5)
    currEncounter.addCharacterToList(Char6)
    currEncounter.addCharacterToList(Char4)
    currEncounter.addCharacterToList(Char3)
    currEncounter.addCharacterToList(Char2)
    currEncounter.nextTurn()


    for (i in 1..8)
    {
        currEncounter.nextTurn()
    }
    currEncounter.addCharacterToList(Char7)
    for (i in 1..5)
    {
        currEncounter.nextTurn()
    }
    currEncounter.infoAbout()
    currEncounter.removeCharacterFromList(Char4)
    currEncounter.infoAbout()
    currEncounter.nextTurn()
    currEncounter.nextTurn()
}

