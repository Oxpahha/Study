import model_sum
import view

def button_click():
    val_a = view.get_value()
    val_b = view.get_value()
    model_sum.init(val_a, val_b)
    result = model_sum.summ()
    view.data_view(result)