import pandas as pd

def factorielle(n):
    if n==0:
        return 1
    else:
        return n*factorielle(n-1)
    

def addition(n1, n2):
    return n1 + n2