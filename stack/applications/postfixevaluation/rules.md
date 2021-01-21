<h1>rules of evaluating a postfix expression</h1>
<ul>
  <li>While reading the expression from left to right, push the element in the stack if it is an <b>operand</b>.
      <p><b>if we want to convert that operand character into integer,then we will use <h3>'Character' class</h3>
        and we subtract 48 from that converted character value since the ascii value of zero is 48.
        for example if we have 5 as a character then its ASCII value is 53.to retain its value we subtract the ascii value of zero from it.</b></p>
    watch these lines of code.
    <pre>
    char ch='5';
    if(Character.isDigit(ch)){
      stk[++top]=(double)ch-'0';
    }</pre>
  </li>
  <li>Pop the two operands from the stack, if the element is an <b>operator</b> and then evaluate it.
    <ul><p>consider that a stack contains the operands arranged in this manner</p>
      <li>3</li>
      <li>2</li>
      <li>4</li><li>5</li>
    </ul>
    <p><b>now consider there is <b>_</b> operation.then first operand popped is 2 and second operand popped is 3,thus the operation performed is 2-3=-1
      the resultant -1 is again pushed into the stack</b></p></ul>
  </li>
  <li>Push back the result of the evaluation. Repeat it till the end of the expression.</li>
 </ul>
