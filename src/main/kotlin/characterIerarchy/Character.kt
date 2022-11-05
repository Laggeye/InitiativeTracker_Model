package characterIerarchy

abstract class Character (charName: String = "", charAC: Int = 10, charInit: Int = 1, charDexMode: Int = 0) : Comparable<Character>
{
    var characterName: String = charName

    var characterArmourClass: Int = charAC

    var characterInitiative: Int = charInit

    var characterDexMode: Int = charDexMode

    override fun compareTo(other: Character): Int {
        if (this.characterInitiative < other.characterInitiative) return 1
        if (this.characterInitiative > other.characterInitiative) return -1
        if (this.characterInitiative == other.characterInitiative)
        {
            if (this.characterDexMode < other.characterDexMode) return 1
            if (this.characterDexMode > other.characterDexMode) return -1
            if (this.characterDexMode == other.characterDexMode) return 0
        }
        return 0
    }

    fun equalizer(other: Character): Boolean {
        if (other.characterDexMode == this.characterDexMode
            && other.characterArmourClass == this.characterArmourClass
            && other.characterInitiative == this.characterInitiative)
            return true
        return false
    }

    fun infoAbout ()
    {
        println("My name is ${characterName}, my dex is ${characterDexMode}, init is ${characterInitiative}")
    }
}