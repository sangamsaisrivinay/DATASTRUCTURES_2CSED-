<pre>Working from left to right, one token at a time, determine whether or not 
the current token is an operand, an operator, or an opening or closing parenthesis.

If the token is an operand, append it to the postfix expression. 
Operands always appear in the same order in the postfix expression as they do in the infix expression.

If the token is an opening parenthesis, push it to the stack.
This marks the beginning of an expression that should be evaluated separately.

If the token is a closing parenthesis, until an opening parenthesis is encountered at the top of the stack,
pop each operator from the stack and append to the postfix expression. 
This marks the end of the operands and operators located within the current set of parentheses.

If the token is an operator and it has greater precedence than 
the operator on the top of the stack, push the token to the stack.

If the token is an operator and it has lower precedence than the operator on the top of the stack,
until the operator on top of the stack has lower precedence than the token, or until the stack is empty,
pop each operator from the stack and append them to the postfix expression. Then push the current token to the stack.

If the token is an operator and it has the same precedence as the operator on the top of the stack,
and the operator on top of the stack is left-to-right associative, until the operator on top of the stack has lower precedence than the token,
or until the stack is empty, pop each operator from the stack and append them to the postfix expression. Then push the current token to the stack.

If the token is an operator and it has the same precedence as the operator on the top of the stack,
but the operator on top of the stack is right-to-left associative, push the current token to the stack.

Finally, once all of the infix tokens have been evaluated, pop any remaining operators from the stack,
one at a time, and append each of them to the postfix expression.</pre>
example
<img src="https://prepinsta.com/wp-content/uploads/2020/06/Infix-to-Posting-Conversion-in-C-using-Stacks.png" alt="can't load image">

operator precedence

<img src="https://lh3.googleusercontent.com/proxy/cId-ruaz6u5Oocc6d8ALbDrIWLgttF0pCV_BlAZdaumELpKvMruuolAisVgmr0BQobSiO5u605f_hVmrY4MnAt0_eLsO5lQWBE8PJG3pAZHdWZZWAiYODS2JUjLydEOqxY2RomWBu7DI">
