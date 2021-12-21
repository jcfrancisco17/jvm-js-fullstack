import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(val desc: String, val priority: Int) {
    val id = desc.hashCode()

    companion object {
        const val path = "/shoppingList"
    }
}