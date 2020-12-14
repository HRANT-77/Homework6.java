package com.company.ex7;

public class CurrConverter {

    public Dollar convert(Dram dram, Dollar dollar) {

        dollar.setValue(dram.getValue() / 519);
        return dollar;
    }

    public Ruble convert(Dram dram, Ruble ruble) {

        ruble.setValue(dram.getValue() / 7.35);
        return ruble;
    }

    public Dram convert(Dollar dollar, Dram dram) {

        dram.setValue(dollar.getValue() * 519);
        return dram;
    }

    public Ruble convert(Dollar dollar, Ruble ruble) {

        ruble.setValue(dollar.getValue() * 70.99);
        return ruble;
    }

    public Dram convert(Ruble ruble, Dram dram) {

        dram.setValue(ruble.getValue() * 7.3);
        return dram;
    }

    public Dollar convert(Ruble ruble, Dollar dollar) {

        dollar.setValue(ruble.getValue() * 0.013);
        return dollar;
    }

}
