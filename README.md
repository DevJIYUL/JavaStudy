# JavaStudy
This is about Java Basic
## Abstract
Here is two objects Circle,Rect
If Circle,Rect has same property make [Shape](https://github.com/DevJIYUL/JavaStudy/blob/main/src/com/abst/Shape.java) abstract class and define method only
concrete content will depend on class

Define abstract class
```
public abstract class Shape
```
Make class [Circle](https://github.com/DevJIYUL/JavaStudy/blob/main/src/com/abst/Circle.java),[Rect](https://github.com/DevJIYUL/JavaStudy/blob/main/src/com/abst/Rect.java) extends Shape
Add override method and concrete method

[ShapeUser](https://github.com/DevJIYUL/JavaStudy/blob/main/src/com/abst/ShapeUser.java) class can call Circle,Rect as Shape object

## Exception
Java has not working with two ways Error, Exception
Exception usually user's or wrong systex error, error is hardware or application error
Two types of Exception Exception is error in processing compile, Runtime Exception is not in processing compile
In this two case, must catch out

Try catch is Catching out error in code
```
try{
  code...(might error)
}catch(Exceptiontype){
  catching error
}finally{
  if catch...
}
```

There are lots of type of Exception, so this is the way error exception depends on 
```
try{
  code...(might error)
}catch(NullPointException nullpointexception){
  catching error NullPointException
}catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception){
  catching error ArrayIndexOutOfBoundsException
}finally{
  if catch...
}
```
Can catch out error as much as you want

## Inherit
