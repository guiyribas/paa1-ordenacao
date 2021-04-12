package paa_trab2.sorts;

public class CountingSort implements GenericSort{
    private long swaps;
    private long comparations;

    public CountingSort() {
        swaps = 0;
        comparations = 0;
    }
    
    @Override
    public int[] sort(int[] vet, int zero, int size) {
        int maior =  5000;
        int[] aux = new int[maior];
        int[] aux2 = new int[size];
        
        for(int i = 0; i < maior; i++){
            aux[i] = 0;
        }
        
        for (int i = 0; i < size; i++) {
            aux[vet[i]]++;
        }
        
        int sum = 0;
        for(int i = 1; i < maior; i++){
            int dum = aux[i];
            aux[i] = sum;
            sum += dum;
        }
        
        for(int i = 0; i < size; i++){
            aux2[aux[vet[i]]] = vet[i];
            aux[vet[i]]++;
        }
        vet = aux2;

        return vet;
    }

    @Override
    public long getSwap() {
        return swaps;
    }

    @Override
    public long getComparations() {
        return comparations;
    }

    
}
