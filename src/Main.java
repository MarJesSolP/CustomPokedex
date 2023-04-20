import net.salesianos.pokemins.general.Pokemon;
import net.salesianos.pokemins.legendario.Legendario;
import net.salesianos.utilidades.ListaPokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 7;
        ListaPokemon spottedList = new ListaPokemon();
        ListaPokemon capturedList = new ListaPokemon();
        String pokemonName, pokemonType, location, pokedescription;
        double pokeHeight, pokeWeight;
        Scanner keyboard = new Scanner(System.in);
        while (option != 6) {
            System.out.println("Elija una opción");
            System.out.println("1. Añadir un pokemon avistado");
            System.out.println("2. Añadir avistamiento legendario");
            System.out.println("3. Pasar a capturados");
            System.out.println("4. Mostrar lista de avistados");
            System.out.println("5. Mostrar listaa de capturados");
            System.out.println("6. Cerrar la Pokedex");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Introduzca el nombre del Pokemon");
                    pokemonName = keyboard.nextLine();
                    System.out.println("Introduzca el tipo");
                    pokemonType = keyboard.nextLine();
                    Pokemon pokemin = new Pokemon(pokemonName, pokemonType);
                    spottedList.addPokemins(pokemin);

                    break;
                case 2:
                    System.out.println("Introduzca el nombre del Pokemon Legendario");
                    pokemonName = keyboard.nextLine();
                    System.out.println("Introduzca el tipo");
                    pokemonType = keyboard.nextLine();
                    System.out.println("Introduzca la localización");
                    location = keyboard.nextLine();
                    Legendario legendaryPokemin = new Legendario(pokemonName, pokemonType, location);
                    spottedList.addPokemins(legendaryPokemin);
                    break;

                case 3:
                    System.out.println("Introduzca el nombre del Pokemin capturado");
                    pokemonName = keyboard.nextLine();
                    if (spottedList.returnPokemins(pokemonName) != null) {
                        capturedList.addPokemins(spottedList.returnPokemins(pokemonName));
                        for (int i = 0; i < capturedList.pokeminsList.length; i++) {
                            if(capturedList.pokeminsList[i].getName().equals(pokemonName)){
                                capturedList.pokeminsList[i].captured();
                                System.out.println("Introduzca la altura");
                                pokeHeight = keyboard.nextDouble();
                                capturedList.pokeminsList[i].setHeight(pokeHeight);
                                System.out.println("Introduzca el peso");
                                pokeWeight = keyboard.nextDouble();
                                capturedList.pokeminsList[i].setWeight(pokeWeight);
                                System.out.println("Introduzca la descripción");
                                pokedescription = keyboard.nextLine();
                                capturedList.pokeminsList[i].setDescription(pokedescription);

                            }

                        }
                        spottedList.deletePokemins(pokemonName);
                    } else {
                        System.out.println("Pokemin no encontrao");
                    }

                    break;
                case 4:
                    spottedList.displayPokemins();
                    break;
                case 5:
                    capturedList.displayPokemins();
                    break;
                case 6:

                    System.out.println("Nos vemos Mostra");
                    break;

                default:
                    System.out.println("Introduzca un valor válido");
            }
        }

    }
}