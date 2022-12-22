path_database = 'GB/5.Module Python/8th seminar/Homework/Sem/file.csv'

def write(data):
    global path_database
    with open(path_database,'a',encoding= 'utf-8') as file:
        file.writelines(data)
          
def read():
    global path_database
    with open(path_database,'r',encoding= 'utf-8') as file:
        return file.readlines()

# a = ['st1','sb1', ['Игорь', 'Шмыгонь', 'Чебупятко']]
# with open(path_database,'a',encoding= 'utf-8') as file:
#     file.writelines(f'\n{str(a)}')