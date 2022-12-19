import csv

path_database = 'GB/5.Module Python/7th seminar/Homework/Phonebook/phone_database.csv'

def write_data(str_date):
    global path_database
    with open(path_database, 'a',newline= '',encoding= 'utf-8') as file:
        writer = csv.writer(file)
        writer.writerow(str_date)