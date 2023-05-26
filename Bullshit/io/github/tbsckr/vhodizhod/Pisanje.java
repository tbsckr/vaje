package io.github.tbsckr.vhodizhod;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;

public class Pisanje {
    public static void main(String[] args) {
        // 1. Določimo pot datoteke, v katero bomo pisali.
        pot = Paths.get("izhodna-datoteka.txt");

        // 2. Določimo izhodni tok za pisanje znakov
        ArrayList<Igralec> igralci = new Arraylist<Igralec>();
        igralci.add(new Igralec(1, "Novak Đoković", "Srbija", 12345));
        igralci.add(new Igralec(2, "Stefanos Cicipas", "Grčija", 11234));
        try (Writer w = Files.newBufferedWriter(pot, StandardCharsets.UTF_8, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            PrintWriter pw = new PrintWriter(w);
            pw.print("Mesto, ime in priimek, država, točke");
            for(Igralec igralec : igralci) {
                pw.println(String.join(",", new String[] {
                    igralec.getMesto()+"",
                    igralec.getImePriimek(),
                    igralec.getDrzava(),
                    igralec.getTocke()+""
                }));
            }
        } catch (IOException e) {
            System.out.println("Zgodila se je napaka: " + e.getMessage());
        }
    }
}