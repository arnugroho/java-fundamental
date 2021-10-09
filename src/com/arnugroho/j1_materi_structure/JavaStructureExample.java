

//{1}. Documentation Section
/*
 * @author Akbar Riyan Nugroho
 * @Created 5-10-2021
 * @Description : Contoh Java Structure
 */

//{2}. Package Declaration
// pengorganisasian file
// supaya menghindari conflik name
// menunjukkan lokasi file
package com.arnugroho.j1_materi_structure;

//{3}. Import Statement
// ketika kita ingin menggunakan method dari kelas lain dan beda package
import java.util.Date;

//{4}. Class Declaration
// Camel case
// Dimulai dengan huruf besar
// nama class dan nama file sama
public class JavaStructureExample {
    //{5}. Field/Global Variable
    // penamaan variable dimulai huruf kecil
    public String sayHello = "Hello World";

    //{6}. Method/Function
    public void printWelcome(String name){
        System.out.println(this.sayHello + " : " + name);
    }

    //{6}. Method/Function
    public Date getCurrentdate(){
        return new Date();
    }

    //{6}. Method/Function
    public static void main(String[] args) {
        // instantiasi Object
        JavaStructureExample example = new JavaStructureExample();
        example.printWelcome("Akbar Riyan Nugroho");
        System.out.println("Current Time : " + example.getCurrentdate());
    }
}
