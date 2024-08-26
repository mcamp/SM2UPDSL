# DSL: Automatic state machine transformation to timed automata

This DSL is designed to develop state machines, which are then automatically translated to [UPPAAL timed automata](https://uppaal.org/).
This approach is inspired by allowing developers to build robotic behaviors using state machines, which then can be formally verified.
The DSL is built using [Xtext](https://eclipse.dev/Xtext/).

The EBNF of this DSL is:

```
Root                ::= 'project' ID VariableDefinition* Machine*
VariableDefinition  ::= Type ID ':=' Exp
Machine             ::= 'machine' ID '{' (VariableDefinition | State | Transition)* '}'
State               ::= 'fail'? 'state' ID ('with' Machine)?
Transition          ::=	ID '->' ID // fromState -> toState
                          ('guard' Exp)? ('when' ID)? ('after' Float)? ('signal' ID)? // guards, signals, timeout
                          ('actions' '{' Statement* '}')?
Statement           ::= VarAssignation
VarAssignation      ::= ID ':=' Expression
Exp                 ::= ... // Boolean operations, number constants, and variable usage
Type                ::= 'bool' // Only boolean variables
```
