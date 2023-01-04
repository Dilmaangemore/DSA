Given a sequence of N strings , the task is to check if any two similar words come together then they destroy each other than print the number of words left in the sequence after this pairwise destruction.

Input Format

Single Integer N.
Sequence of N strings.

Constraints

1 <=N <= 1000
1 <=str.length()  <= 10

Output Format

Print Number of words left in the sequence.

Sample Input 0

4
aa ab ab ac

Sample Output 0

2

Explanation 1

Here[aa{ab, ab}, aa]  =>  [{aa, aa}]=> [];

