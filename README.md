# Polynomial-Operations
 
 
A class called MyPolynomial, which models polynomials of degree-n (see equation), is designed as shown in the class diagram. 
 
It contains: 
 An instance variable named coeffs, which stores the coefficients of the n-degree polynomial in a double array of size n+1, where c0 is kept at index 0. 
 A constructor MyPolynomial(coeffs:double...) that takes a variable number of doubles to initialize the coeffs array, where the first argument corresponds to c0. 
 The three dots is known as varargs (variable number of arguments), which is a new feature introduced in JDK 1.5. It accepts an array or a sequence of comma-separated arguments. The compiler automatically packs the comma-separated arguments in an array. The three dots can only be used for the last argument of the method. 
Hints: 
public class MyPolynomial { 
private double[] coeffs; 
public MyPolynomial(double... coeffs) {  // varargs 
this.coeffs = coeffs;                 // varargs is treated as array 
} 
...... 
} 
// Test program 
// Can invoke with a variable number of arguments 
MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3); 
MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5); 
// Can also invoke with an array 
Double coeffs = {1.2, 3.4, 5.6, 7.8} 
MyPolynomial p2 = new MyPolynomial(coeffs);
 A method getDegree() that returns the degree of this polynomial. 
 A method toString() that returns "cnx^n+cn-1x^(n-1)+...+c1x+c0". 
 A method evaluate(double x) that evaluate the polynomial for the given x, by substituting the given x into the polynomial expression. 
 Methods add() and multiply() that adds and multiplies this polynomial with the given MyPolynomial instance another, and returns this instance that contains the result. 
You are required to: 
 Write the MyPolynomial class. 
 Also write a test driver (called TestMyPolynomial) to test all the public methods defined in the class. 
