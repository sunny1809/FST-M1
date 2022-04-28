import pytest

@pytest.fixture
def num():
    numList = [0,1,2,3,4,5,6,7,8,9,10]
    return numList

def test_sum(num):
    sum = 0
    for i in num:
        sum +=i
        
    assert sum == 55