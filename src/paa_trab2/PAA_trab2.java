package paa_trab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import paa_trab2.sorts.ArquivoController;
import paa_trab2.sorts.CountingSort;
import paa_trab2.sorts.QuickSort;


public class PAA_trab2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int[] vet;

        // CountingSort algorithm = new CountingSort();
        QuickSort algorithm = new QuickSort();

        ArquivoController a = new ArquivoController();

        for (int i = 1; i < 21; i++) {
            File salvar1 = new File("/home/guiyribas/Documents/PAA/Resultados/" + Integer.toString(i) + ".txt");
            FileWriter f2 = new FileWriter(salvar1);
            
            algorithm = new QuickSort();
            vet = a.carregar(i,"a");
            
            long tempini, tempfim;
            
            tempini = System.currentTimeMillis();
            algorithm.sort(vet, 0, vet.length);
            tempfim = System.currentTimeMillis() - tempini;
            
            System.out.println(i + " algorithm a " + vet.length);
            
            a.salvar("algorithm", algorithm.getSwap(), algorithm.getComparations(), vet.length, f2, tempfim);
            
            f2.flush();
            f2.close();
        }
        
    }

}
