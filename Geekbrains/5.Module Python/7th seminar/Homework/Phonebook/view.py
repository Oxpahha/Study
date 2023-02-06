def user_request():
    flag = True
    while flag:
        request = input('Введите запрос.\n0 - Поиск телефона в справочнике.\n'\
                    '1 - Занесение данных в справочник.\n'\
                    '2 - Выход.\n:'    )

        if request == '0':
            req_export = input('Поиск телефона в справочнике.\n'\
                                'Введите - Имя Фамилию Город или Номер телефона ' \
                                '(через пробел, если несколько вводных данных) \n:')
            flag = False
            return (req_export, 0)
        if request == '1':
            req_import = input('Занесение данных в справочник.\n'\
                                'Введите - Имя Фамилию Город Телефон(через пробел)\n:')
            flag = False
            return (req_import, 1)    
        if request == '2':
            print('Пока!')
            exit()


def out_put(list_export : list):
       print(list_export)