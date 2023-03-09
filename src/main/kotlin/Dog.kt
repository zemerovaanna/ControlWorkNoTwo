class Dog: AnimalDog() {
    override var name = "Дружок"
    override var breed = "Бигль"
    override var character = "Добрый"
    override var color = "чёрно-рыже-белый"
    override var high: Double
        get() = 33.0
        set(value) {}
    override var weight: Double
        get() = 9.0
        set(value) {}

    override fun bodyMassIndex() {
        var bmi:Double = weight/(high*high)/100
        when(bmi)
        {
            in 0.1 .. 0.2 -> println("Истощение")
            in 0.3..0.4 -> println("Недостаточный вес")
            in 0.5..0.6 -> println("Нормальный вес")
            in 0.7..0.8 -> println("Избыточный вес")
            in 0.9 .. 1.0 -> println("Ожирение")

        }

    }
    override fun live(){
        println("Домашнее животное.")
    }
    override fun food(){
        println("Овсяная, гречневая, манная крупы, кальцинированный творог, кисломолочные продукты, вареные яйца, небольшое количество отварных овощей и зелени.")
    }
    override fun skills()
    {
        println("Охотничья порода.")
    }
    override fun move()
    {
        println("20 до 30 миль в час.")
    }
    override fun workDog() {
        println("Биглей часто приводят в больницы и хосписы. Они помогают скрасить одиночество, залечить душевную рану.")
    }
    override fun careDog(){
        println("Регулярно вычёсывать, стричь когти и иногда купать.")
    }
}