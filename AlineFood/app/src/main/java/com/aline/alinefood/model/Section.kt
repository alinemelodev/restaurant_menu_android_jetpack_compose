import com.aline.alinefood.model.Product
import com.aline.alinefood.model.appetizer
import com.aline.alinefood.model.desserts
import com.aline.alinefood.model.houseSpecialty
import com.aline.alinefood.model.pasta

class Section(
    val title: String,
    val products: List<Product>
)

val sections = listOf(
    Section("Specialità della casa", houseSpecialty),
    Section("Antipasto", appetizer),
    Section("Paste", pasta),
    Section("Dolci", desserts)
)
