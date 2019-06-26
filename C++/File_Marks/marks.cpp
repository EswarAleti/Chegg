#include<iostream>
#include<fstream>
#include<string>
#include<sstream>
using namespace std;

//Function that returns grade for given marks
string getGrade(int marks)
{
	float percentage=(marks/20.0)*100;
	if(percentage>=90)
		return "A";
	else if(percentage>=80)
		return "B";
	else if(percentage>=70)
		return "C";
	else if(percentage>=60)
		return "D";
	else
		return "F";
		
}
int main()
{
	//opening a file
	ifstream infile("file.txt");
	//record denotes one line i.e. one student record
	string record;
	//student is an array 150 student and each student have 23 fileds
	//1 for id, 20 for answer, 1 for marks, 1 for grade
	string student[150][23];
	//indexOfStudent should start from 0, noOfStudents help us to find number of students in class
	int indexOfStudent=0,i,j,noOfStudents=0;
	//Iterate untill file ended
	while(getline(infile, record))
	{
		//id stores the student id
		string id="";
		//This for loop is used to find id by copying each character of id untill a space appears
		for(i=0;i<record.length();i++)
		{
			if(record[i]!=' ')
				student[indexOfStudent][0] += record[i];
			else
				break;
		}
		//Answers starts from escond index i.e. 1th index
		int answerIndex=1;
		//This for loop used to store the answers
		//i=i+1 because to skip a space that occurs after student id in file
		for(i=i+1;i<record.length();i++)
		{
			//If answer is a space i.e. not answered make it 0
			if(record[i]==' ')
				student[indexOfStudent][answerIndex++] = "0";
			//Here record[i] is character that is why i used +=
			else
				student[indexOfStudent][answerIndex++] += record[i];
		}
		//Increment indexOfStudent for further records
		indexOfStudent++;
		noOfStudents++;
	}
	//This is used to calculate score and grade
	for(int i=0;i<noOfStudents;i++)
	{
		//Initially each student has score 0
		int score=0;
		for(int j=1;j<21;j++)
		{
			//answer has T or F or 0
			char answer=student[i][j].at(0);
			if(answer=='T')
				score += 2;
			else if(answer=='F')
				score -=1;
		}
		//Below 3 lines used to convert int to string
		ostringstream marks;
		marks << score;
		student[i][21]=marks.str();
		//Assign grade by calling getGrade() by passing score
		student[i][22]=getGrade(score);
	}
	
	//This is used to display the output
	for(int i=0;i<noOfStudents;i++)
	{
		for(int j=0;j<23;j++)
			cout << student[i][j] << " ";
		cout << " " << endl;
	}
	return 0;
}
