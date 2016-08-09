import turtle
def tree(branch,t):
if branch > 5:
t.forward(branch)
t.right(20)
tree(branch-15,t)
t.left(40)
tree(branch-15,t)
t.right(20)
t.backward(branch)
def main():
t = turtle.Turtle()
myWin = turtle.Screen()
t.left(90)
t.up()
t.backward(100)
t.down()
t.color("green")
tree(75,t)
myWin.exitonclick()
main()