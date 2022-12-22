def category(f, param=0):
    li=[]
    for i in f:
        if param == '1':
            li.append(i.split()[0])
        elif param == '2':
            li.append(i.split()[1])
        elif param == '3':
            li.append(i.split()[2])
    return '\n'.join(li)