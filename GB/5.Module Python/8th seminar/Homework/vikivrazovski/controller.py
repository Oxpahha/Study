import view
import model
from sorting import sort
from categories import category

def init(d, run = True):
    while run:
        if d == '1':
            print('\n' + category(model.read(), d), sep='\n')
            init(view.menu())    
        elif d == '2':
            print('\n' + category(model.read(), d), sep='\n')
            init(view.menu())        
        elif d == '3':
            print('\n' + category(model.read(), d), sep='\n')
            init(view.menu())   
        elif d == '4':
            print('\n' + sort(input('Введите № класса: '), model.read()), sep='')
            init(view.menu())   
        elif d == '5':
            print('\n' + ''.join(model.read()), sep='')
            init(view.menu())
        elif d == '6':
            print('\n' + sort(input('Введите фамилию ученика: '), model.read(), d), sep='')
            init(view.menu())    
        elif d == '7':
            print('\n')
            model.write(view.get_user_data())
            print('\nУченик добавлен!\n')
            init(view.menu())
        elif d == '8':
            print('\nДо свидания!\n')
            run = False
        break