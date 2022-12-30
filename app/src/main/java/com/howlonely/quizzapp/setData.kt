package com.howlonely.quizzapp

object setData {
    fun getQuestion(): ArrayList<QuestionData> {
        var que:ArrayList<QuestionData> = arrayListOf()
        var q1 = QuestionData(
            1,
            "Temperatura superior e inferior de la parrilla",
            "218 °C y 177 °C",
            "219 °C y 177 °C",
            "177 °C y 219 °C",
            "214 °C y 179°C",
            1
        )
        var q2 = QuestionData(
            2,
            "Duración del Ketchup en la mesa de condimentación y en refrigeración",
            "4 horas y 2 días",
            "8 horas y 1 semana",
            "24 horas y 48 horas",
            "4 horas y  1 día",
            3
        )
        var q3 = QuestionData(
            3,
            "Duración de la Mayonesa en la mesa de condimentación y en refrigeración",
            "1 hora y 1 día",
            "1 hora y 2 días",
            "4 horas y 1 día",
            "2 horas y 2 días",
            4
        )
        var q4 = QuestionData(
            4,
            "Duración de la Mostaza en mesa de condimentación y en refrigeración",
            "2 días y 1 semana",
            "1 hora y 2 días",
            "1 día y 1 semana",
            "2 horas y 2 días",
            3
        )

        var q5 = QuestionData(
            5,
            "Duración de la salsa Bacon Jam en la mesa de condimentación y en refrigeración",
            "2 horas y 2 días",
            "1 día y 2 días",
            "8 horas y 1 día",
            "4 horas y 1 día",
            4
        )
        var q6 = QuestionData(
            6,
            "Duración de la salsa BigMac en mesa de condimentación y en refrigeración",
            "8 horas y 1 día",
            "1 semana y 2 semanas",
            "24 horas y 1 día",
            "8 horas y 2 días",
            3
        )
        var q7 = QuestionData(
            7,
            "Duración de la salsa Mostaza Miel en la mesa de condimentación y en refrigeración",
            "4 horas y 1 día",
            "8 horas y 1 día",
            "4 horas y 2 días",
            "1 hora y 1 día",
            1
        )
        var q8 = QuestionData(
            8,
            "Duración de la salsa Spicy en mesa de condimentación y en refrigeración",
            "2 horas y 8 horas",
            "4 horas y 8 horas",
            "8 horas y 1 día",
            "8 horas y 48 horas",
            4
        )
        var q9 = QuestionData(
            9,
            "Duración de la Cebolla Crispy en mesa de condimentación y a temperatura ambiente",
            "3 días y 1 semana",
            "1 día y 2 días",
            "1 semana y 7 días",
            "8 horas y 2 días",
            3
        )
        var q10 = QuestionData(
            10,
            "Duración de la Cebolla Deshidratada en mesa de condimentación y en refrigeración",
            "1 hora y 2 días",
            "4 horas y 1 día",
            "8 horas y 1 día",
            "2 horas y 1 día",
            2
        )
        var q11 = QuestionData(
            11,
            "Duración de la Cebolla Fresca en mesa de condimentación y refrigerada",
            "4 horas y 8 horas",
            "2 horas y 2 días",
            "8 horas y 1 día",
            "2 horas y 1 día",
            4
        )
        var q12 = QuestionData(
            12,
            "Duración de la Lechuga en mesa de condimentación y en refrigeración",
            "1 hora y 1 día",
            "4 horas y 2 días",
            "2 horas y 1 día",
            "2 horas y 2 días",
            3
        )
        var q13 = QuestionData(
            13,
            "Duración de la Palta en mesa de condimentación y en refrigeración (Abierta y con sal)",
            "1 día y 1 semana",
            "2 horas y 4 horas",
            "1 hora y 3 horas",
            "1 hora y 4 horas",
            3
        )
        var q14 = QuestionData(
            14,
            "Duración del Tomate en la mesa de condimentación, refrigerado y a temperatura ambiente",
            "1 hora, 8 horas y 7 días",
            "1 hora, 4 horas y 10 días",
            "2 horas, 6 horas y 10 días",
            "2 horas, 8 horas y 7 días",
            3
        )
        var q15 = QuestionData(
            15,
            "Duración del Pepinillo en mesa de condimentación y en refrigeración",
            "1 día y 1 semana",
            "2 días y 1 semana",
            "8 horas y 1 día",
            "4 horas y 2 días",
            1
        )
        var q16 = QuestionData(
            16,
            "Duración del Queso Cheddar en mesa de condimentación, refrigerado y a temperatura ambiente",
            "1 hora, 4 días y 1 hora",
            "2 días, 1 semana y 2 horas",
            "2 horas, 2 dias y 1 hora",
            "1 hora, 1 semana y 1 hora",
            4
        )
        var q17 = QuestionData(
            17,
            "Circulo de influencia vendedora",
            "Ofrecer producto-Lograr aceptación-Crear vínculo",
            "Tomar pedido-Lograr aceptación-Entregar producto",
            "Crear vínculo-Ofrecer producto-Entregar producto",
            "Crear vínculo-Ofrecer producto-Lograr aceptación",
            4
        )
        var q18 = QuestionData(
            18,
            "¿Qué es la venta cruzada?",
            "Ofrecer productos del mismo precio",
            "Convencer al cliente de llevar otro producto",
            "Productos distintos que se relacionan a una venta",
            "Productos mejor al que escoge el cliente",
            3
        )
        var q19 = QuestionData(
            19,
            "Onzas de helado del McSunday",
            "4 onzas",
            "5 onzas",
            "10 onzas",
            "3 onzas",
            1
        )
        var q20 = QuestionData(
            20,
            "Temperatura interna de los pollos",
            "Mayor a 74 °C",
            "Mayor a 69 °C",
            "Mayor a 64 °C",
            "Mayor a 72 °C",
            1
        )
        var q21 = QuestionData(
            21,
            "¿Cuánta cobertura se le debe agregar al McSundae?",
            "3 onzas",
            "2 onzas",
            "1/2 onza",
            "1 onza",
            4
        )
        var q22 = QuestionData(
            22,
            "Color del Teflon en los días pares",
            "Azul",
            "Negro",
            "Rojo",
            "Verde",
            3
        )
        var q23 = QuestionData(
            23,
            "¿Cuánta cobertura se le debe agregar al McFlurry?",
            "3 onzas",
            "4 onzas",
            "1 onza",
            "2 onzas",
            3
        )
        var q24 = QuestionData(
            24,
            "Tiempo cocción del Tocino en parrilla",
            "120 s",
            "115 s",
            "108 s",
            "110 s",
            4
        )
        var q25 = QuestionData(
            25,
            "Tiempo secundario de las Duquesas",
            "20 min",
            "15 min",
            "10 min",
            "8 min",
            3
        )
        var q26 = QuestionData(
            26,
            "Temperatura interna de las carnes",
            "Sobre los 68 °C",
            "Sobre los 69 °C",
            "Sobre los 74 °C",
            "Sobre los 78 °C",
            2
        )
        var q27 = QuestionData(
            27,
            "Temperatura del UHC de Fritos",
            "89 °C",
            "98 °C",
            "93 °C",
            "85 °C",
            3
        )
        var q28 = QuestionData(
            28,
            "Temperatura del UHC de Carnes",
            "89 °C",
            "74 °C",
            "85 °C",
            "89 °C",
            3
        )
        var q29 = QuestionData(
            29,
            "Cuál de las opciones no corresponde a una Máxima de Cooltura",
            "Hacemos las cosas fáciles",
            "Nos gusta sorprenderte",
            "El cliente es único",
            "Generamos sonrisas",
            2
        )
        var q30 = QuestionData(
            30,
            "Duración del Tocino en mesa de condimentación",
            "1 día",
            "8 horas",
            "4 horas",
            "6 horas",
            4
        )
        var q31 = QuestionData(
            31,
            "Duración de las Nuggets en UHC",
            "2 horas",
            "1 hora",
            "20 min",
            "30 min",
            3
        )
        var q32 = QuestionData(
            32,
            "Duración del McPollo en UHC",
            "20 min",
            "1 hora",
            "2 horas",
            "30 min",
            4
        )
        var q33 = QuestionData(
            33,
            "Duración del Crispy en el Congelar de la pared",
            "30 min",
            "2 horas",
            "1 día",
            "2 días",
            3
        )
        var q34 = QuestionData(
            34,
            "Duración de las Nuggets en el congelador de la pared",
            "1 día",
            "2 horas",
            "4 horas",
            "30 min",
            2
        )
        var q35 = QuestionData(
            35,
            "Duración de las Nuggets en el congelador de aire forzado",
            "30 min",
            "24 horas",
            "2 horas",
            "1 hora",
            2
        )
        var q36 = QuestionData(
            36,
            "Duración del Crispy en el congelador aire forzado",
            "30 min",
            "20 min",
            "2 horas",
            "1 día",
            1
        )
        var q37 = QuestionData(
            37,
            "Duración del Crispy en el UHC",
            "3 horas",
            "1 hora",
            "4 horas",
            "2 horas",
            4
        )
        var q38 = QuestionData(
            38,
            "Duración del McPollo en el congelador aire forzado",
            "1 día",
            "30 min",
            "20 min",
            "2 horas",
            1
        )
        var q39 = QuestionData(
            39,
            "Duracion del McPollo en el congelador de la pared",
            "1 día",
            "30 min",
            "2 horas",
            "2 días",
            3
        )
        var q40 = QuestionData(
            40,
            "Duración del Tocino Americano refrigerado",
            "7 días cerrado y 5 días abierto",
            "30 días",
            "7 días",
            "20 días",
            2
        )
        var q41 = QuestionData(
            41,
            "Duración del Tocino Nacional refrigerado",
            "3 días",
            "4 días",
            "7 días cerrado y 5 días abierto",
            "30 días",
            3
        )
        var q42 = QuestionData(
            42,
            "Temperatura del lechero",
            "80 °C",
            "70 °C",
            "60 °C",
            "90 °C",
            2
        )
        var q43 = QuestionData(
            43,
            "Tiempo del lechero",
            "1 hora",
            "4 horas",
            "6 horas",
            "3 horas",
            4
        )
        var q44 = QuestionData(
            44,
            "Tiempo del Café en la Jarra de Café",
            "20 min",
            "1 hora",
            "1 hora 30 min",
            "30 min",
            4
        )
        var q45 = QuestionData(
            45,
            "Duración del Tomate a T Ambiente",
            "1 día",
            "1 semana",
            "3 días",
            "10 días",
            4
        )

        que.add(q1)
        que.add(q2)
        que.add(q3)
        que.add(q4)
        que.add(q5)
        que.add(q6)
        que.add(q7)
        que.add(q8)
        que.add(q9)
        que.add(q10)
        que.add(q11)
        que.add(q12)
        que.add(q13)
        que.add(q14)
        que.add(q15)
        que.add(q16)
        que.add(q17)
        que.add(q18)
        que.add(q19)
        que.add(q20)
        que.add(q21)
        que.add(q22)
        que.add(q23)
        que.add(q24)
        que.add(q25)
        que.add(q26)
        que.add(q27)
        que.add(q28)
        que.add(q29)
        que.add(q30)
        que.add(q31)
        que.add(q32)
        que.add(q33)
        que.add(q34)
        que.add(q35)
        que.add(q36)
        que.add(q37)
        que.add(q38)
        que.add(q39)
        que.add(q40)
        que.add(q41)
        que.add(q32)
        que.add(q43)
        que.add(q44)
        que.add(q45)

        return que
    }
}