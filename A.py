lines = int(input())
names = []
contadores = {}

repeats = 0
for i in range(lines):
    user_input = input()[2:]
    iniciales = [palabra[0] for palabra in user_input.split()]
    siglas = "".join(iniciales).upper()
    names.append(siglas)

for elemento in names:
    if elemento in contadores:
        contadores[elemento] += 1
    else:
        contadores[elemento] = 1

sin_repeticiones = [elemento for elemento,
                    contador in contadores.items() if contador == 1]

print(len(sin_repeticiones))
