# Twisted Prime Number
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a number N. Check whether N is a Twisted Prime number or not.<br>
<strong>Note</strong>: A number is called Twisted Prime if it is a prime and its reverse is also a prime.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 97
<strong>Output:</strong> 1
<strong>Explanation:</strong> 97 is a prime number. Its 
reverse 79 isalso a prime number. Thus 
97 is a  twisted Prime and so, answer is 1.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> N = 43
<strong>Output:</strong> 0
<strong>Explanation:</strong> 43 is a prime number but its 
reverse 34 is not a prime.So, 43 is not a 
twisted prime and thus, answer is 0.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong>You don't need to read input or print anything.Your task is to complete the function <strong>isTwistedPrime()</strong> which takes a number N as input parameter and returns 1 if it is a twisted prime number.Otherwise, it returns 0.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>(O(sqrt(max(N,RevN))), here RevN is the reverse of N.<br>
<strong>Expected Space Complexity:</strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>9</sup></span></p>
</div>