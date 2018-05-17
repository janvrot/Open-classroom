#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int choixDifficult()
{
    int difficult = 0;
    int max = 0;
    while (difficult == 0)
    {
        printf("Entrez un niveau de difficulte :\n");
        printf("1 pour un nombre entre 1 et 100\n");
        printf("2 pour un nombre entre 1 et 1000\n");
        printf("3 pour un nombre entre 1 et 10000\n");
        printf("Difficulte :");
        scanf("%d", &difficult);
        if (difficult == 1)
        {
            max = 100;
        }
        else if (difficult == 2)
        {
            max = 1000;
        }
        else if (difficult == 3)
        {
            max = 10000;
        }
        else 
        {
            printf("Entrez un niveau de difficulte valide :\n");
            difficult = 0;
        }
    }
    return max;
}

int rechercheNombre()
{
    int nombreMystere = 0;
    int nombreEntre = 0;
    int nombreCoup = 0;
    int max = 0;
    const int MIN = 1;
    srand(time(NULL));
    max = choixDifficult();
    nombreMystere = (rand() % (max - MIN + 1)) + MIN;
    while (nombreEntre != nombreMystere)
    {
        printf("Quel est le nombre ? ");
        scanf("%d", &nombreEntre);

        if (nombreMystere > nombreEntre)
        {
            printf("C'est plus !\n\n");
            nombreCoup++;
        }
        else if (nombreMystere < nombreEntre)
        {
            printf("C'est moins !\n\n");
            nombreCoup++;
        }
        else
            printf ("Bravo, vous avez trouve le nombre mystere  en %d coups!!!\n\n", nombreCoup);
    }
    return nombreCoup;
}

int main ()
{ 
    int noStop = 0;

    while (noStop == 0)
    {
        rechercheNombre();
        printf("tapez 1 pour arreter ou 0 pour continuer\n");
        scanf("%d", &noStop);
        while (noStop != 0)
        {
            printf("Pour arreter taper 1 ou 0 pour continuer\n");
            scanf("%d", &noStop);
            if (noStop == 1)
            {
                printf("Au revoir\n");
            }
        }

    }
    return 0;
}
