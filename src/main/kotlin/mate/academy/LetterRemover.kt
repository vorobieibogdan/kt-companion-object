package mate.academy

class LetterRemover {fun removeLetter(input: String): Array<Char> {
    return input
        .lowercase()
        .map { if (it == 'r') '!' else it }
        .toTypedArray()
}
    // implement ...
}
