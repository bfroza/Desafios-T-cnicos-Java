def snail(matrix):
    if not matrix or not matrix[0]:
        return []
    
    result = []
    while matrix:
        result += matrix.pop(0)
        
     
        if matrix and matrix[0]:
            for row in matrix:
                result.append(row.pop())
        
        if matrix:
            result += matrix.pop()[::-1]
    
        if matrix and matrix[0]:
            for row in matrix[::-1]:
                result.append(row.pop(0))
    
    return result

matriz = [
    [1, 2, 3, 1],
    [4, 5, 6,4],
    [7, 8, 9,7],
    [7,8,9,7]
]

print(snail(matriz))  
