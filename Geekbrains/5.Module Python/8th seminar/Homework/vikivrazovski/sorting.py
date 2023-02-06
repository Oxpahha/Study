def sort(n, f, param=0):
    li=[]
    if param == '6' and len(n) == 1:
        for i in f:
            split_str = i.split()
            g = list(filter(lambda x: x in n.upper(), split_str[0]))
            if len(g):
                li.append(i)
    elif param == '6' and len(n) > 1:
        for i in f:
            e = i.split(" ")
            f = n[0:1].upper() + n[1:]
            if f in e[0]:
                li.append(i)
    else:
        for i in f:
            if n.lower() in i.lower():
                li.append(i)
    return '\n'.join(li)
