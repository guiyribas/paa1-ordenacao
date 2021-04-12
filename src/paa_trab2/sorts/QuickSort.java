package paa_trab2.sorts;

public class QuickSort implements GenericSort {

    private long swaps;
    private long comparisons;

    public QuickSort() {
        swaps = 0;
        comparisons = 0;
    }

    @Override
    public int[] sort(int[] vet, int zero, int size) {
        int i= zero, j= size, pivot= vet[(i + j) / 2], y;

        while (i <= j) {
            while (vet[i] < pivot && i < size) {
                i++;
                comparisons++;
            }
            while (vet[j] > pivot && j > zero) {
                j--;
                comparisons++;
            }
            if (i <= j) {
                y = vet[i];
                vet[i] = vet[j];
                vet[j] = y;
                i++;
                j--;
                swaps++;
            }
        }

        if (j > zero) {
            sort(vet, zero, j);
        }

        if (i < size) {
            sort(vet, i, size);  
        }

        return vet;
    }

    @Override
    public long getSwap() {
        return swaps;
    }

    @Override
    public long getComparations() {
        return comparisons;
    }

}
