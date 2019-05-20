package noldyLabs.shopifyfall2019

/**
 * Abstract representation of a word that has to be found in the grid
 */
class Word(word: String) {

    var found = false
    var length = word.length
    var start = 0
    var end = 0

    fun setLoc(tag: Int, isHorizontal: Boolean){
        start = tag
        end = if(isHorizontal) tag + length - 1 else tag + (length -1)*10
    }

    fun checkLoc(initTag: Int, finalTag: Int, isHorizontal: Boolean): Boolean{
        // if lengths do not match, return false
        if(isHorizontal){
            if(finalTag - initTag < length - 1){
                return false
            }
        } else {
            if((finalTag - initTag)/10 < length - 1){
                return false
            }
        }
        if(start == initTag && end == finalTag){
            return true
        }
        return false
    }
}