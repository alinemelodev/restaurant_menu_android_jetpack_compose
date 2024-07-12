package com.aline.alinefood.model

import com.aline.alinefood.R
import java.math.BigDecimal

val houseSpecialty = listOf(
    Product(
        name = "Pizza Napoletana",
        price = BigDecimal("70.00"),
        image = R.drawable.img_pizza_napoletana
    )
)

val appetizer = listOf(
    Product(
        name = "Bruschetta",
        price = BigDecimal("35.00"),
        image = R.drawable.img_bruschetta
    ),
    Product(
        name = "Insalata Caprese",
        price = BigDecimal("42.00"),
        image = R.drawable.img_insalata_caprese
    ),
)

val pasta = listOf(
    Product(
        name = "Espaghetti al Pomodoro",
        price = BigDecimal("59.00"),
        image = R.drawable.img_espaghetti_al_pomodoro
    ),
    Product(
        name = "Pene al Basilico",
        price = BigDecimal("59.00"),
        image = R.drawable.img_pene_al_basilico
    ),
    Product(
        name = "Carbonara Vegetariana",
        price = BigDecimal("59.00"),
        image = R.drawable.img_carbonara_vegetariana
    ),
    Product(
        name = "Lasagna di Mozzarella",
        price = BigDecimal("68.00"),
        image = R.drawable.img_lasagna_di_pomodoro_e_mozzarella
    ),
)

val desserts = listOf(
    Product(
        name = "Tiramisu",
        price = BigDecimal("23.00"),
        image = R.drawable.img_tiramisu
    ),
    Product(
        name = "Cupcake di Cioccolato",
        price = BigDecimal("20.00"),
        image = R.drawable.img_cupcake_di_cioccolato_e_caffe
    ),
    Product(
        name = "Torta di Fragole",
        price = BigDecimal("20.00"),
        image = R.drawable.img_torta_di_fragole
    )
)


