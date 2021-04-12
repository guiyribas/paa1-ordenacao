package paa_trab2.sorts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ArquivoController {

    public ArquivoController() {
    }

    public void salvar(String nome, long swap, long cmp, int i, FileWriter f1,long tmp) throws IOException {     
        f1.write(nome+"\r\n");
        f1.write("tamanho do vet: " + Integer.toString(i) + " \r\n");
        f1.write("Swaps: " + swap+"\r\n");
        f1.write("comparaçoes: "+cmp+"\r\n");
        f1.write("tempo: "+tmp+"\r\n");
        f1.write("\r\n");
    }

    public int[] carregar(int i, String s) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader("/home/guiyribas/Documents/PAA/Aleatorios/"+s+"" + Integer.toString(i) + ".txt"));

        LinkedList<Integer> numeros = new LinkedList<Integer>();

        while (br.ready()) {
            String linha = br.readLine();
            numeros.add(Integer.valueOf(linha));
        }

        int[] ret = numeros.stream().mapToInt(Integer::intValue).toArray();

        return ret;
    }
}
