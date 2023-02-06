path_database = 'GB/5.Module Python/8th seminar/Homework/vikivrazovski/file.csv'

def write(data):
    global path_database
    with open(path_database,'a',encoding= 'utf-8') as file:
        file.writelines(data)
          
def read():
    global path_database
    with open(path_database,'r',encoding= 'utf-8') as file:
        return file.readlines()