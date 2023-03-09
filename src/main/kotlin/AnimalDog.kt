abstract class AnimalDog:Animal {
    abstract var name:String
    abstract var breed:String
    abstract var character:String
    abstract var color:String
    override var high: Double
        get() = 33.0
        set(value) {}
    override var weight: Double
        get() = 9.0
        set(value) {}

    abstract fun workDog()
    abstract fun careDog()
    abstract fun bodyMassIndex()

}