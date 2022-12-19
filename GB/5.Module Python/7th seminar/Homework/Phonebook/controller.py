import view
import import_data
import export_data

def main():
    request = view.user_request()
    test_list = list(request[0].split())
    if 1 == request[1]:

        if (len(test_list) == 4):
            import_data.write_data(test_list)
        else:
            print('Введены некорректные данные')

    else:
        view.out_put(export_data.exp(test_list))      