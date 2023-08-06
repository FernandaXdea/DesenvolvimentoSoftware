nota = 80
presenca = 70

if nota < 70 or presenca < 70:
    # pass  esse comando serve para avisar que eu sei que falta eu preencher a condição
    print("Você reprovou!!")

    if nota < 70:
        print("Tente melhorar sua nota ano que vem.")
    if presenca < 70:
        print("Você deve frequentar as aulas")
else:
    print("Você passou!!!")
    if nota == 100 and presenca == 100:
        print("aprovado com louvor.")
