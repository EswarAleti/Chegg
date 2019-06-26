N,X= input().split()
N = int(N)
X = int(X)
powerList = [int(val) for val in input().split()]
indexList=list(range(1, N+1))
for i in range(0,X):
    length = len(powerList)
    if length >= X:
        dummyPowerList = powerList[:X]
        dummyIndexList = indexList[:X]
        powerList = powerList[X:]
        indexList = indexList[X:]
    else:
        dummyPowerList=powerList
        dummyIndexList=indexList
    maxIndex=dummyPowerList.index(max(dummyPowerList))
    print(dummyIndexList[maxIndex],end=" ")
    del dummyPowerList[maxIndex]
    del dummyIndexList[maxIndex]
    dummyPowerList = [num-1 if num else 0 for num in dummyPowerList]
    if length >=X:
        powerList.extend(dummyPowerList)
        indexList.extend(dummyIndexList)
    else:
        powerList = dummyPowerList
        indexList = dummyIndexList