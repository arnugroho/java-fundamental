

//{1}. Documentation Section
/*
 * @author Akbar Riyan Nugroho
 * @Created 5-10-2021
 * @Description : Contoh Java Structure
 */

//{2}. Package Declaration
package com.arnugroho.j1_materi_structure;

//{3}. Import Statement
import java.util.Date;

//{4}. Class Declaration
public class JavaStructureExample {
    //{5}. Field/Global Variable
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
        JavaStructureExample example = new JavaStructureExample();
        example.printWelcome("Akba Riyan Nugroho");
        System.out.println("Current Time : " + example.getCurrentdate());
    }
}
