
print("Hello, World!")

name = "Mayuri"
age = 21
percentage = 98.93
student_class = "SY CSE"
print(f"My name is {name} and I am {age} years old.")
print(f"I am in class", student_class)
print(f"My percentage is {percentage}%")

print(type(name))
print(type(age))
print(type(student_class))
print(type(percentage))

print(isinstance(age, int))
print(isinstance(name, str))
print(isinstance(student_class, str))
print(isinstance(age, str))
print(isinstance(name, int))
print(isinstance(percentage, float))

a = 21
b = 11
c = a + b
d = a - b
e = a * b
f = a / b              
g = a % b              
h = a // b             
i = a ** b            

print(c, "  ", d, "  ", e, "  ", f, "  ", g, "  ", h, "  ", i)


"""value = input("Enter your value: ")
print("You have entered: ", value)"""


string1 = "Hello"
print(string1 + "  "+ str(len(string1)))