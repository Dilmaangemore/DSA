Given a string Str in Postfix expression calculate the result of this expression.
String has 2 types of char.
- case 1: char type1 = [0-9]
- case 2: char type2 = [+, - , / ,* ]
(Note : It can be assumed that the expression is always valid.)
Input Format

String with a postfix expression.

Constraints

1 <=STR.LENGTH()  <=10^5 

Output Format

Integer Output.

Sample Input 0

4572+-*
Sample Output 0

-16
Explanation 0

Infix expression : 4 * (5 - (7 + 2)) => -16