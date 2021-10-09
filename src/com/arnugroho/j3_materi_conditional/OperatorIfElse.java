/*
 * @author Akbar Riyan Nugroho
 * @Created 9-10-2021
 *
 */

package com.arnugroho.j3_materi_conditional;

import java.util.Scanner;

/*
* operator if
*
    if (Boolean exspression) {
        argument atau baris kode ketika Boolean Expression bernilai true
    } else {
	    argument atau baris kode ketika Boolean Expression bernilai false
    }

*   1. Statement if – else digunakan untuk mengatasi kondisi boolean exspression bernilai false

* */
public class OperatorIfElse {
    public static void main(String[] args) {
        System.out.println("Masukkan Nilai a : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(); /*nilai a kita inisialisasi dengan nilai hasil inputan di console*/
        scan.close();
        /*Apakah a bernilai lebih dari 6 atau sisa bagi a bernilai 0
        * Jika ya, maka akan mencetak Kondisi If
        * Jika tidak, maka akan mencetak Kondisi Else
        /*
            {1} Operator If
        */
        if (a > 6 || a % 2 == 0) {
            System.out.println("Kondisi If");
        } else {
            System.out.println("Kondisi Else");
        }



        /*Test Input, Masukkan angka :
         * 7
         * 3
         * 2
         * */
    }
}
