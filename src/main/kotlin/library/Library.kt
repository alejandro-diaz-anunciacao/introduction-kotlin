package org.ies.tierno.library

data class Author (val nif: String, val name: String, val surname: String)

data class Book (val isbn: String, val title: String, val year: Int, val authors: Set<Author>) {
    fun hasAuthor (nif: String) : Boolean =
        authors.any() {author -> author.nif == nif}

    fun hasAuthor2 (nif: String): Boolean {
        for (author in authors) {
            if (author.nif == nif) {
                return true;
            }
        }
        return false;
    }

}


data class Library (val name:String, val books: List<Book>) {
}
