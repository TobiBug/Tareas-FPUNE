from scipy.optimize import linprog
# Si es MINIMIZACION no hace falta poner negativo en la F.O.
# Coeficientes de la función objetivo (minimizar c^T * x)
c = [-1000, -1900, -2700, -3400, -0.25]
# Las desigualdades deben ser del tipo <= 
# Matriz de restricciones (Ax >= b)
A = [[0.18, 0.28, 0.4, 0.5, -0.2125],[0, 0, 0, 0, 1],[-0.8, 0.2, 0.2, 0.2, 0],[0.1, -0.9, 0.1, 0.1, 0], [0.25, 0.25, -0.75, -0.75, 0],[50, 70, 130, 160, 2]]  # matriz de coeficientes primer miembro cleanLHS
b = [0, 300, 0, 0, 0, 15000] # Términos independientes (lado derecho) van entre comas RHS

# Límites de las variables de decisión (x >= 0)
x_bounds = [(0, None)] * 5

# Resolver el problema de optimización lineal
result = linprog(c, A_ub=A, b_ub=b, bounds=x_bounds, method='highs')

# Imprimir la solución
print("Valor óptimo:", result.fun)
print("Variables de decisión:", result.x)