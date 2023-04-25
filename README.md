# C-352-Excercises
solve the following 
For Factorizer
------------------
Overview
In this exercise, you will write a program that receives an integer value from a user and then calculates and prints out a list that includes all of the factors of that number, whether or not the number is perfect, and whether or not the number is prime.

A perfect number is a number where all the factors of the number, excluding the number itself, add up to that number. For example, the first perfect number is 6 because its factors 1, 2, and 3 add up to 6.

A prime number is defined as a number greater than 1 that has only itself and 1 as factors. For example, 3 is a prime number, but 4 is not.

This exercise is provided to give you practice applying the skills you have learned in this course, but you will not submit it to your instructor nor will it be graded.

You should complete this exercise before continuing on with the course.
If you have problems completing this exercise, review the course content up to this point and try again.
Contact an instructor or TA if you have questions about this exercise or cannot resolve problems on your own.
Remember to sync your code with your classwork repository after you have completed the exercise.
Requirements
This program must be in a new console application named Factorizer.
This program must ask the user for the number the program will factor.
The program must print out the original number.
The program must print out each factor of the number (not including the number itself).
The program must print out the total number of factors for the number.
The program must print out whether or not the number is perfect.
The program must print out whether or not the number is prime.
Sample Program Output
What number would you like to factor? 6
The factors of 6 are:
1 2 3 6
6 has 4 factors.
6 is a perfect number. 
6 is not a prime number.


For InterestCalculator
----------------------------
Overview
In this lab, you will write an interest calculator program that works as described in this example:

John has $500 to invest. Sue knows of a mutual fund plan that pays 10% interest annually, compounded quarterly. That is, every three months, the principal is multiplied by 2.5% (the 10% annual rate divided by 4 because it is compounded 4 times per year) and the result is added to the principal.

More generally, the new amount each quarter is equal to:

CurrentBalance * (1 + (QuarterlyInterestRate / 100))
Your assignment is to write a program that will tell John how much money will be in the fund after a specified number of years.

This exercise is provided to give you practice applying the skills you have learned in this course, but you will not submit it to your instructor nor will it be graded.

You should complete this exercise before continuing on with the course.
If you have problems completing this exercise, review the course content up to this point and try again.
Contact an instructor or TA if you have questions about this exercise or cannot resolve problems on your own.
Remember to sync your code with your classwork repository after you have completed the exercise.
Requirements
Make the program general; that is, it should prompt for the following inputs and use those inputs in the calculations.

The annual interest rate
The initial amount of principal
The number of years the money is to stay in the fund
The output should include the following for each year:

The year number
The principal at the beginning of the year
The total amount of interest earned for the year
The principal at the end of the year
Sample Program Output
How much do you want to invest? 500
How many years are investing? 10
What is the annual interest rate % growth? 10

Calculating...
Year 1:
Began with $500.00
Earned $51.91
Ended with $551.91

Year 2:
Began with $551.91
Earned $57.30
Ended with $609.20

Year 3:
Began with $609.20
Earned $63.24
Ended with $672.44

...
Additional Challenges
Change the program so that interest is compounded monthly.
Change the program so that the user can choose from quarterly, monthly, or daily interest compound periods.
