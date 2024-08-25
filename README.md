# JAVA-CALCULATOR

## Overview

This project is a simple calculator application developed in Java. It supports basic arithmetic operations, such as addition, subtraction, multiplication, and division. The calculator is implemented using the Java Swing library for the graphical user interface (GUI), making it easy to use and visually appealing.<br>

## Features

• Basic Operations: Addition, subtraction, multiplication, and division.<br>
• Decimal Operations: Supports floating-point arithmetic.<br>
• Clear Function: Easily reset the current input.<br>
• Delete Function: Remove the last digit entered.<br>
• Negate Function: Toggle the sign of the current input.<br>
• User-Friendly Interface: Intuitive design with a clean layout.<br>

## Installation

To run this calculator on your local machine, follow these steps:<br>

1. Clone the Repository:<br>
&nbsp;&nbsp;&nbsp;&nbsp;git clone https://github.com/ManavPatel0507/Calculator-in-java.git

2. Navigate to the Project Directory:<br>
&nbsp;&nbsp;&nbsp;&nbsp;cd java-calculator

3. Compile the Source Code:<br>
&nbsp;&nbsp;&nbsp;&nbsp;javac Calculator.java

4. Run the Application:<br>
&nbsp;&nbsp;&nbsp;&nbsp;java Calculator

## Usage

1. Launch the application by running the Calculator class.<br>
2. Use the number buttons to input digits.<br>
3. Perform arithmetic operations using the +, -, *, and / buttons.<br>
4. Click the = button to display the result.<br>
5. Use the C button to clear the input, Del to delete the last digit, and (-) to toggle the sign of the input.<br>

## Code Structure

• Calculator.java: The main class that sets up the GUI and handles user interactions.<br>
• JTextField: Displays the current input and results.<br>
• JButton[]: Array of buttons for digits and operations.<br>
• JPanel: Organizes the layout of buttons in a grid.<br>

## Key Methods

• actionPerformed(ActionEvent e): Handles button click events.<br>
• Double.parseDouble(String s): Converts input from String to double for calculations.<br>
• switch(operator): Determines which operation to perform based on user input.<br>

## Contributing

If you'd like to contribute to this project, please fork the repository, create a new branch, and submit a pull request. Contributions for new features, bug fixes, or UI enhancements are welcome!

## Contact

For any questions or suggestions, feel free to reach out via manavp190.dev@gmail.com or open an issue on this repository.

