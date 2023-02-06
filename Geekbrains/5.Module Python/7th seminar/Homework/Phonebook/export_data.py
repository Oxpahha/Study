import csv

path_database = 'GB/5.Module Python/7th seminar/Homework/Phonebook/phone_database.csv'

def exp(str_find):
    global path_database
    with open(path_database, encoding='utf-8') as file:
        reader = csv.reader(file)
        result_list = []
        for i in reader:
            count = 0
            if str_find[count] in i:
                count += 1
                if len(str_find) > 1:
                    for a in i:
                        if str_find[count] == a:
                            count += 1
                            if len(str_find) > 2:
                                for e in i:
                                    if str_find[count] == e:
                                        result_list.append(i)
                                    count = 2
                            else: result_list.append(i)
                        count = 1
                else: result_list.append(i)
            count = 0
        return result_list

