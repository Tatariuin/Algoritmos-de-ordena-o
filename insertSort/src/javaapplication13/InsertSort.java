package javaapplication13;
import java.util.*;
public class InsertSort {
public static void main(String[] args) {

    int[] vet = {2,1,5,4,3,3,2,0,-87,0};
    
    System.out.println(Arrays.toString(insertSort(vet)));
    
    
}
static int[] insertSort(int[] v){
    int posicaoDeAlocacao = 0;
    for(int i = 1;i < v.length;i++){
        posicaoDeAlocacao = i;
        for(int c = i-1; c > -1;c--){
            if(v[i] < v[c]){
                posicaoDeAlocacao = c;
            }
        }
        insert(v, i, posicaoDeAlocacao);
    }
    return v;
    
}

static int[] insert(int[] v,int posicaoDoeElementoNoArray,int posicaoDeAlocacao){
    
    int aux = 0;
    int aux2 = posicaoDoeElementoNoArray;
    int aux3 = v[posicaoDoeElementoNoArray];
    for(int i = posicaoDoeElementoNoArray;i > posicaoDeAlocacao;i--){
        v[ aux2 - aux] = v[aux2-aux - 1];
        aux++;
    }
    v[posicaoDeAlocacao] = aux3;
    return v;
}


}
