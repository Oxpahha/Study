set_count = int(input())
result = ''

for _ in range(set_count):
    basket_n = int(input())
    list_temp = input().split()
    count_dict = {i: list_temp.count(i) for i in list_temp}
    dict_keys = []
    after_sale_value = []
    result_temp = 0

    [dict_keys.append(k) for k in count_dict.keys()]  

    for i in range(len(count_dict)):
        before_sale_value = count_dict[dict_keys[i]]
        if before_sale_value >= 3:
            after_sale_value += [before_sale_value-(int(before_sale_value/3))]
        else: after_sale_value += [before_sale_value]
    
    if basket_n > 1:
        for i in range(len(count_dict)):
            result_temp += int(dict_keys[i])*int(after_sale_value[i])
    else: result_temp = int(dict_keys[0])*int(before_sale_value)
    
    result += f'{result_temp}\n'
print(result.rstrip('\n'))
    


