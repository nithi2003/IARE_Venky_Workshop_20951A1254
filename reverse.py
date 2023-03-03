def r(l,a):
    if(a==len(l)):
        return ""
    else:
        def rec(s,j):
            if(j<0):
                return " "
            else:
                return s[j]+rec(s,j-1)

        s1=(rec(l[a],len(l[a])-1))
        return s1+r(l,a+1)
        
        
        
s=input()
l=list(s.split())
a=0
print(r(l,a))
