/*
 * @author Akbar Riyan Nugroho
 * @Created 6-10-2021
 *
 */

package com.arnugroho.j3_materi_conditional;

import java.util.Scanner;
/*
* operator if
*
    if (Boolean exspression) {
        statement atau baris kode ketika Boolean Expression bernilai true
    }

*   1. If statement menggunakan Boolean expression untuk menseleksi suatu kondisi.
*   2. Baris kode di dalam blok if dijalankan saat kondisi Boolean expression bernilai true.
*   3. Jika tidak diberi kurung kurawal ‘{}’, maka if statement hanya berlaku untuk satu baris kode di bawahnya.

* */
public class OperatorIf {
    public static void main(String[] args) {
        System.out.println("Masukkan Nilai a : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); /*nilai a kita inisialisasi dengan nilai hasil inputan di console*/
        scan.close();
        /*Apakah a bernilai lebih dari 2
        * Jika ya, maka akan mencetak Kondisi 1 Sesuai
        * Jika tidak, maka tidak akan mencetak apapun*/
        /*
            {1} Operator If
        */
        if (a > 2) {
            System.out.println("Kondisi 1 Sesuai");
        }

        /*Apakah a bernilai lebih dari 4 dan kurang dari 9
         * Jika ya, maka akan mencetak Kondisi 2 Sesuai
         * Jika tidak, maka tidak akan mencetak apapun*/
        if (a > 4 && a < 9) {
            System.out.println("Kondisi 2 Sesuai");
        }

        /*Test Input, Masukkan angka :
        * 3
        * 5
        * 2
        * */
    }
}
