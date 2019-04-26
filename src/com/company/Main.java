package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<String> rice = new ArrayList<String>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");

        ArrayList<String> meat = new ArrayList<String>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggies");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("mild");
        salsa.add("medium");
        salsa.add("hot");
        salsa.add("no salsa");
        salsa.add("mild salsa, medium salsa, hot salsa");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");
        veggies.add("lettuce, fajita veggies");

        ArrayList<String> cheese = new ArrayList<String>();
        cheese.add("cheese");
        cheese.add("no cheese");

        ArrayList<String> guac = new ArrayList<String>();
        guac.add("guac");
        guac.add("no guac");

        ArrayList<String> queso = new ArrayList<String>();
        queso.add("queso");
        queso.add("no queso");

        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.add("sour cream");
        sourCream.add("no sour cream");




        for (int i = 1; i <= 25; i++){
            int riceIndex = random.nextInt(rice.size());
            int meatIndex = random.nextInt(meat.size());
            int beansIndex = random.nextInt(beans.size());
            int salsaIndex = random.nextInt(salsa.size());
            int veggiesIndex = random.nextInt(veggies.size());
            int cheeseIndex = random.nextInt(cheese.size());
            int guacIndex = random.nextInt(guac.size());
            int quesoIndex = random.nextInt(queso.size());
            int sourCreamIndex = random.nextInt(sourCream.size());
            System.out.println("Burrito " + i + ": " +
                    rice.get(riceIndex) + ", " +
                    meat.get(meatIndex) + ", " +
                    beans.get(beansIndex) + ", " +
                    salsa.get(salsaIndex) + ", " +
                    veggies.get(veggiesIndex) + ", " +
                    cheese.get(cheeseIndex) + ", " +
                    guac.get(guacIndex) + ", " +
                    queso.get(quesoIndex) + ", " +
                    sourCream.get(sourCreamIndex));
        }
    }
}
