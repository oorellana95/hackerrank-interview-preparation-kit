package dictionariesandhashmaps

// 4 test failing
fun checkMagazine1(magazine: Array<String>, note: Array<String>): Unit {
    val numberNotesInMagazine = magazine.toSet().intersect(note.toSet()).size
    if (numberNotesInMagazine == note.size) println("Yes") else println("No")
}


//Not working if we cut the words
fun checkMagazine2(magazine: Array<String>, note: Array<String>): Unit {
    var isOkay = "Yes"
    for (i in note.indices){
        if (!magazine.contains(note[i])){
            isOkay = "No"
            break
        }
    }
    println(isOkay)
}


//Not optimal
fun checkMagazine3(magazine: Array<String>, note: Array<String>): Unit {
    var isOkay = "Yes"
    val mutableMagazine = magazine.toMutableList()
    for (i in note.indices){
        val foundItem = mutableMagazine.find {it == note[i]}
        if (foundItem==null){
            isOkay = "No"
            break
        } else {
            mutableMagazine.remove(foundItem)
        }
    }
    println(isOkay)
}


fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    // Store the word (key) and quantity (value)
    val map = HashMap<String, Int>()

    for (str in magazine) {
        if (map.containsKey(str)) {
            map[str] = map[str]!! + 1
        } else {
            map[str] = 1
        }
    }

    for (str in note) {
        if (!map.containsKey(str) || map[str]!! <= 0) {
            print("No")
            return
        } else {
            map[str] = map[str]!! - 1
        }
    }

    print("Yes")
}


fun main(args: Array<String>) {

    val magazine = arrayOf("give", "me", "one", "grand", "today", "night")

    val note = arrayOf("give", "one", "grand", "today", "today")

    checkMagazine(magazine, note)
}