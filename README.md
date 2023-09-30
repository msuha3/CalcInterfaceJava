Description:
This Java application consists of a simple calculator with a graphical user interface (GUI) component (CalculatorFrame) and a command-line interface component (CalculatorInterface).

Features:
CalculatorFrame (GUI):

Large buttons for operations (+, -, *, /, %, =)
Three text fields for input and output.
Changing button color when an operation is selected.
CalculatorInterface (CLI):

Allows the user to input values and operations via the command line.
Performs calculations based on input and updates the GUI.
How to use:
Using the GUI:

Open the application. You will see three text fields and six buttons.
The first two text fields are for input, and the third displays the result.
Choose the operation by clicking on a button. The button will change its color.
Input values in the text fields and click on = to view the result.
Using the CLI:

When you run the CalculatorInterface, you will be prompted to:
Enter a value for the top calculator field.
Enter an operator code (1 for +, 2 for -, 3 for *, 4 for /, 5 for %).
Enter a value for the middle calculator field.
The program will then calculate and update the GUI with the values and results.
Classes & Methods:
CalculatorFrame:

clear(): Clears all text fields and resets the operation.
setButtons(): Updates button colors based on the selected operation.
getOp(): Returns the currently selected operation code.
setOp(int): Sets the current operation based on provided code.
calculate(double, double, int): Returns the result of the operation.
getValue1(), getValue2(), getValue3(): Get the values from the text fields.
setValue1(double), setValue2(double), setValue3(double): Set the values in the text fields.
CalculatorInterface:

run(): Prompts the user to enter values and an operation code, performs the calculation, and updates the GUI.
Requirements:
Java Development Kit (JDK) to compile and run.
The Java Swing library (included in the JDK) for the GUI component.
Note:
Always make sure you enter valid numeric inputs in the GUI or CLI to avoid unexpected behavior or errors.




