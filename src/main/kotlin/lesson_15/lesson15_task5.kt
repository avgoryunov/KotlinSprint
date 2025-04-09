package org.example.lesson_15

interface CarsMovements {
    val carName: String

    fun vehicleMovement() {
        println("\"$carName\" Выполнено передвижение автомобиля")
    }
}

interface PassengerTransportation {
    val carName: String
    val currentNumberOfPeopleTransported: Int

    fun passengerLoading() {
        println("\"$carName\" Выполнена посадка $currentNumberOfPeopleTransported пассажиров")
    }

    fun passengerUnloading() {
        println("\"$carName\" Выполнена высадка $currentNumberOfPeopleTransported пассажиров")
    }
}

interface CargoTransportation {
    val currentAmountOfCargoTransported: Int
    val carName: String

    fun cargoLoading() {
        println("\"$carName\" Выполнена $currentAmountOfCargoTransported кг загрузка груза")
    }

    fun cargoUnloading() {
        println("\"$carName\" Выполнена разгрузка $currentAmountOfCargoTransported кг груза")
    }
}

class PassengerCar(
    override val carName: String,
    private var _currentNumberOfPeopleTransported: Int,
) : CarsMovements, PassengerTransportation {

    override var currentNumberOfPeopleTransported: Int
        get() = _currentNumberOfPeopleTransported
        set(value) {
            if (value > 3) {
                throw IllegalArgumentException("\"$carName\" может вместить не более 3 пассажиров")
            }
            _currentNumberOfPeopleTransported = value
        }
}

class CargoTruck (
    override var carName: String,
    private var _currentNumberOfPeopleTransported: Int,
    private var _currentAmountOfCargoTransported: Int,
) : CarsMovements, PassengerTransportation, CargoTransportation {

    override var currentNumberOfPeopleTransported: Int
        get() = _currentNumberOfPeopleTransported
        set(value) {
            if (value > 1) {
                throw IllegalArgumentException("\"$carName\" может вместить не более 1 пассажира")
            }
            _currentNumberOfPeopleTransported = value
        }

    override var currentAmountOfCargoTransported: Int
        get() = _currentAmountOfCargoTransported
        set(value) {
            if (value > 2000) {
                throw IllegalArgumentException("\"$carName\" может перевезти не более 2000 кг")
            }
            _currentAmountOfCargoTransported = value
        }
}

fun main() {

    val passengerCar1 = PassengerCar(
        "Легковой автомобиль 1",
        2,
    )

    val passengerCar2 = PassengerCar(
        "Легковой автомобиль 2",
        3,
    )

    val cargoTruck1 = CargoTruck(
        "Грузовой автомобиль 1",
        1,
        2000,
    )

    try {
        passengerCar1.currentNumberOfPeopleTransported = passengerCar1.currentNumberOfPeopleTransported
        passengerCar2.currentNumberOfPeopleTransported = passengerCar2.currentNumberOfPeopleTransported
        cargoTruck1.currentNumberOfPeopleTransported = cargoTruck1.currentNumberOfPeopleTransported
        cargoTruck1.currentAmountOfCargoTransported = cargoTruck1.currentAmountOfCargoTransported
    } catch (e: IllegalArgumentException) {
        println(e.message)
        return
    }

    passengerCar1.passengerLoading()
    passengerCar1.vehicleMovement()
    passengerCar1.passengerUnloading()

    passengerCar2.passengerLoading()
    passengerCar2.vehicleMovement()
    passengerCar2.passengerUnloading()

    cargoTruck1.cargoLoading()
    cargoTruck1.passengerLoading()
    cargoTruck1.vehicleMovement()
    cargoTruck1.passengerUnloading()
    cargoTruck1.cargoUnloading()
}