import pytest

def test_addition():
    number1 = 20
    number2 = 30
    sum = number1 + number2
	

def test_subtraction():
	number1 = 50
	number2 = 2
	sub = number1 - number2

@pytest.mark.activity
def test_multiplication():
	number1 = 10
	number2 = 5
	multi = number1 * number2

@pytest.mark.activity
def division():
	number1 = 50
	number2 = 10
	div = number1 / number2
