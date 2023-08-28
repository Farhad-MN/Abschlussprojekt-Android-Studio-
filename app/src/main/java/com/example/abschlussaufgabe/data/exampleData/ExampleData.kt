package com.example.abschlussaufgabe.data.exampleData

import com.example.abschlussaufgabe.R
import com.example.abschlussaufgabe.data.db.AppartmentData

object AppartmentsExampleData {

    val appartment1 = AppartmentData(
        id = 1,
        title = "Appartment-01",
        addresse = "Mozartstr.1A",
        sleeproom = 1,
        size = 30,
        personas = 1,
        pricePenNight = 120,
        petsAllowed = false,
        image = R.drawable.appartment1
    )

    val appartment2 = AppartmentData(
        id = 2,
        title = "Appartment-02",
        addresse = "FeldStr.2A",
        sleeproom = 2,
        size = 55,
        personas = 2,
        pricePenNight = 210,
        petsAllowed = false,
        image = R.drawable.appartment2

    )

    val appartment3 = AppartmentData(
        id = 3,
        title = "Appartment-03",
        addresse = "FalknisStr.3A",
        sleeproom = 3,
        size = 60,
        personas = 3,
        pricePenNight = 240,
        petsAllowed = false,
        image = R.drawable.appartment3

    )

    val appartment4 = AppartmentData(
        id = 4,
        title = "Appartment-04",
        addresse = "WiedenStr.4A",
        sleeproom = 4,
        size = 80,
        personas = 4,
        pricePenNight = 290,
        petsAllowed = false,
        image = R.drawable.appartment4

    )

    val appartment5 = AppartmentData(
        id = 5,
        title = "Appartment-05",
        addresse = "AlvierStr.5A",
        sleeproom = 5,
        size = 140,
        personas = 5,
        pricePenNight = 390,
        petsAllowed = true,
        image = R.drawable.appartment5

    )

    val appartment6 = AppartmentData(
        id = 6,
        title = "Appartment-06",
        addresse = "GrünauStr.6A",
        sleeproom = 6,
        size = 190,
        personas = 4,
        pricePenNight = 550,
        petsAllowed = true,
        image = R.drawable.appartment6

    )
    val appartment7 = AppartmentData(
        id = 6,
        title = "Appartment-07",
        addresse = "KornStr.7A",
        sleeproom = 6,
        size = 190,
        personas = 4,
        pricePenNight = 550,
        petsAllowed = true,
        image = R.drawable.appartment7

    )
    val appartment8 = AppartmentData(
        id = 6,
        title = "Appartment-08",
        addresse = "HeimStr.8A",
        sleeproom = 6,
        size = 190,
        personas = 4,
        pricePenNight = 550,
        petsAllowed = true,
        image = R.drawable.appartment8

    )
}