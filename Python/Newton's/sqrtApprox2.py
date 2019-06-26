import math
class newton:
    sqrtOfThis = 0
    pythonEstimate = 0

    #newton constructor
    def __init__(self, sqrtOfThis):
        self.sqrtOfThis = sqrtOfThis
        diff = 0
        toler = 0.000001
        newton_Estimate = 1
        global pythonEstimate
        pythonEstimate=math.sqrt(sqrtOfThis)
        while True:
            newton_Estimate = (newton_Estimate + sqrtOfThis / newton_Estimate) / 2
            diff = newton_Estimate - pythonEstimate
            # If limit reached then break the while loop
            if self.limitReached(diff, toler):
                break
        print(newton_Estimate)

    # Function to check limit reached or not, if reached return True else return False
    def limitReached(self,diff,toler):
        if diff <= toler:
            reached = True
        else:
            reached = False
        return reached

    # Implementation of improveEstimate() function
    def improveEstimate(self,sqrtOfThis,noOfTimes):
        diff = 0
        newton_Estimate=1
        for i in range(noOfTimes):
            newton_Estimate = (newton_Estimate + sqrtOfThis / newton_Estimate) / 2
            diff = newton_Estimate - pythonEstimate
        # return estimated squareroot
        return newton_Estimate

newton=newton(13)
print(newton.limitReached(2,1))
print(newton.improveEstimate(2,1))
print(newton.limitReached(2,1))
print(newton.improveEstimate(9,1))