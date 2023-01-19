pairs_count = int(input())
sum_str = ''
for i in range(pairs_count):
    a, b = map(int, input().split())
    sum_str += f'{a+b}\n'
print(sum_str)