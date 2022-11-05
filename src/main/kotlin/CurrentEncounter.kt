import characterIerarchy.Character
import characterIerarchy.QuickCharacter

class CurrentEncounter
{

    var characterList: MutableList<Character> = mutableListOf()

    var currentInitiativeHolder: Character = QuickCharacter() as Character

    fun sortListByInitiaviveWithRearrange () {
        characterList.sort()
        listRearrangement()
        println("List sorted!")
        //CharacterList.sortBy {it.characterInitiative}
    }


    fun addCharacterToList (char: Character) {
        characterList.add(char)
        sortListByInitiaviveWithRearrange()

        println("Character added!")
    }


    fun removeCharacterFromList (char: Character) {
        if (char.equalizer(currentInitiativeHolder))
        {
            if (!characterList.last().equalizer(char))
                currentInitiativeHolder = characterList[characterList.indexOf(char)+1]
            else
                currentInitiativeHolder = characterList[0]
        }
        while (characterList.contains(char))
            characterList.remove(char)
        println("removing character is complete!")
    }

    fun infoAbout() {
        for (item in characterList)
        {
            println("foreach IO Encounter msg: name - ${item.characterName}, init = ${item.characterInitiative}, dexmod = ${item.characterDexMode}")
        }
    }

    fun listRearrangement ()
    {
        //while (!currentInitiativeHolder.equalizer(characterList[0]))
        for (i in 1..characterList.indexOf(currentInitiativeHolder))
        {
            characterList.add(characterList[0])
            characterList.removeFirst()
            println()
            characterList[0].infoAbout()
            currentInitiativeHolder.infoAbout()
            infoAbout()
            println("holder is 0-index element at the moment:${currentInitiativeHolder.equalizer(characterList[0])}  on iteration i=$i")

        }
        println("List rearrange....")
        println()
    }


    fun nextTurn ()
    {
        if (!currentInitiativeHolder.equalizer(characterList.last()))
        {
            currentInitiativeHolder = characterList[characterList.indexOf(currentInitiativeHolder) + 1]
        }

        listRearrangement()
        println("next turn called")
    }

    init {
        println("Current encounter initialization...")
    }
}