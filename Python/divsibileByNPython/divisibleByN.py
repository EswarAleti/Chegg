count=0
#Iterate from 100 to 1000 inclusive
for i in range (100,1001):
    #if is divisible by 5 or 6 but not by both 5,6 i.e. not divisible by 30
    if (i%5==0 or i%6==0) and i%30!=0:
        print(i,end=" ")
        count=count+1
    # if count=10 then set count to 0 and print a new line
    if count==10:
        print()
        count=0
print()

count=0
#Iterate from 100 to 1000 inclusive
for i in range (100,1001):
    #if i is divisible by both 5,6 then print it and icrement count by 1
    if i%5==0 and i%6==0:
        print(i,end=" ")
        count=count+1
    #if count=10 then set count to 0 and print a new line
    if count==10:
        print()
        count=0