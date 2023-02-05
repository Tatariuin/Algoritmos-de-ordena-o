package selectionsort;
import java.util.*;
public class SelectionSort {
public static void main(String[] args) {

    int[] vet = {2,1,0,1,-54};
    int[] vetAux = new int[vet.length];
    System.out.println(Arrays.toString(selectionSort(vet)));
 
}

static int[] selectionSort(int[] vet){
    int[] vetAux = new int[vet.length];
    
    for(int i = 0;i < vet.length-1;i++){
        int menor = i;
        for(int c = i;c < vet.length;c++){
            if(vet[menor] > vet[c]){
                menor = c;
            }
        }
       vet = insertion(vet, menor, i);
    }
    return vet;
    
}

static int[] insertion(int[]v,int posicaoDoElementoNoArray,int posicaoDeAlocacao){
    int ElementoDaPosicao = v[posicaoDoElementoNoArray];
    int aux = 0;
    
    for(int i = posicaoDoElementoNoArray;i > posicaoDeAlocacao;i--){
        v[posicaoDoElementoNoArray - aux] = v[posicaoDoElementoNoArray -1 - aux]; 
        aux++;
    }
    v[posicaoDeAlocacao] = ElementoDaPosicao;
    return v;
}

    
}
