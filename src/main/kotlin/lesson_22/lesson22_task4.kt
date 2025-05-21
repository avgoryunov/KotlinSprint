package org.example.lesson_22

class MainScreenView(
    val viewModel: ViewModel = ViewModel(),
) {
    fun onStart() {
        viewModel.stateChanged = { showData() }
        showData()
        viewModel.loadData()
    }

    fun showData() {
        if (viewModel.state.isLoading) println("Загрузка данных")
        else {
            if (viewModel.state.data != null) println("Наличие загруженных данных")
            else println("Отсутствие данных")
        }
    }
}

class ViewModel {
    data class State(
        val data: String? = null,
        val isLoading: Boolean = false,
    )

    var stateChanged: (() -> Unit)? = null

    var state = State()

    fun loadData() {
        Thread.sleep(5000)
        state = state.copy(isLoading = true)
        stateChanged?.invoke()
        Thread.sleep(5000)
        state = state.copy(data = "Данные", isLoading = false)
        stateChanged?.invoke()
    }
}

fun main() {
    val mainScreenView = MainScreenView()
    mainScreenView.onStart()
}