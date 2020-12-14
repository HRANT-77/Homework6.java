package com.company.ex7;

public class Main7 {
    public static void main(String[] args) {

//region Conver from Dram
        Dram dram = new Dram();
        dram.setValue(50000);
        CurrConverter currConverter = new CurrConverter();

        Dollar dollar= new Dollar();
        currConverter.convert(dram, dollar);
        System.out.println(dram.getValue() + " dram is " + dollar.getValue() + " dollar");

        Ruble ruble = new Ruble();
        currConverter.convert(dram, ruble);
        System.out.println(dram.getValue() + " dram is " + ruble.getValue() + " ruble");
//endregion

//region Convert from Dollar
        Dollar dollar1 = new Dollar();
        dollar1.setValue(100);

        Dram dram1=new Dram();
        currConverter.convert(dollar1, dram1);
        System.out.println(dollar1.getValue()+" dollar is "+ dram1.getValue()+" dram");

        Ruble ruble1=new Ruble();
        currConverter.convert(dollar1,ruble1);
        System.out.println(dollar1.getValue()+" dollar is "+ ruble1.getValue()+" ruble");
//endregion

//region Convert from Ruble
        Ruble ruble2=new Ruble();
        ruble2.setValue(1000);

        Dram dram2=new Dram();
        currConverter.convert(ruble2,dram2);
        System.out.println(ruble2.getValue()+" ruble is "+ dram2.getValue()+" dram");

        Dollar dollar2=new Dollar();
        currConverter.convert(ruble2,dollar2);
        System.out.println(ruble2.getValue()+" ruble is "+ dollar2.getValue()+" dollar");
//endregion

    }
}
