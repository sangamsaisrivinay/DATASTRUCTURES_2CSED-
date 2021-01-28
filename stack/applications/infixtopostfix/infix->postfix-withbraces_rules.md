<pre>
expression cosists operand,operator,(,)
operator precedence is not considered in braced expressions untill the top elemnt of stack is an operator
 and encountered operator element has same precedence as that of the top element of the stack,in that case operator associativity is considered
1.operand-post to the output
2.operators[+,-,*,/,^] & ( ->push onto the stack
 . ) ->push the operators to output till the most recent ( is encountered and pop that ( from the stack
</pre>
example
<img src="https://prepinsta.com/wp-content/uploads/2020/07/Infix-to-postfix-conversion.webp">
