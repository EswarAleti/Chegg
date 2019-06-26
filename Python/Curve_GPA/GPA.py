#importing random to generate random numbers 
import random
#declare a list called GPA
GPA=[]
#These indexes denotes the random number between startFrom to endAt i.e 0 to 40 
startFrom=0
endAt=40
#This function generate GPA list using random()
def generateRandomGPA():
    #For 20 students
    for i in range(20):
        #generate a random number between startFrom, endAt i.e 0 to 40
        marks=random.randint(startFrom,endAt)
        #points = marks/10
        GPA.append(marks/10)
def curveGPA():
    global GPA
    #maxGPAInList defines the maximum GPA by a student in list GPA
    maxGPAInList = max(GPA)
    #maxGPA defines the maximum GPA here a student cannot get 4.0 so maxGPA is 4
    maxGPA = endAt/10
    #Finding deviation of maxGPA to maxGPAInList of GPA list
    deviation = maxGPA - maxGPAInList
    #Adding the deviation to every student gpa
    #round each gpa to 1 decimal point
    GPA = [round(x+deviation,1) for x in GPA]
    #returning the amount of curve
    return deviation
generateRandomGPA()
print("Before curving")
print(GPA)
deviation = curveGPA()
print("Deviation is ",round(deviation,1))
print("After curving")
print(GPA)