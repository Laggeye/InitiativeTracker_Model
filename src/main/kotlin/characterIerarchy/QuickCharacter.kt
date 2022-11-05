package characterIerarchy

class QuickCharacter (quickCharName: String = "", quickCharAC: Int = 10, quickCharInit: Int = 1, quickCharDexMode:Int = 0) : Character
    (charName = quickCharName, charAC = quickCharAC, charInit = quickCharInit, charDexMode = quickCharDexMode), Comparable<Character>
{
    init {
        println("Init quickchar message: Name ${quickCharName}, Init $quickCharInit, Dex+ $quickCharDexMode")
    }

}