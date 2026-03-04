from scipy.optimize import linprog
# Si es MINIMIZACION no hace falta poner negativo en la F.O.
# Coeficientes de la función objetivo (minimizar c^T * x)
c = [170, 160, 175, 180, 195]
# Las desigualdades deben ser del tipo <= 
# Matriz de restricciones (Ax >= b)
A = [[-1, 0, 0, 0, 0],[-1, -1, 0, 0, 0],[-1, -1, -1, 0, 0],[0, -1, -1, 0, 0], [0, 0, -1, -1, 0],[0, 0, 0, -1, 0],[0, 0, 0, -1, -1], [0, 0, 0, 0, -1]]  # matriz de coeficientes primer miembro cleanLHS
b = [-48, -79, -87, -64, -82, -43, -52, -15] # Términos independientes (lado derecho) van entre comas RHS

# Límites de las variables de decisión (x >= 0)
x_bounds = [(0, None)] * 5

# Resolver el problema de optimización lineal
result = linprog(c, A_ub=A, b_ub=b, bounds=x_bounds, method='highs')

# Imprimir la solución
print("Valor óptimo:", result.fun)
print("Variables de decisión:", result.x)