/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j3_materi_conditional;

import java.util.Scanner;

public class OperatorIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); /*nilai a kita inisialisasi dengan nilai hasil inputan di console*/
        scan.close();
        /*Apakah a bernilai lebih dari 4
        * Jika ya, maka akan mencetak Kondisi a Sesuai
        * Jika tidak, maka tidak akan mencetak apapun*/
        /*
            {1} Operator If
        */
        if (a > 4) {
            System.out.println("Kondisi a Sesuai");
        }
    }
}
