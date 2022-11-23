# Напишите пр-му которая принимает на вход 5 чисел и находит максимальное из них.

#  1, 4, 8, 7, 5     -> 8
#  78, 55, 36, 90, 2 -> 90

nums = []
for i in range(5):
    nums.append(int(input(f'Введите {i+1} число: ')))
max_num = nums[0]
for i in range(len(nums)):
    if nums[i] > max_num:
        max_num = nums[i]
print(f'Максимальные число: {max_num}')

##

nums = []
for i in range(5):
    nums.append(int(input(f'Введите {i+1} число: ')))
max_num = nums[0]
for i in nums:
    if i > max_num:
        max_num = i
print(f'Максимальные число: {max_num}')

##

nums = []
for i in range(5):
    nums.append(int(input(f'Введите {i+1} число: ')))
print(f'Максимальные число: {max(max_num)}')

##

max_num = int(input())
for i in range(4):
    num = int(input())
    if num > max_num:
        max_num = num
print(f'Максимальные число: {max_num}')

##

print(max(list(map(int, input().split(', ')))))