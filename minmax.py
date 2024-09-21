#1 2 3 4 5
#minsum = 10
#maxsum = 14


def min_max(arr):
    arr.sort(arr)
    minsum = sum(arr[:4])
    maxsum = sum(arr[1:])
    print(minsum, maxsum)

arr = [1, 2 ,3 ,4, 5]
min_max(arr)