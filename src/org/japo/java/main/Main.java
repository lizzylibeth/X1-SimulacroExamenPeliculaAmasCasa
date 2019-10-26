/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //CONSTANTES
        final int AFORO_MAX = 500;
        final int AFORO_MIN = 0;

        //VARIABLES
        int aforo1, aforo2, aforo3, aforo4, aforo5, aforo6, aforo7;
        int aforoTotal;
        int aforoMedio;

        System.out.println("CINES DEL CENTRO COMERCIAL ");
        System.out.println(" ========================== ");

        System.out.println(" ");

        System.out.println("CONTROL DE AFORO SEMANAL ");
        System.out.println("----------------------- ");

        System.out.println(" ");

        //DIA 1
        aforo1 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 1 ...: %d personas%n", aforo1);

        //DIA 2
        aforo2 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 2 ...: %d personas%n", aforo2);

        //DIA 3
        aforo3 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 3 ...: %d personas%n", aforo3);

        //DIA 4
        aforo4 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 4 ...: %d personas%n", aforo4);

        //DIA 5
        aforo5 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 5 ...: %d personas%n", aforo5);

        //DIA 6
        aforo6 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 6 ...: %d personas%n", aforo6);

        //DIA 7
        aforo7 = RND.nextInt(AFORO_MAX - AFORO_MIN + 1) + AFORO_MIN;
        System.out.printf("Aforo día 7 ...: %d personas%n", aforo7);

        System.out.println(" ");

        aforoTotal = aforo1 + aforo2 + aforo3 + aforo4 + aforo5 + aforo6 + aforo7;
        System.out.printf("Aforo total ...: %d personas%n", aforoTotal);

        System.out.println(" ");

        aforoMedio = aforoTotal / 7;
        System.out.printf("Aforo medio ...: %d personas%n", aforoMedio);

    }//main

}//class
