n=int(input())
while n>0:
  x=raw_input().strip().split()
  if(len(x)==3):
    print(x[0][0].title()+'.'+' '+x[1][0].title()+'.'+' '+x[2].title())
  elif(len(x)==2):
    print(x[0][0].title()+'.'+' '+x[1].title())
  elif(len(x)==1):
    print(x[0].title())
  n=n-1
