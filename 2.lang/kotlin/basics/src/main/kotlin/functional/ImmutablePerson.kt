package functional

data class ImmutablePerson(
    val firstName: String = "Default",
    val lastName: String,
    val emails: List<String>,
    val category: String = "Work",
) {
}
