Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.

The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.

For example, if the price of a stock over the next 7 days were prices = [100,80,60,70,60,75,85], then the stock spans would be result = [1,1,1,2,1,4,6].
Input Format

Single Integer N.
N intergers seperated by single space.
Constraints

 1<=N  <=10^5 
 1<= prices[i] <= 10^5
Output Format

Print the result Array seperated by single space.

Sample Input 0

7
100 80 60 70 60 75 85
Sample Output 0

1 1 1 2 1 4 6
Explanation 0

Traversing the given input span for 100 will be 1 and 80 is smaller than 100 so the span is 1 and 60 is smaller than 80 so the span is 1 and 70 is greater than 60 so the span is 2 and so on. Hence the output will be 1 1 1 2 1 4 6