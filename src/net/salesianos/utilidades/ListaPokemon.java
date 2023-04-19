package net.salesianos.utilidades;

import net.salesianos.pokemins.general.Pokemon;

public class ListaPokemon {
    private int sizeList = 0;
    private Pokemon pokeminsList[] = new Pokemon[1];


    public ListaPokemon() {

    }

    public void addPokemins(Pokemon newPokemins) {
        pokeminsList[sizeList] = newPokemins;
        sizeList++;

        Pokemon temporaryPokeminsList[] = new Pokemon[sizeList + 1];
        for (int i = 0; i < pokeminsList.length; i++) {
            temporaryPokeminsList[i] = pokeminsList[i];

        }
        this.pokeminsList = temporaryPokeminsList;
    }

    public void deletePokemins(String pokeName) {
        int counter = 0;
        for (int i = 0; i < pokeminsList.length - 1; i++) {
            if (pokeminsList[i].getName().equals(pokeName)) {
                pokeminsList[i] = null;
                System.out.println("El pokemin ha sido borrado");
            } else {
                counter++;
                if (i == pokeminsList.length - 1) {
                    System.out.println("Mostro este pokemin no existe");
                }
            }
        }
        Pokemon temporaryPokeminsList[] = new Pokemon[counter + 1];
        int pokeNameNotNull = 0;
        for (int i = 0; i < pokeminsList.length; i++) {
            if (pokeminsList[i] != null) {
                temporaryPokeminsList[pokeNameNotNull] = pokeminsList[i];
                pokeNameNotNull++;
            }
        }
        this.pokeminsList = temporaryPokeminsList;
    }

    public void displayPokemins() {
        String msg = " ";
        for (int i = 0; i < pokeminsList.length; i++) {
            if (pokeminsList[i] != null) {
                msg += '\n' + pokeminsList[i].toString();
            }
        }
        System.out.println(msg);

    }

    public Pokemon returnPokemins(String pokeName) {
        for (int i = 0; i < pokeminsList.length; i++) {
            if (pokeminsList[i].getName().equals(pokeName)) {
                System.out.println("Mostro,no existe ese Pokemins... my frend");
                return pokeminsList[i];
            }

        }
        return null;

    }
}
