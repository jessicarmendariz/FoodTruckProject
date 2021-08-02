# Food Truck Application

### Overview

Food Truck is an application that allows a user to input the name of up to five Food Trucks. The application can also store the type of food served by the Food Truck and the user's rating of the Food Truck. After inputting the information, the user can select different options from the Main Menu. Inside the Main Menu, the user can see a list of Food Trucks they entered. The user can also see the Average Rating of the five Food Trucks and the highest rated of the five Food Trucks.


### How To Use

Open the Food Truck Application. Input the name of a Food Truck, the type of food, and your overall rating of the Food Truck. You can make up to five unique entries. If you don't have five entries, that is okay, you can "Quit" the entry program and go to the Main Menu. At the Main Menu you can see a list of your Food Trucks with all their data, you can see the average rating of your Food Trucks, or you can see the Food Truck you have rated the highest. Once you have all the information you need, you can Exit the program and remember to "Stay Hungry!".


### Building Food Truck 

For the Food Truck application, multiple technologies were used:
* Strings, String Builders, String Constructors
* Scanners
* Arrays
* Switches
* If Loops
* Objects
* This Keyword

Problem: My biggest hitch was when the user inputs "Quit" the Scanner is not ending and bringing up the Main Menu. 

Solution: I spent way too much time on an easy fix. I moved code around, and reworked the whole logic of my program and then I just did a quick google search and I found different syntax and was able to rearrange a few lines and have a "name.toLowerCase().equals("quit")" work for ending the user input and starting the menu feature.

Problem: The grading scheme specifies that the application be able to quit when the word "Quit" is input as a Food Truck name. I wanted the program to be able to quit at any point in the input process.

Solution: At this time, the application will quit when "Quit" is entered as a Food Truck Name or the type of food served by the Food Truck. I was unable to adjust the syntax to work with integers but I look forward to coming back later in the course or when I figure it out.
